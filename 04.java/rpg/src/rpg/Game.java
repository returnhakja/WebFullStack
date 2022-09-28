package rpg;
import java.util.Scanner;

public class Game {

	Character c;
	Item[] items;
	
	Game(){
		c = new Character("YouTube학자", 100, 50, 20, 10);
		items = new Item[10];
		items[0] = new Item("앱솔랩스 메이지슈즈", 0,0,10,5);
		items[1] = new Item("앱솔랩스 메이지글러브", 0,0,10,0);
		items[2] = new Item("앱솔랩스 메이지케이프", 0,0,10,0);
		items[3] = new Item("앱솔랩스 메이지크라운", 0,0,10,0);
		items[4] = new Item("트릭스터 던위치팬츠", 0,0,10,5);
	}
	
	public static void main(String[] args) {
		new Game().start();
	}
	private void start() {
		Scanner input = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.println("1.내정보\t2. 사냥\t0.종료");
			System.out.println("입력 :");
			num = input.nextInt();
			switch(num) {
			case 1:
				c.showInfo();
				break;
			case 2:
				hunt();
				break;
			case 0:
				System.out.println("종료");
				System.exit(0);
				break;
			}
		}
		
	}
	void hunt() {
		monster m = new monster("화염정령", 20, 10, 15, 10 , new Item[] {items[0], items[1], items[2], items[3], items[4]});
		System.out.println(m.name + "만났다. 싸워서 이겨라");
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		battle : while(true){
			System.out.println("1.공격\t2.도망");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				c.ataack(m);
				if(m.hp <= 0) {
					System.out.println(m.name + "을 처치");
					c.mp-=10;
					c.getExp(150);
					c.getItem(m.itemDrop());
					break battle;
				}
				m.attack(c);
				break;
			case 2:
				
				System.out.println("도망가냐 ㅋㅋ");
				break battle;
			}
			
		}
	}
}

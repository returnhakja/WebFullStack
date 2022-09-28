package rpg;

public class Character {
	String name;
	int hp;
	int mp;
	int maxhp;
	int maxmp;
	int satt;
	int def;
	int level;
	int exp;
	Item[]items;
	public Character(String name, int hp, int mp, int satt, int def) 
	{
		super();
		this.name = name;
		this.hp = this.maxhp;
		this.mp = this.maxmp;
		this.satt = satt;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.items = new Item[10];
	}
	
	void showInfo() {
		System.out.println("===");
		System.out.println("=상태=");
		System.out.println("닉네임 : " + name);
		
		System.out.println("레벨 : " + level + "(" + "/100)");
		System.out.println("체력 : " + hp + "/" + maxhp);
		System.out.println("마나 : " + mp + "/" + maxhp);
		System.out.println("스탯공격력 : " + satt);
		System.out.println("방어력 : " + def);
		System.out.println("=========아이템=======");
		for(int i=0; i<items.length; i++) {
			if(items[i] != null)
				System.out.println(items[i]);
		}
		System.out.println("==================");
	}
	void ataack(monster m) {
		int damage = 0;
		if(satt> m.def) {
			damage = satt - m.def;
		}else if(satt == m.def) {
			damage =1;
		}
		m.hp -= damage;
		System.out.println(damage);
	}
	void getExp(int exp) {
		System.out.println(exp + "경험치 획득");
		this.exp += exp;
		while(100 <= this.exp) {
			levelUP();
			
			this.exp -=100;
			
		}
	}
	void levelUP() {
		level++;
		maxhp+=10;
		maxmp+=5;
		satt += 2;
		def += 2;
		hp = maxhp;
		mp = maxmp;
		System.out.println("렙업");
	}
	void getItem(Item item) {
		System.out.println(item.name +"을 획득하였습니다");
		for(int i=0; i<items.length; i++) {
			if(items[i] == null) {
				items[i] = item;
				break;
			}
		}
		maxhp += item.hp;
		maxmp += item.mp;
		satt += item.satt;
		def += item.def;
		
		
	}
}

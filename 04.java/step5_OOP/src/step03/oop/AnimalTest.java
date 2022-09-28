package step03.oop;


class Animal{
	
	public void move() {
		System.out.println("Animal Move");
	}
	
	public void eating() {
		
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("Human Move");
	}
	
	public void readBooks() {
		System.out.println("Human Read books");
	}
}

class Tiger extends Animal{
	
	public void move() {
		System.out.println("Tiger Move");
	}
	
	public void hunting() {
		System.out.println("Tiger Hunt");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("Eagle Move");
	}
	
	public void fly() {
		System.out.println("Eagle Fly");
	}
}

public class AnimalTest {
	// public void downCasting(animalArray)
	// instanceof : 객체의 타입 확인
	// - 문법 : 객체 instanceof타입
	// - 결과 : boolean
	public static void downCasting(Animal[] animalArray) {
		for(int i=0; i<animalArray.length ; i++) {
			Animal animal = animalArray[i];
			
			if(animal instanceof Human) {
				((Human) animal).readBooks();
			}else if(animal instanceof Tiger) {
				((Tiger) animal).hunting();
			}else if(animal instanceof Eagle) {
				((Eagle) animal).fly();
			}else {
				System.out.println("error");
			}
		}
	}

	public static void main(String[] args) {
		
		// UpCastion : 자식이 부모 타입으로 형변환 하는것
		Animal human = new Human();
		
		// DownCasting : 부모 타입으로 생성된 자식 객체가 자신의 타입으로 형변환 하는 것
		Human human1 = (Human)human; //자기 자신의 타입으로 바꿔줌
//		human.move();
//		human1.readBooks();
//		human.readBooks();
		
		Animal tiger = new Tiger();
		Tiger tiger1 = (Tiger)tiger;
//		tiger.move();
//		tiger1.hunting();
		
		Animal eagle = new Eagle();
//		eagle.move();
//		eagle.fly();
		
		
		
		
		//자식 객체는 자식 타입으로 생성 가능
		//부모 객체는 부모 타입으로 생성 가능
		// 자식 객체는 부모 타입으로 생성 가능
		//부모 객체는 자식 타입으로 생성 불가능
		
		//
		Animal[] animalArray = {human, tiger, eagle};
		for(Animal animal : animalArray) {
			animal.move();
		}
		
		downCasting(animalArray);
		

		
		
		
		
	}

}

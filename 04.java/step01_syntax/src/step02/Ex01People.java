package step02;

public class Ex01People {
	//멤버 변수(필드)
	String name = "Java";
	int age = 27;
	//생성자 : 객체 생성시, 필수 요소
	// 클래스의 이름과 동일 할 것
	Ex01People(){
		
	}
	
	
	
	// 매게변수가 있고 없고, 반환값이 있는지 없는지에 기준을 두고 함수를 나눔
	// 메소드
	// name반환 메소드
	// 1. 메소드 명 : getName
	// 2. 반환값 유무
	String getName() {
		return name;
	}
	int getAge(){
		return age;
	}
	// 단순 출력("단순 출력 메소드 ") 메소드
	// 1. 메소드명
	// 2. 반환값 유무 : void (반환 타입 없음)
	void print(){
		System.out.println("단순 출력 메소드");
	}
	
	
	public static void main(String[] args) {
		Ex01People pp11 = new Ex01People();
		System.out.println(pp11);//step02.Ex01People@15db9742 (주소값이 나옴)
		System.out.println(pp11.name);  //Java
		System.out.println(pp11.age); // 27
		System.out.println(pp11.getName()); //java
		pp11.print();
		
	}
}

package step02;

public class Ex02People {
	//멤버 변수(필드)
	String name = "Java";
	int age = 27;
	//생성자 : 객체 생성시, 필수 요소
	// 클래스의 이름과 동일 할 것
	Ex02People(){
		
	}
	
	
	// 사용자 정의 생성자 : 객체 생성 시 , 초기화 - 생성자 오버로딩(Overloading)
	// 반환값, 형태 같으나 매개변수의 갯수가 다른 생성자를 만들 경우
	public Ex02People(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
				
	}
	public Ex02People(String name) {
		this.name = name;
	}



	// 매게변수가 있고 없고, 반환값이 있는지 없는지에 기준을 두고 함수를 나눔
	// 메소드

	String getName() {
		return name;
	}
	int getAge(){
		return age;
	}
	// 단순 출력("단순 출력 메소드 ") 메소드
	
	void print(){
		System.out.println("단순 출력 메소드");
	}
	
	
	public static void main(String[] args) {
		Ex02People ppl1 = new Ex02People();
		System.out.println(ppl1); 
		System.out.println(ppl1.name);  
		System.out.println(ppl1.age); 
		System.out.println(ppl1.getName()); 
		ppl1.print();
		
		// pp11의 이름을 New Java 으로 변경하고자 한다면?
		ppl1.name = "New Java";
		System.out.println(ppl1.getName()); // New Java
		ppl1.age = 292;
		System.out.println(ppl1.age); // 292
		
		
		// pp12
		Ex02People ppl2 = new Ex02People();
		// 두가지 다른 객체임
//		System.out.println(ppl1.hashCode());
//		System.out.println(ppl2.hashCode());
		System.out.println(ppl2.name);
		ppl2.name = "New Java2";
		System.out.println(ppl2.name);
		
		// ppl3 (만들어질때마다 똑같은 초기값으로 만들어짐) 내부적으로 값을 자체적으로 가지고 있는 상태에서 만들고 싶으면?
		Ex02People ppl3 = new Ex02People("Java3", 45);
		System.out.println(ppl3.name);
		System.out.println(ppl3.age);
		
		// ppl4
		Ex02People ppl4 = new Ex02People("Java4");
		System.out.println(ppl4.name);
		System.out.println(ppl4.age);
	}
}

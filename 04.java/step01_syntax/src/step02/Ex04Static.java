/*
 * static(정적)
 * -클래스의 소속
 * - 객체 생성 없이도 사용 가능
 * - 사용 :
 * */
package step02;

public class Ex04Static {
	// 멤버 변수와 static 멤버 변수
	String name; 
	static String company = "busan";
	// 변하면 안되는 수 = 상수 (final, static) - 대문자 , 언더바
	
	// static 초기화 블럭 
//	static {
//		company = "busan";
//	}
//	double PI = 3.14; // 이렇게 선언하면 PI를 멤버변수처럼 사용해서 값을 변경할 수 있다.
//	final double PI = 3.14;
	static final double PI = 3.14; // 메모리 낭비를 막기 위해 static을 붙여줌
	// 사용자 정의 생성자
	Ex04Static(String name){
		this.name = name ;
	}
	static void print() {
		System.out.println("static 메소드로 선언");
		
	}

	public static void main(String[] args) {
		Ex04Static ppl1 = new Ex04Static("Java");
		System.out.println(ppl1.name);
		System.out.println(company); // static으로 선언하면 생성자객체를 만들지 않고 접근을 할 수있다.
		
//		ppl1.PI = 5.16; // 오류가 나지 않음 , final을 사용햇을 경우 오류가 난다
		System.out.println(PI);
		print();
	}

}

package test;

class Person{
	private String personName = "person";
	public void method1() {
		System.out.println("person");
	}
}
class Student extends Person{
	private String studentName = "student";
	public void method1() {
		System.out.println("student");
	}
	public void method2() {
		super.method1();
	}
}

public class Test1 {
	public static void main(String[] args) {
		
		// Test1-1 객체 생성 방법이 잘못된 부분과 그 이유는? 
		Student student1 = new Student();
		Person student2 = new Student();
		Person person1 = new Person();
//		Student person2 = new Person(); //오류
		//자식은 부모껄로 만들수 없습니다.
		
		
		// Test1-2 student3에서 자식의 메소드 호출하고 student4에서 부모의 메소드를 호출하려면?
		Person student3 = new Student();
		Student student4 = new Student();

		student3.method1();
		student4.method2();
		
	}
}

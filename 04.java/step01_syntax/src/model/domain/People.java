/* 도메인 모델 (Domain Model)
 * - 객체 지향 분석 설계 기반으로 구현하고자 하는 비즈니스 영역의 모델을 생성하는 패턴(재사용해서 사용가능)
 * - 속성 , 기능 분리
 * - 단순 : 하나의 도메인 객체가 의미 하는 바 ? 
 * -> 테이블 하나
 * */
package model.domain;

public class People {
	
	// 멤버변수 (필드)
	// 캡슐화(Capsualtion)
	private String name;
	private int age;
	
	//생성자
	public People(){
		
	}
	public People(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//get 메소드 , getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	// set 메소드 , setter
	public void setAge(int age) {
		if(age >= 0) {
			this.age = age;
		}else {
			System.out.println("입력한 나이는 유효하지 않음");
		}
	}
	public void setName(String name) {
		this.name = name;
	}
}

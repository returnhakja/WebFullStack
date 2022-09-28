package step02;

import model.domain.People;

public class Ex05Access {

	public static void main(String[] args) {
		People ppl1 = new People("Java", 27);
		
//		ppl1.name 으로 접근이 불가능 왜? People에서 public이 선언되어 있지 않아서
//		System.out.println(ppl1.name); //모델에서 public 붙여줌
		// name에 private가 선언되어 접근이 불가능함
//		ppl1.age =  30;
//		System.out.println(ppl1.age);
		ppl1.setAge(100);
//		System.out.println(ppl1.age);
		
		ppl1.getName();
		
		
	}	

}

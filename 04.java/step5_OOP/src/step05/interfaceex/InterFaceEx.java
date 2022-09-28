package step05.interfaceex;

public interface InterFaceEx {
	// 상수로 사용할 수 있도록 구성
	// 상수 : public static final --> 붙여주지 않아도 인터페이스에서는 상수만 사용이 가능하기 때문에 자동인식
	int AGE = 25; // 대문자로 적어줄 시 상수
	
	
	//인터페이스내에서 사용되는 메소드는 모두 추상메소드로 사용하여야 한다.
	// 메소드 : 추상메소드 - 코드 블럭은 없음
//	int getAge() {
//		return age;
//	}
	// 위의 코드를 ↓ 수정 
	int getAge();
}

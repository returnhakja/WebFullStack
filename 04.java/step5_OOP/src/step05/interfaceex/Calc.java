package step05.interfaceex;

public interface Calc {
	double PI = 3.14; //public static final은 자동 인식 (생략)
	int ERROR = -999999999; // 수학적인 처리를 했을 경우 에러인식
	
	int add(int x, int y);
	int sub(int x, int y);
	int times(int x, int y);
	int divide(int x, int y);
	
	// java8 버전 이후 만들어짐
	// default 메소드
	default void turnOn() {
		System.out.println("온");
	}
}

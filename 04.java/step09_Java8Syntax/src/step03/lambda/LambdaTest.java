package step03.lambda;

public class LambdaTest {
	
	interface LamdaInter1 {
		void method();
	}
	interface LamdaInter2 {
		void method(int x);
	}
	
	// 함수형 인터페이스 어노테이션
	@FunctionalInterface
	interface LamdaInter3 {
		int method(int x, int y);
//		int method2(int x, int y);
	}
	
	// 직접 해보기?
	@FunctionalInterface
	interface Calculation {
		int operation(int v1, int v2);	
	}
	
	private static int operation(int v1, int v2, Calculation cal) {
//		System.out.println(cal.operation(v1, v2));
		return cal.operation(v1, v2);
}
	

	
	
	public static void main(String[] args) {
		// 람다1 : 매개 변수 없는 람다식
		LamdaInter1 li1;
		li1 = () -> {
			System.out.println("람다식");
		};
		System.out.println(li1);
		li1.method();
		
		
		// 람다2 : 매개변수가 있는 람다식, 매개 변수가 1개 일 때 괄호, 자료형 생략가능
		LamdaInter2 li2;
//		li2 = (int x) ->{
//			System.out.println(x+1);
//		};
		li2 = x ->	System.out.println(x+1);
		
		System.out.println(li2);
		li2.method(6);
		
		// 람다3 : 매개 변수가 2개일때는 매개변수 괄호는 생략 불가능
		// method2가 있을 때에는 에러 발생 -> 어떤 것을 구현하는지 모호하기 때문 , 형태가 달라도 애초에 발생할 수 있는 오류 방지하기 이해 에러를 발생시킴
		// 따라서 함수형 인터페이스는 하나의 메소드만 구현하도록 설계되어있다
		LamdaInter3 li3;
		li3 = (x,y) ->{
			return x+y;
		};
		
		
		// 직접해보기 ?
	
		Calculation add = (v1, v2) -> v1 + v2;
		Calculation sub = (v1, v2) -> v1 - v2;
		Calculation mul = (v1, v2) -> v1 * v2;
		Calculation div = (v1, v2) -> v1 / v2; 
		
		
		System.out.println(operation(5, 5, add)); // 10
		System.out.println(operation(5, 5, sub)); // 0
		System.out.println(operation(5, 5, mul)); // 25
		System.out.println(operation(5, 5, div)); // 1
		
		// 클래스 + 인터페이스 vs 람다식 구현 차이를 비교
		
		// 두가지 문자열을 연결하고, ! 기호를 붙이는 인터페이스 vs 람다식
		String str1 = "Hello";
		String str2 = "java";
		
		// 클래스 + 인터페이스 
		BangMarkImpl bangMark1 = new BangMarkImpl();
		bangMark1.addBangMark(str1, str2);
		
		
		// 람다식
		BangMark bangMark2 = (s1, s2) -> System.out.println(s1 + " " + s2 + "!");
		bangMark2.addBangMark(str1,str2);
		
		// 람다식은 내부적으로 내부 익명 클래스가 적용된 것
		BangMark bangMark3 = new BangMark() {
			
			@Override
			public void addBangMark(String str1, String str2) {
				System.out.println(str1 + " " + str2 + "!");
				
			}
		};
		bangMark3.addBangMark(str1, str2);
		
		
		
	}



}

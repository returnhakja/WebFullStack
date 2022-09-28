package step02.innerclass;

class OutClass {
	int outerNumber = 100;
	static int staticOutNumber = 200;
	
	// 지역 클래스
	Runnable getRunnable(int i) {
		int number = 100;
		
//		class MyRunnable implements Runnable{
		return new Runnable() { //처음부터 return
			int localNumber = 10;
			
			@Override
			public void run() {
				//외부 클래스 모두 사용 가능
				System.out.println("외부 클래스, 인스턴스 변수 = " + outerNumber);
				System.out.println("외부 클래스, static 변수 = " + staticOutNumber);
				
				// 값을 변경시킬 수 없음 final로 지정되어 있음
//				i = 100;  // final : 값 변경되지 않음 , 상수 풀 메모리에 계속 존재하는것과 같음
//				number = 1000;
				
				
				//따라서 getRunnable 이라고 하는 메소드가 호출되어 끝났다 할지라도  run 메소드 내부에서 계속해서 호출하여 사용할 수 있음
				
				System.out.println("외부 클래스, 매개변수" + i); //외부클래스에 있는 메소드의 매개변수가 들어옴
				System.out.println("메소드, 지역변수"+number); //메소드 내부에 있는 지역변수
				System.out.println("지역 클래스, 인스턴스변수" +localNumber); //지역 클래스에 있는 인스턴스 변수 
			}
			
		};
		
//		return new MyRunnable(); // 어짜피 지역클래스인데 외부에서 사용되지 않음. 따라서 return을 따로 해줄 필요가 없음
	}
	
	//익명 클래스
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
			
		}
	};
}

public class LocalAnomousInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass out = new OutClass();
		Runnable runner = out.getRunnable(10);
		runner.run();
		
		// 
		out.runner.run();
	}

	
}

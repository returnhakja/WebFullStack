package step01;


// Runnable 인터페이스를 통한 Thread 객체 생성
public class Ex02Runnable implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i+" 번 실행");
		}
	}
	public static void main(String[] args) {
		Runnable runnable1 = new Ex02Runnable();//얘는 main
//		runnable1.run();
		
		Thread thread1 = new Thread(runnable1); //클래스에서 만든 runnable처럼 사용가능
//		thread1.start();
		
		Runnable runnable2 = new Ex02Runnable();//얘는 main
//		runnable1.run();
		
		Thread thread2 = new Thread(runnable2); //클래스에서 만든 runnable처럼 사용가능
//		thread1.start();
		
		// 순위(Priority) 할당 : 기본값은 5, 1~10 까지 가질 수 있는데 MAX_PRIORITY는 10임
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		thread2.start();
	}


}

package step01;

public class Ex01Thread extends Thread{
	//Thread 클래스를 통한 생성
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i+" 번 실행");
		}
	}

	public static void main(String[] args) {
		Ex01Thread thread1 = new Ex01Thread(); 
		thread1.start();
		thread1.setName("스레드1");
		Ex01Thread thread2 = new Ex01Thread(); 
		thread2.start();
		thread1.setName("스레드2");
//		System.out.println("---------");
//		thread1.run();
//		System.out.println("---------");
//		thread2.run();
		System.out.println(Thread.currentThread().getName());
		
	}

}

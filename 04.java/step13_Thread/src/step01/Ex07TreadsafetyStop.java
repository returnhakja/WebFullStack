package step01;

public class Ex07TreadsafetyStop extends Thread{

	public Ex07TreadsafetyStop(ThreadGroup threadGroup, String threadName) {
		super(threadGroup,threadName);
	}



	public Ex07TreadsafetyStop() { }



	@Override
	public void run() {
		while(true) {
			System.out.println("스레드 실행중");
			
			if(Thread.interrupted()) {
				System.out.println("---스레드 종료---");
				break;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Ex07TreadsafetyStop thread = new Ex07TreadsafetyStop();
		thread.start();
		
		try {
			Thread.sleep(1000);
			thread.interrupt();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		//스레드 그룹화
		ThreadGroup busan = new ThreadGroup("busan");
		Ex07TreadsafetyStop thread1 = new Ex07TreadsafetyStop(busan, "thread1");
		Ex07TreadsafetyStop thread2 = new Ex07TreadsafetyStop(busan, "thread1");
		Ex07TreadsafetyStop thread3 = new Ex07TreadsafetyStop(busan, "thread1");
		
		busan.interrupt(); //한번에 종료
	}

}

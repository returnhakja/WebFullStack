package step01;

class ThreadA extends Thread {
	private boolean stop = false;
	private boolean flag = true;
	
	public void setFlag(boolean flag) { //불리언 타입으로 외부에서 flag를 받아옴
		this.flag = flag;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
	
	@Override
	public void run() {
		while(!stop) {
//			System.out.println(Thread.currentThread());
			if(flag) {
				System.out.println("ThreadA 작업중");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}


class ThreadB extends Thread {
	private boolean stop = false;
	private boolean flag = true;
	
	public void setFlag(boolean flag) { //불리언 타입으로 외부에서 flag를 받아옴
		this.flag = flag;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
	
	@Override
	public void run() {
		while(!stop) {
			if(flag) {
				System.out.println("ThreadB 작업중");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

class SumThread extends Thread {
	private int sum;
	public int getSum() {
		return sum;
	}
	@Override
	public void run() {
		for(int i = 1; i<= 100; i++) {
			sum += i;
		}
	}
}




public class Ex05ThreadControl {

	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();//객체생성
		ThreadB threadB = new ThreadB();//객체생성
		
//		threadA.start();
//		threadB.start();
		
		//Thread B만 실행?
//		threadA.setFlag(false);
		
		//여기서 Thread A의 상태는 ? 러너블 상태
		
		// Thread A, B 종료
//		threadA.setStop(true);
//		threadB.setStop(true);
		
		//
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			//join -> main스래드는 일시정지가 된 상태가 된다 -> join을 걸어준 sumThread의 실행이 끝나면 다시 실행이 된다
			sumThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Total Sum =" + sumThread.getSum());
		
		
		
	}

}

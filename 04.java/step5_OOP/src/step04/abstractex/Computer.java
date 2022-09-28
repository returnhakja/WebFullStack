package step04.abstractex;

public abstract class Computer {
	
	abstract void display();
	
	public void turnOn() {
		System.out.println("전원을 켬");
	} 
	public void turnOff() {
		System.out.println("전원을 끔");
	}
}

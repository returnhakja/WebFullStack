package step04.template;

public abstract class Car {
	
	abstract void drive();
	abstract void stop();
	
	public void turnOn() {
		System.out.println("시동검");
	}
	public void turnOff() {
		System.out.println("시동끔");
	}
	
	final public void run() {
		turnOn();
		drive();
		stop();
		turnOff();
	}
}

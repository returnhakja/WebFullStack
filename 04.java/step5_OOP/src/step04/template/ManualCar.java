package step04.template;

public class ManualCar extends Car{

	@Override
	void drive() {
		System.out.println("니가 운행하셈");
	}

	@Override
	void stop() {
		System.out.println("니가 멈추셈");		
	}

}

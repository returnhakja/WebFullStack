package step04.template;

public  class AICar extends Car{

	@Override
	void drive() {
		System.out.println("자율 주행 ㄱ");
	}

	@Override
	void stop() {
		System.out.println("자율 주행 ㄴ");
	}
	
}

package step03;

import model.domain.Car;

public class CarFactory {
	   
    String createCar;
	private static CarFactory instance = new CarFactory();

    public String getCreateCar() {
        return createCar;
    }

    public void setCreateCar(String createCar) {
        this.createCar = createCar;
    }

	public static CarFactory getInstance() {

		return instance;
	}

	public Car createCar() {
		return new Car();
	}
}
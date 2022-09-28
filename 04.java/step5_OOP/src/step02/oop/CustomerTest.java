package step02.oop;

public class CustomerTest{

	public static void main(String[] args) {
		Customer customerCentum = new Customer(10001, "hihello");
//		customerCentum.setCustomerId(10001);
//		customerCentum.setCustomerName("Centum");
		customerCentum.setBonusPoint(1000);
		customerCentum.showCustomerInfo();
		VIPCustomer customerSuyeong = new VIPCustomer(10002, "냉정하게");
//		customerSuyeong.setCustomerId(10002);
//		customerSuyeong.setCustomerName("수영");
		customerSuyeong.setBonusPoint(1000);
		
		System.out.println(customerCentum.showCustomerInfo());
		System.out.println(customerSuyeong.showCustomerInfo());
		System.out.println("");
		System.out.println(customerCentum.calcPrice(1000));
		System.out.println(customerSuyeong.calcPrice(1000));
	}

}


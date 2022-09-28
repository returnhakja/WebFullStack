package step06.practice;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		
	}

}

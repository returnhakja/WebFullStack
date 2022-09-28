package step02.oop;

// 고객
// 고객 ID, Name, Grade, BonusPoint, BonusRatio
// int calcPrice(int pirce), String showCustomerInfo() - Name, Grade, Point

public class Customer {
	protected int customerId;
	protected String customerName;
	protected String customergrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
//	//추가 개발 하면? (상속할꺼임)
//	private String staffId; 
//	private double saleRatio; //할인율

	
	
	public Customer() {
		customergrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer 생성자 호출");
	}
	
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		
		customergrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomergrade() {
		return customergrade;
	}
	public void setCustomergrade(String customergrade) {
		this.customergrade = customergrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
	// showCustomerInfo
	public String showCustomerInfo() {
		return customerName + "님의 등급은" + customergrade + "이고, 보너스 포인트는" + bonusPoint + "임";
	}
	public int calcPrice(int price) {
		
		//추가 개발 한다면? (상속할꺼임)
//		if("SILVER".equals(customergrade)) {
//		bonusPoint += price * bonusRatio;		
//	}else if ("VIP".equals(customergrade)) {
//		bonusPoint += price * bonusRatio;		
//		price -= (int)(price * saleRatio);
//	}
		bonusPoint += price * bonusRatio;
		return price;
	}
}

/* 제품 구입시 10% 할인된 가격으로 제공
 * 보너스 포인트는 제품 가격의 5% 적립
 * staffId 배정
 * */
package step02.oop;

public class VIPCustomer extends Customer{
//	private int customerId;
//	private String customerName;
//	private String customergrade;
//	private int bonusPoint;
//	private double bonusRatio;
	private String staffId; 
	private double saleRatio;
	
	public VIPCustomer() {
//		super();
		//private로 해주면 상속해도 못씀 protected로 변경해줘야함
		customergrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIP 생성자 호출");
	}

	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		customergrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	
	// 메소드 오버라이딩 (부모에게서 받은 기능을 바꿔준것)
	// 전제 조건 : 반환타입 메소드명(매개변수)가 모두 100% 동일한 경우에만
	@Override
	public int calcPrice(int price) {
//		bonusPoint += price * bonusRatio;
//		return price;
		//return super.calcPrice(price); (위 두줄을 한번에 쓸 수 있음)
		bonusPoint += price * bonusRatio;
		price = (int)(price - price*saleRatio);
		return price;
	}

}

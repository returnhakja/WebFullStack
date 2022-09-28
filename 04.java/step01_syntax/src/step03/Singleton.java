/* 싱글톤 패턴(
 * */
package step03;

public class Singleton {
	//멤버 변수 필드
	private static Singleton instance = new Singleton(); //두번째
	//private 생성자
	 private Singleton(){} //첫번째
	 
	//메소드(getInstance) : 내부에서 생성된 객체를 공유 하도록 설정
	public static Singleton getInstance() {
		
		return instance;
		
	}
	public static void getName() {
		
	}
}

package step01_exception;

class Info{
	static {
		System.out.println("info class");
	}
}


public class Ex02Exception {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			Class.forName("step01_exception.Info");
//			Class.forName("Info");
			System.out.println(2);
		} catch (ClassNotFoundException e) {
			System.out.println(3);
			e.printStackTrace();
		} finally {
			System.out.println("님은 항상 실행하셈");
		}
		
		//catch문 순서, multi-catch
		
		try {
		// java.lang.NullPointerException
		String str1 = null;
		System.out.println(str1.length());
		
		// java.lang.NumberFormatException
		String str2 = "three";
		Integer.parseInt(str2);
		} 
//		catch(NumberFormatException e) {
//			System.out.println("NullPointerException");
//		} catch(NullPointerException e) {
//			System.out.println("NumberFormatException");
//		}
		
		// 이렇게도 되나 좋은방법은 아니다
//		catch(NullPointerException | NumberFormatException e) {
//			System.out.println("Exception");
//		} 
		// Exception 을 상속하여 한번에 처리해줄 수 도 있음
		catch(Exception e) {
			System.out.println("Exception");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}

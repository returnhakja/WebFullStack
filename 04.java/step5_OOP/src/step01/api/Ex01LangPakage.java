package step01.api;

class Busan {
	public int num;
	
	public Busan(int num) {
		this.num = num;
		System.out.println("Busan" + num + "가 생성");
	}
	public void finalize() {
		System.out.println("Busan" + num + "가 제거");
	}
}

public class Ex01LangPakage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj1 = new Object();
		Object obj2 = new Object();
		
//		System.out.println(obj1.toString());
//		System.out.println(obj2.toString());
//		System.out.println(obj1);
		// equals : 동일 객체 비교 결과 반환
//		System.out.println(obj1.equals(obj2)); //false
		
		//System 클래스
		//getProperty;
//		System.out.println(System.getProperty("java.home"));
		
		// gc : 쓰레기 수집기
//		Busan busan;
//		
//		busan = new Busan(1);
//		busan = null;
//		busan = new Busan(2);
//		busan = new Busan(3);
////		System.out.print("busan 참조 :"+ busan);
//		System.gc();
		
		//String 클래스
		//equals : 문자열의 내용을 비교
		
		//charAt : 지정 인덱스의 위치 문자를 반환
		String str1 = "java API";
		System.out.println(str1.charAt(5)); //A
		//length : 문자열의 길이를 반환
		System.out.println(str1.length());//8
		
		
		// 대소문자 변경 
		System.out.println(str1.toLowerCase());  // java api
		System.out.println(str1.toUpperCase()); // JAVA API
		
		//substring : 지정 위치에서 또 다른 위치의 잘라낸 문자열을 반환
		System.out.println(str1.substring(0)); // java API
		System.out.println(str1.substring(1,6)); //ava A
		
		//replace : 변경 대상 문자열 -> 지정문자열로 변경된 결과 반환
		System.out.println(str1.replace("java", "자바")); //자바 API
		
		//trim : 문자열의 앞, 뒤 빈 공백 제거한 결과 반환
		String str2 = "   Java API   ";
		System.out.println(str2); //   Java API
		System.out.println(str2.trim()); //Java API
		
		// split : 특정 구분자를 기준으로 분리된 문자열 결과 반환 (무엇을 반환하는지 알아야 함)
		String str3 = "Java API String Test";
		System.out.println(str3.split(" ")); //[Ljava.lang.String;@15db9742
		for(String str : str3.split(" ")) {
			System.out.println(str); 
		}
		
		//StringBuilder 클래스
		String str4 = "abc";
		System.out.println(str4.hashCode());
		str4 += "def";
		System.out.println(str4.hashCode());
		
		StringBuilder sb = new StringBuilder("abc");
		System.out.println(sb.hashCode());
		sb.append("def");
		System.out.println(sb.hashCode());
		//위와 아래가 다른 이유는 위의 코드는 주소값이 달라져서 다른 객체이지만 Bulder를 이용했을 경우엔 주소값이 같은 객체임
		
		//Wrapper 클래스 : 기본타입의 값을 갖는 객체 생성
		
		// 박싱(Boxing)
		Integer intgr1 = new Integer(1);
		String strInt1 = "1";
		// 언박싱(Unboxing)
//		intgr1.valueOf(1);
		System.out.println(intgr1.intValue()); //기본타입으로 변경
		
		System.out.println(intgr1.getClass());
		System.out.println(strInt1.getClass());
		System.out.println(strInt1); 
		System.out.println(intgr1);
		System.out.println("-------------");
		// 자동 박싱 / 언박싱
		Integer intgr2 = 2;
		System.out.println(intgr2.getClass());
		
		int intgr3 = intgr2;
		System.out.println(intgr3);
		
		
		
		System.out.println("-------------");
		// parse : 문자열을 기본타입으로 변환
		System.out.println(Integer.parseInt("3"));
		System.out.println(Double.parseDouble("3"));
//		System.out.println(Integer.parseInt("three")); // 바꿀 수 없음
		System.out.println("-------------");
		// Math 클래스 : 수학적 계산을 위한 클래스
		// abs : 절대값
		System.out.println(Math.abs(-125)); //125
		System.out.println("-------------");
		// ceil : 올림값, floor : 내림값, round : 반올림값
		System.out.println(Math.ceil(3.4));
		System.out.println(Math.ceil(3.6));
		System.out.println(Math.floor(3.4));
		System.out.println(Math.floor(3.6));
		System.out.println(Math.round(3.4));
		System.out.println(Math.round(3.6));
		
		
		
		
	}

}

package step01_syntax;

public class Ex02Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본타입 (primitive)타입
		// 타입 변수명 = 값;
		// 정수 : -2 ^(n-1) ~ 2^(n-1)-1
		// n : 비트수 
		
		// 1. 정수
		byte vb1 = -128;
//		byte vb2 = 128;  byte는 -128 ~ 127 까지
		short vs2 = 128; // type을 byte가 아닌 short 로 변경
		System.out.println(vb1);
		System.out.println(vs2);
		
		int vi1 = 10;
		int vi2 = 0B1010; //2진수 : 0B+2진수
		int vi3 = 012; //8진수 : 0+8진수
		int vi4 = 0XA; //16진수 : 0X+16진수;
		System.out.println(vi1);
		System.out.println(vi2);
		System.out.println(vi3);
		System.out.println(vi4);
		
		long vl1 = 10;
//		long vl2 = 10000000000L; 
		// 10000000000 을 했을 때는 오류가 발생하지만 L을 붙이면 오류가 발생하지 않음 
		//그 이유는 ? int로 인식하고 있어서 L을 붙여서 표현함
		System.out.println(vl1);
		
		
		// 2. 실수 : float, double
		float vf1 = 3.14f;
		double vd1 = 3.14;
		System.out.println(vf1);
		System.out.println(vd1);
		
		// 3. 문자 : char(16bit)
		char vc1 = 'B';
		char vc2 = 65; 
		char vc3 = '\u0041';
		System.out.println(vc1);
		System.out.println(vc2);	
		System.out.println(vc3);	
		
		// 논리 : boolean(8bit)
		boolean isTrue = true;
		boolean isFalse = false;
		System.out.println(isTrue);
		System.out.println(isFalse);
		
	}

}

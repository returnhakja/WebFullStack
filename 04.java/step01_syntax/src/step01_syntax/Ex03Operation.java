package step01_syntax;

public class Ex03Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자 연산 : +, -, * , / , %
		int v1 = 10;
		int v2 = 3;
		System.out.println(v1+v2); // 13
		System.out.println(v1-v2); // 7
		System.out.println(v1*v2); // 30
		System.out.println(v1/v2); // 3
		System.out.println(v1%v2); // 1
		
		// 증감연산 ++, --
		System.out.println(++v1); // 11
		System.out.println(v1++); // 11
		System.out.println(v1); //12
		
		// 기본연산(정수 타입의 기본연산은 int) 
		byte v3 = 10;
		byte v4 = 3;
		byte v5 = (byte) (v3 + v4);
		
		System.out.println("byte 기본연산 : "+ v5); //13
		System.out.println(v3 / v4); // 3
		
		
		double v7 = 10;
		double v8 = 3;
		
		double v6 = (double) (v7/v8);
		System.out.println(v6);
		double result2 = (double) v3/v4;
		System.out.println("실수형 변환 : " + result2);
		
		// Not a Number
		System.out.println((5%0.0) + 2); // NaN
		
		// 논리 연산 : &, | , ^, 
		boolean isTrue = true;
		boolean isFalse = false;
		
		// & (둘다 T일때 T)
		System.out.println(isTrue & isTrue); //True
		System.out.println(isTrue & isFalse); //FaSlse
		
		//두가지 차이는 ?
		// &(비트연산자) -> 두가지 조건을 모두 검사하고 결과를 출력한다
		// &&(논리연산자) -> 왼쪽 조건만 검사하고 결과 출력
		System.out.println(isTrue & isFalse); //False
		System.out.println(isTrue && isFalse); //False
		
		// | , || 
		
		// ^ : 연산 결과 하나는 true, 다른하나는 false --> true
		System.out.println(isTrue ^ isFalse); //true
		
		//  ! : 논리값을 변경(true -> false , false -> true)
		
		System.out.println(!isTrue); //false
		
		// 비교 연산 : < , <= , >, >= , ==, !=
		int num1 = 1;
		int num2 = 10;
		System.out.println(num1 == num2); //false
		System.out.println(num1 != num2); //true
		
		double num3 = 1.0;
		
		// 타입은 다르지만 1과 1.0은 같은 값으로 인식한다.
		System.out.println(num1 == num3); //true
		
		
		// 대입 연산 : =, += , -=, ...
		int assign = 1;
		assign *= 10; // assign = assign * 10;
		System.out.println(assign);
		
		// 문자열(String) 연산
		String str1 = "String 1";
		String str2 = "String 1";
		String str3 = "String 2";
		String str4 = new String("String 1");
		
		System.out.println(str1 == str3);
		System.out.println(str4);
		System.out.println(str1 +'\t'+ str2);
		
		// 문자열 + 연산 : 연결 연산
		System.out.println(str1 +'\n'+ str2);
		
		// 문자열 == 비교연산
		System.out.println(str1 == str4); //false
		System.out.println(str1 == str2); //true
		System.out.println(str1 == str3); //false
		
		// equals : 문자열 내용이 같은지 여부
		System.out.println(str1.contentEquals(str2)); //true 
		System.out.println(str1.contentEquals(str3)); //false 
		System.out.println(str1.contentEquals(str4)); //true
		
		
		// 삼항연산 --> 조건? 결과 1: 결과2
		
		// 67.5g 초과이면 A등급, 그외
		double meat = 66.1;
		String grade = (meat > 67.5) ? "A등급" : "그 외 등급";
		System.out.println(grade);
		
	}

}

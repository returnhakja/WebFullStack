package step01_syntax;

import java.util.Arrays;

public class Ex06Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 -- 스택(Stack) -- 힙(heap) 영역에서 생성
		// 기본값 : null
		// - 참조할 객체 없을 경우, NullPointerException 예외 발생
		
		// 문자열(String)
		// ==, equals
		
		String str1 = "java";
//		System.out.println(str1);
//		System.out.println(str1.hashCode());
//		
		str1= null;
//		System.out.println(str1);
//		System.out.println(str1.hashCode());
		
		// 배열 (Array) : 데이터 값 여러가지를 한 개의 변수에 대입
		// 구조 : 타입[] 변수명 = {요소1, 요소2,..};
		// 특징 : 길이(사용가능한데이터 값의 갯수 )가 고정
		// 종류 : 1차원, 다차원배열
		int[] arr1 = {1,2,3};
		String[] arr2 = {"one", "two", "three"};
		
		int[] arr3; 
		arr3 = new int[] {4,5,6};
		
		int[] arr4 = new int[3];
		
		//2차원 배열
		int [][] arr11 = new int[3][4];
		
		// 배열값 접근 : index - 0부터 시작
//		System.out.println(arr1[0]);
//		System.out.println(arr1[3]);  java.lang.ArrayIndexOutOfBoundsException
		
		// 배열의 길이 : length
//		System.out.println(arr1.length);
		
		//배열의 데이터 값 출력
//		System.out.println(arr1);
		
		//step01 
		for(int i = 0; i<3; i++)
		{
//			System.out.println(arr1[i]);
		}
		
		//step02
		for(int i = 0; i<arr1.length; i++)
		{
//			System.out.println(arr1[i]);
		}
		
		// step03
		for(int i : arr1) //String 으로 선언하면 타입이 맞지 않기 때문에 오류가 나온다
		{
//			System.out.println(i);
		}
		
		// 얕은복사
		int[] arr5= {1,2,3};
		int[] arr6 = arr5;
		
//		System.out.println(arr6[0]); //1
//		System.out.println(arr5[0]); //1
		arr6[0] = 10; //{10, 2, 3}
//		System.out.println(arr6[0]); // 10
//		System.out.println(arr5[0]); // 10
		
		// 깊은복사
		int[] arr7= {1,2,3};
		int[] arr8 = new int[arr7.length];
		for(int i = 0; i<arr7.length; i++) {
			arr8[i] = arr7[i];
		}
		for(int i:arr8) {
//		System.out.println(i);
		}
//		System.out.println(arr8[0]); //1
//		System.out.println(arr7[0]); //1
		arr8[0] = 10; //{10, 2, 3}
//		System.out.println(arr8[0]); // 10
//		System.out.println(arr7[0]); // 1
		
		//etc
		int[] arr9 = arr7.clone(); //clone 기능
		for(int i : arr9) {
			System.out.println(i);
		}
		arr9[0] = 10;
		System.out.println(arr7[0]);
		
		//
		int[] arr10 = Arrays.copyOf(arr7,  arr7.length);
		for(int i : arr10) {
			System.out.println(i);
		}
		arr10[0] = 10;
		System.out.println(arr7[0]);
		
		
		
	}

}

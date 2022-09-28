package step01_syntax;

public class Ex05Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//For문
		// 5 ~ 1 출력
		for(int i = 5; i>= 1; i--) {
//			System.out.println(i);
		}
		
		//while문
		int i1= 1;
		while(i1 <= 5) {
			System.out.println(i1);
			i1++;
		}
		
		//do while
		int i2 =1;
		do {
			System.out.println(i2);
			i2++;
		}while(i2<=5);
	}

}

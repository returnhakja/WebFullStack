package step01_syntax;

import java.util.Arrays;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i, dan;
//		for (dan = 2; dan <= 9; dan++) {
//			System.out.print("[" + dan + "단]\t");
//		}
//		System.out.println();
//		for (i = 1; i <= 9; i++) {
//			for (dan = 2; dan <= 9; dan++) {
//				System.out.print(dan + "*" + i + "=" + i * dan + "\t");
//			}
//			System.out.println();
//		}
//	}
		
		int[][] array = new int[8][9];
		
		for(int i=2; i< 10; i++) {
			for(int j=1; j<10; j++) {
				array[i-2][j-1] = i*j;
			}
		}
		for (int i=0; i< array.length; i++) {
			System.out.println((i+2) + "단");
			System.out.println(Arrays.toString(array[i]));
		}
	}

	
}

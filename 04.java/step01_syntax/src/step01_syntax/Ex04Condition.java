package step01_syntax;
import java.util.Scanner;

public class Ex04Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//조건문 : 주어진 조건이 참일경우, 기능 수행
//		1) is(조건식){
//			수행코드;
//		}else if(조건식2) {
//			수행코드2;
//		}else {
//			수행코드 3;
//		}
//		2) switch/case문
//		switch(변수명) {
//		case 조건1:
//			수행코드;
//			..
//		
//		default : 
//			기본수행코드
//	}
		
		// if문) 관리자 id가 admin 혹은 admin2일 때 접속 성공 (else if 사용)
		String id = "admin";
		
		if(id == "admin") {
			System.out.println("접속성공");
		}else if(id == "admin2")
		{
			System.out.println("접속성공");
		}else {
			System.out.println("접속실패");
		}

		
		//switch / case 문) 1~ 3월까지 해당 월을 비교 -> 해당 월이라면 "month월" 문구 출력
		int month =3 ;
		
		switch(month) {
		case 1:
			System.out.println(month + "월입니다");
			break;
		case 2:
			System.out.println(month + "월입니다");
			break;
		case 3:
			System.out.println(month + "월입니다");
			break;
		default:
			System.out.println("해당월이 없습니다");
		}
		
		
		
		
		
		
		
			}
	}



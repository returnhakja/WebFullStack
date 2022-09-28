package step02.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import model.domain.Student;

public class Ex01ArrayList {


	public static void main(String[] args) {
		
		
		//ArrayList 는 내부적으로 tostring이 되어있음 
		ArrayList arr1 = new ArrayList();
		// add : 추가
		arr1.add("Java");
		arr1.add(new Student("java",1,"junior"));
		arr1.add(3);
		arr1.add("Java");
		
		//get : 원소 객체를 반환
//		System.out.println(arr1.get(3));
		
		System.out.println(arr1);
		
		
		
		// size : 객체 수 반환
		System.out.println(arr1.size());
		
		// ??
		System.out.println(((Student)arr1.get(1)).getName());
		
		//제네릭(Generic); 컬렉션 객체 생성 시 , 저장되는 데이터 타입을 지정
		ArrayList<String> arr2 =new ArrayList<String>();
		arr2.add("java1");
		arr2.add("java2");
		arr2.add("java3");
		arr2.add("java4");
		arr2.add("java5");
//		arr2.add(new Student("java",1,"junior")); String타입으로 지정해놔서 오류
		
		// remove : 해당 인덱스 객체 삭제
		arr2.remove(2);
		System.out.println(arr2.get(2));
		
		
		
		//Hashset
		
		
		
		
		
		// LinkdList
		List arrayList = new ArrayList();
		List ldkList = new LinkedList();
		
		// ArrayList
		//얼마나 걸리는지 시간 측정
		long startTime;
		long endTime;
		startTime = System.currentTimeMillis();
		for (int i=0 ; i<100000; i++) {
//			arrayList.add(i);
			arrayList.add(0,i); //0번째 인덱스에 삽입
			
		}
		endTime = System.currentTimeMillis();
		System.out.println("ArrayList 데이터 삽입 시간은" + (endTime -startTime)+"밀리초" );
		
		//LinkedList 
		startTime = System.currentTimeMillis();
		for (int i=0 ; i<100000; i++) {
			ldkList.add(0,i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("LinkedList 데이터 삽입 시간은" + (endTime -startTime)+"밀리초" );
		
	}

}

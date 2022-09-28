package step02.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02HashSet {

	public static void main(String[] args) {
		//HashSet  : 중복 값은 불가능
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("Java");
		set1.add("Busan");
		set1.add("Study");
		set1.add("Happy");
		set1.add("Lazy");
		set1.add("Lazy");
		
		// for문을 이용하여 출력하주어야함
		for(String v : set1) {
			System.out.println(v);
		}
		System.out.println(" ");
		
		// iterator
		Iterator<String> iterator = set1.iterator();
		while(iterator.hasNext()) { // 값이 있는지 없는지 확인 -> hasNext()
			System.out.println(iterator.next());
			
		}
		System.out.println(" ");
		
		System.out.println(set1.isEmpty()); //set1이 비어있는지 안비어있는지 파악하는 메소드
		System.out.println(" ");
		set1.remove("Happy"); // 삭제
		
		for(String v : set1) {
			System.out.println(v);
		}
		
		System.out.println(set1.contains("Busan"));
	}

}

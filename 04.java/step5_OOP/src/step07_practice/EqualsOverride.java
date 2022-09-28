package step07_practice;

class Person extends Object{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// equals 재정의
	// 1. 매개변수로 들어온 Object 타입의 객체 -> person타입으로 형변환이 가능한지 검증
	// 2. instaceof
	// 3. name, age 값을 비교
	// 4. 검증 후, name, age가 갖고 있는 데이터가 동일한 경우에만 -> true
	@Override
	public boolean equals(Object object) {
//		if(object instanceof Person && this.name.equals(((Person)object).name) && 
//				this.age == ((Person)object).age)
//			return true;
//		else {
//			
//		return false;
//		}
		
//		// ver2
//		if(object instanceof Person) {
//		if(name.equals(((Person)object).name)&& age ==((Person)object).age) {
//				return true;
//		}
//	}
//		return false;
//	}
	
	// ver3
			if (object instanceof Person) {
				Person person = (Person)object;
				if(name.equals(person.name) && age == person.age) {
					return true;
								}
											}
			return false;
		}
		}


class Person2 {
	String name;
	int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
}




public class EqualsOverride {

	public static void main(String[] args) {
		Person p1 = new Person("JAVA", 2);
		Person p2 = new Person("JAVA", 2);
		Person2 p3 = new Person2("JAVA", 2);
		
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		
		//equals
		System.out.println(p1.equals(p2));//주소값을 비교하기 때문에 false 가 나온다
		System.out.println(p1.equals(p3));//주소값을 비교하기 때문에 false 가 나온다
		
		// Person 객체 생성시, 같은 이름 나이를 갖고 있다면 동일 객체로 인식하는 방법은?
		
		
	}

}

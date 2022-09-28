package model.domain;

import java.io.Serializable;

// 직렬화  implements Serializable
public class Kid implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1023974915548634037L;
		private String name;
	    private transient int personaNumber; // 밖으로 내보내고 싶지 않은 멤버변수는 transient를 넣어야함
	    private int age;
	    
//	    Object object = new Object();
	    // 클래스 내부에 Object 객체가 존재한다면 이 클래스는 직렬화가 되지 않음
	    // 
	   
	    
	    
	    public void kidOut() { }
	    
	    
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPersonaNumber() {
			return personaNumber;
		}
		public void setPersonaNumber(int personaNumber) {
			this.personaNumber = personaNumber;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Kid [name=" + name + ", personaNumber=" + personaNumber + ", age=" + age + "]";
		}

	   
}

package step04;

public class Person {
private String name;
private String MBTI;

	
	
	public Person(String name, String mbti) {
		this.name = name;
		this.MBTI = mbti;
	}

	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getMBTI() {
		return MBTI;
	}



	public void setMBTI(String mBTI) {
		MBTI = mBTI;
	}



	

}

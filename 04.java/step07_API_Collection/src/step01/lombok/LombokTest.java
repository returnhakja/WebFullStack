package step01.lombok;

import model.domain.Student;

public class LombokTest {

	public static void main(String[] args) {
		Student student = new Student("java", 1, "Junior");
		System.out.println(student);
//		student.getName();
	}

}

package step10.Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.domain.Kid;

public class Serialization {

	

	public static void main(String[] args) {
		// 객체 출력 - 객체를 감싸줄수 있는 ObjectOutputStream
		
		try {
				//출력
//				FileOutputStream fos = new FileOutputStream("Object.txt");
//				ObjectOutputStream oos = new ObjectOutputStream(fos);
//				
//				// 객체는 wirteObject 를 써야함
//				oos.writeObject(new String("Busan"));
//				oos.writeObject(new Integer(1));
//				
//				oos.close();
//				fos.close();
//				System.out.println("객체 출력 성공");
			//입력 - ObjectInputStream
//			FileInputStream fis = new FileInputStream("Object.txt");
//			ObjectInputStream ois = new ObjectInputStream(fis);
//			
//			
//				System.out.println((String)ois.readObject());
//				System.out.println((Integer)ois.readObject());
//			
//				ois.close();
//				fis.close();
				
				//직렬화
//				Kid kidOut = new Kid();
//				kidOut.setName("Busan");
//				kidOut.setAge(27);
//				kidOut.setPersonaNumber(12345);
//				
//				ObjectOutputStream oosKid = new ObjectOutputStream(new FileOutputStream("Kid.txt"));
//				oosKid.writeObject(kidOut);
//				
//				oosKid.close();
//				
			//역직렬화
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Kid.txt"));
			
			Kid kisIn = (Kid)ois.readObject();
			
			System.out.println(kisIn.getName());
			System.out.println(kisIn.getAge());
			System.out.println(kisIn.getPersonaNumber());
			
			ois.close();
				
				
		}
		 catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	}
	
		
	



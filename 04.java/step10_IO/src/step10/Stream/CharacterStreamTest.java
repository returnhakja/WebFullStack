package step10.Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamTest {

	public static void main(String[] args) {
		//Writer
//		try {
//			FileWriter fw = new FileWriter("CharacterStream.txt");
//			fw.write("왜 글삭튀 하셨어여 ㅋㅋ" + "\n");
//			fw.write("박제글 써야하는데" + "\n");
//			
//			fw.write(new char[] {'인', '벤'});
//			fw.close();
//			System.out.println("저장 성공");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// Reader
//		FileReader fr = null;
		try(FileReader fr = new FileReader("CharacterStream.txt");) {
//			 fr = new FileReader("CharacterStream.txt");
			int data;
			//try 내부에서 선언하게 되면 autocloseble이 되서 closr를 해줄 필요가 없음
			
				while((data= fr.read())!= -1) {
					System.out.println((char)data);
				}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
	}



package step10.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest {
	
	public static void fileSave() throws FileNotFoundException, IOException {
	    FileOutputStream fos = null;
	    try {
	        fos = new FileOutputStream("ByteStream.txt");
	            fos.write(97); // a
//					fos.write(65);
//					fos.write(66);
//					fos.write(67);
//					fos.write(68);
//					fos.write(69);
	            byte[] data = {65, 66, 67, 68, 69};

	            fos.write(data);
//					fos.write(data, 1, 3);
	            fos.close();
	    } finally {
	            fos.close();
	    }
	}
	
	//fileopen
	public static void fileOpen() throws IOException, FileNotFoundException {
		FileInputStream fis = new FileInputStream("ByteStream.txt");
		
		// step 01
		//데이터를 읽으려면 read를 사용해야함
//		int data;
//		while((data = fis.read()) != -1) {
//			System.out.println((char)data);
//		}
		//setp02 
		// for문
		int fileSize = (int)new File("ByteStream.txt").length();
		byte[] readData = new byte[fileSize];
		fis.read(readData);
		for(int i = 0; i<fileSize; i++) {
			System.out.println((char)readData[i]);
		}
//		fis.read(readData);
	}
	
	
	public static void main(String[] args) {
		// 경로 지정 안할시 기본으로 프로젝트에 생성댐
		try {
//			fileSave();
			fileOpen();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

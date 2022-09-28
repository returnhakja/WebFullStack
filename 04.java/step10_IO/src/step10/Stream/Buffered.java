package step10.Stream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered {

	public static void main(String[] args) {
		// Buffer(8192) : 입력 혹은 출력에 대한 임시 저장공간 -> 데이터를 한번에 처리하는  보조 스트림
		//FileWriter Bufferd Writer
		
//		try {
//			BufferedWriter bw = new BufferedWriter(new FileWriter("cheerup.txt"));
//			bw.write("하이" + "\n");
//			bw.write("에후" + "\n");
//			bw.write("집언제가지" + "\n");
//			bw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//BufferReader
		try {
			BufferedReader br = new BufferedReader(new FileReader("cheerup.txt"));
			
			String msg;
			try {
				while((msg = br.readLine())!=null) {
					System.out.println(msg);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		//Buffered 보조 스트림 성능차이
		long startTime;
		long endTime;
		
		
		try {
			// Buffered 미사용
			FileInputStream fis = new FileInputStream("bacon.jpg");
			startTime = System.currentTimeMillis();
			while(fis.read() != -1) {
			} // 파일만 읽을꺼니까 이렇게 하면댐
			endTime = System.currentTimeMillis();
			
			System.out.println("Buffered 미사용" +  (endTime-startTime) + "ms");
			fis.close();
			
			
			// buffered 사용
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bacon.jpg"));
			startTime = System.currentTimeMillis();
			while(bis.read() != -1) {
			}
			endTime = System.currentTimeMillis();
			
			System.out.println("Buffered 사용" +  (endTime-startTime) + "ms");
			bis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

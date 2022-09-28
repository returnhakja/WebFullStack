package step01NetWork;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01IP {

	public static void main(String[] args) {
		// IP 주소 : java.net.XXX
		
		
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local);
			System.out.println(local.getHostAddress());
			System.out.println(local.getHostName());
			
			System.out.println();
			
			
			// 외부정보
			InetAddress[] inetAddress = InetAddress.getAllByName("google.com");
			System.out.println(inetAddress);
			for(InetAddress i:inetAddress) {
				System.out.println(i);
			}
			
			
			
			
			
			
			
			
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}

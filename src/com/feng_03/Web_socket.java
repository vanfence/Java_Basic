
package com.feng_03;

import java.net.InetAddress;

// InetAddress ¿‡
public class Web_socket {
	
	public static void main(String []args) throws Exception{
		InetAddress local = InetAddress.getLocalHost();
		System.out.println(local+" "+local.getHostAddress());
		InetAddress remote = InetAddress.getByName("www.itcast.com");
		System.out.println(remote+" "+remote.getHostAddress()+" "+remote.getHostName());

}
}

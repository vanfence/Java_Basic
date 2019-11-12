package com.feng.socket;

import java.net.*;

public class UDP_sender {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(3000);
		String s = "hello";
		
		DatagramPacket dp = new DatagramPacket(s.getBytes(), s.length(), InetAddress.getByName("localhost"), 55);
		
		System.out.println("·¢ËÍÊý¾Ý");
		ds.send(dp);
		ds.close();
	}

}

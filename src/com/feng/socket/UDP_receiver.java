package com.feng.socket;

import java.net.*;
public class UDP_receiver {

	public static void main(String[] args) throws Exception {
		byte[] buf = new byte[2014];
		DatagramSocket ds = new DatagramSocket(55);
		DatagramPacket dp = new DatagramPacket(buf,1024);
		System.out.println("��ʼ��"+ds.getLocalPort()+"�ȴ��������ݣ�");
		ds.receive(dp);
		String str = new String(dp.getData(),0,dp.getLength())+" from "+
								dp.getAddress().getHostAddress()+":"+dp.getPort();
		System.out.println(str);
		ds.close();

	}

}

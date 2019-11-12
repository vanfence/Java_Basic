package com.feng_mianshi;

import java.util.Scanner;

/*
 * 쳲�����ϵ������ĵݹ�Ͷ�̬�滮
 * ��������N������̨�ף�һ�οɿ�2����1��̨�ף���N��̨���ж������߷�
 * */
public class DynamicPro {

	public static int jump(int n){
		if(n==1) return 1;
		if(n==2) return 2;
		int pre=1;
		int loc=2;
		int temp1=0;
		int temp2=0;
		for(int i=3;i<=n;i++){
			temp1=pre;
			temp2=loc;
			pre=temp2;
			loc=temp1+temp2;
		}
		return loc;
	}
	
	
	public static void main(String[] args){
		
		System.out.println(args.length);
		for (String x : args){
	    	System.out.println(x);
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int step = DynamicPro.jump(n);
		System.out.println(step);
	}

}

package com.feng_02;

public class Demo_Static {

	//i����Ϊ���������̬������
	public static int i=0;
	
	//static���������лᱻִ����ִ��һ�Σ�����������޹�
	static{
		i++;
		//System.out.println("Static�������������ȱ�����i��Ϊ"+i);
	}
	public Demo_Static(){
		i++;
		//System.out.println("���캯�������ã�i��������i��Ϊ"+i);
	}
	
	public static void main(String[] args) {
		/*Demo_Static ds1 = new Demo_Static();
		System.out.println(ds1.i);
		
		Demo_Static ds2 = new Demo_Static();
		System.out.println(ds2.i);*/
		
	}
}

class Stu{
	private String name;
	private int age;
	private int fee;
	/*��ѧ������Ϊ�����*/
	private static int count=0;
	
	public Stu(String name,int age,int fee){
		this.name=name;
		this.age=age;
		count+=fee;
	}
	
	/* �˴�����Ϊ�෽������̬������
	     @1 һ��涨�� �����ԭ���ϵĲ������෽��ȥ����
	     @2 �෽���в��ܷ��ʷǾ�̬����;���෽���Ծ�̬�ͷǾ�̬�������ܷ���
	*/
	public static int getCount(){
		return count;
	}
	
    
	public static void main(String args[]){
		Stu s1 = new Stu("nana",12,750);
		Stu s2 = new Stu("xixi",15,1200);
		System.out.println("��ѧ��Ϊ"+Stu.getCount());
		
	}
}


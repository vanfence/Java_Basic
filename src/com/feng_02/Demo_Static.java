package com.feng_02;

public class Demo_Static {

	//i声明为类变量（静态变量）
	public static int i=0;
	
	//static语句块在类中会被执行且执行一次，跟具体对象无关
	static{
		i++;
		//System.out.println("Static语句块在类中首先被处理，i变为"+i);
	}
	public Demo_Static(){
		i++;
		//System.out.println("构造函数被调用，i会自增，i变为"+i);
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
	/*总学费声明为类变量*/
	private static int count=0;
	
	public Stu(String name,int age,int fee){
		this.name=name;
		this.age=age;
		count+=fee;
	}
	
	/* 此处声明为类方法（静态方法）
	     @1 一般规定： 类变量原则上的操作用类方法去访问
	     @2 类方法中不能访问非静态变量;非类方法对静态和非静态变量都能访问
	*/
	public static int getCount(){
		return count;
	}
	
    
	public static void main(String args[]){
		Stu s1 = new Stu("nana",12,750);
		Stu s2 = new Stu("xixi",15,1200);
		System.out.println("总学费为"+Stu.getCount());
		
	}
}


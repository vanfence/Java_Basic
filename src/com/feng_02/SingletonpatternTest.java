package com.feng_02;

public class SingletonpatternTest {
	public static void main(String[] args){
		SingletonPattern emperor1 = SingletonPattern.getEmperor();
		emperor1.emperorInfo();
		System.out.println(emperor1);
		
		SingletonPattern emperor2 = SingletonPattern.getEmperor();
		emperor2.emperorInfo();
		/* com.feng_02.SingletonPattern@15db9742
		 * 前面造过对象后面就不用重新new
		 * */
		System.out.println(emperor2);  
		
	}
}

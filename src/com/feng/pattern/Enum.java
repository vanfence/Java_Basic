package com.feng.pattern;

public class Enum {

	enum EnumTest{
		MON(1), TUE(2), WED, THU,FRI,SAT,SUN;
		private int day;
		EnumTest(){}
		EnumTest(int d){
			day = d;
		}
		public int getDay(){
			return day;
		}
		
	}
	
	
	public static void main(String[] args) {
		EnumTest enumTest = EnumTest.MON;
		int m = enumTest.getDay();
		System.out.println(m);

	}

}

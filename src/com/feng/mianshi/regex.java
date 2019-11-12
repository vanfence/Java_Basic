package com.feng.mianshi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regex {
	public static String translate (String str) {
		 String tempStr = "";
		 try {
		 tempStr = new String(str.getBytes("ISO-8859-1"), "GBK");
		 tempStr = tempStr.trim();
		 }
		 catch (Exception e) {
		 System.err.println(e.getMessage());
		 }
		 return tempStr;
		 }
	
   public static void main(String[] args){
		
		String s="reg(ege)(gex)";
		Pattern p = Pattern.compile(".*?(?=\\()");
		Matcher m = p.matcher(s);
		if(m.find()){
			System.out.println(m.group());
		}
		String a=translate("123\\wqs-q/ee efg");
		System.out.println(a);
		Integer i=  -128;
		Integer c = -128; // (-128--127)
		System.out.println(c==i);
	}

}

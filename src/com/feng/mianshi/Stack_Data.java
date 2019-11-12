package com.feng.mianshi;

import java.util.Stack;

public class Stack_Data {
    
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	
	public Stack_Data(){
		this.stackData=new Stack<Integer>();
		this.stackMin = new Stack<Integer>();
	}
	
	public void push(int newNum){
		if(stackMin.isEmpty())
			stackMin.push(newNum);
		else if(newNum <=getMin()){
			stackMin.push(newNum);
		}
		stackData.push(newNum);
	}
	
	public int pop(){
		if(stackData.isEmpty()|| stackMin.isEmpty()){
			throw new RuntimeException("stack is empty");
		} 
		int value=stackData.pop();
		if(value==getMin()){
			stackMin.pop();
		
		}
		return value;

	}
	
	public int getMin(){
		
		if(stackMin.isEmpty()){
			throw new RuntimeException("stack is empty");
		}else
			return stackMin.peek();
		
	}
	
	public static void main(String[] args) {
		
		Stack_Data s = new Stack_Data();
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(1);
		s.push(2);
		s.push(1);
		s.pop();
		for(Integer x:s.stackData){
			System.out.println(x);
		}
		
		System.out.println("----");
		
		
		for(Integer x:s.stackMin){
			System.out.println(x);
		}
		
		

	}

}

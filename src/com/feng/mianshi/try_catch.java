package com.feng.mianshi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class try_catch {

	public static void test(){
		List<Object> list= new ArrayList<Object>();
		int threadnum=1000;
		
		CountDownLatch count = new CountDownLatch(threadnum);
		
		for (int i=0;i<threadnum;i++){
			//Thread thread = new Thread(new mythread(list,count));
			Thread thread = new Thread();
			thread.start();
		}	
		try{
			count.await();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
//		System.out.println(list.size());
	}
	
	
	public static void main(String[] args) {
	
		for (int i=0;i<10;i++){
			test();
		}

	}
}

	class mythread implements Runnable{

		//private List<Object> list;
		//private CountDownLatch countDownLatch;
//		public mythread(List<Object>list,CountDownLatch count){
//			this.list=list;
//			this.countDownLatch=count;
//		}
		
		@Override
		public void run() {		
			System.out.println("name"+Thread.currentThread().getName());		
//			 
		}
		
	}


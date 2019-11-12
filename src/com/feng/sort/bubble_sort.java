package com.feng.sort;


public class bubble_sort {

	private int []a ;
	private int element=0;
	public bubble_sort(){
		a= new int[20];
	}
	public bubble_sort(int max){
		a=new int[max];
	}
	
	public void insert(int value){
		a[element]=value;
		element++;
	}
	
   public void display(){
	   for(int i =0;i<element;i++){
		   if(i==element-1)
			   System.out.print(a[i]);
		   else
		   System.out.print(a[i]+", ");
	   }
	   System.out.println("\n");
   }
   
   public void sort(){
	   for(int i = 0;i<element;i++)
		   for(int j=i+1;j<element;j++){
			   if(a[i]>a[j]){
				   int temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
			   }
		   }
   }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bubble_sort bs = new bubble_sort(20);
		bs.insert(23);
		bs.insert(13);
		bs.insert(53);
		bs.insert(93);
		bs.insert(3);
		bs.display();
		bs.sort();
		bs.display();

	}

}

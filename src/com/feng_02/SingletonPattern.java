package com.feng_02;

/*单例模式： 饿汉式，懒汉式
 * 饿汉式--是不会出问题的
 * 懒汉式--可能会出问题
 *               A: 懒加载（延迟加载）
 *               B: 线程安全问题
 * 
 * */
public class SingletonPattern {
	
	/*饿汉式：类在加载时被实例化*/
	//private static Emperor emperor = new Emperor();
	//public static SingletonPattern getEmperor(){
	//	return emperor;
	//}
	
	/*确定生成的实例为单例，用下面的方法较好*/
	//private static final Emperor emperor = new Emperor();
	//public static SingletonPattern getEmperor(){
	//	return emperor;
	//}
	
	/*懒汉式*/
	private static SingletonPattern emperor = null;
	
	private SingletonPattern(){}
	
	/*加入synchronize做同步处理，反应速度比不加慢*/
	public static synchronized SingletonPattern getEmperor(){
		if(emperor == null ){
			emperor = new SingletonPattern();
		}
		return emperor;
	}
	public static void emperorInfo(){
		System.out.println("HongLi");
	}
	
}

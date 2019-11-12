package com.feng_02;

/*����ģʽ�� ����ʽ������ʽ
 * ����ʽ--�ǲ���������
 * ����ʽ--���ܻ������
 *               A: �����أ��ӳټ��أ�
 *               B: �̰߳�ȫ����
 * 
 * */
public class SingletonPattern {
	
	/*����ʽ�����ڼ���ʱ��ʵ����*/
	//private static Emperor emperor = new Emperor();
	//public static SingletonPattern getEmperor(){
	//	return emperor;
	//}
	
	/*ȷ�����ɵ�ʵ��Ϊ������������ķ����Ϻ�*/
	//private static final Emperor emperor = new Emperor();
	//public static SingletonPattern getEmperor(){
	//	return emperor;
	//}
	
	/*����ʽ*/
	private static SingletonPattern emperor = null;
	
	private SingletonPattern(){}
	
	/*����synchronize��ͬ��������Ӧ�ٶȱȲ�����*/
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

package com.study;

/**
 * 
 * @author Administrator
 *
 */
public class RecursionTest {
	public static void main(String[] args){
		System.out.println(fuction(3));
		System.out.println("**************************");
		test01();
	}
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static long fuction(int n){
		if(n==1){
			return 1;
		}else {
			return n*fuction(n-1);
		}
	}
	/**
	 * 
	 */
	static int a = 0;
	public static void test01(){
		
		a++;
		System.out.println("test01:" + a);
		if(a<10){
			test01();
		}else{
			System.out.print("over");
		}
	}
}

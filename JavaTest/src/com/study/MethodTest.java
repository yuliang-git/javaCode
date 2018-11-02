package com.study;

public class MethodTest {
	public static void main(String[] args){
		int s = add(6,5);
		System.out.println(s);
		test01(150,3);
	}
	
	public static int add(int a,int b){
		int sum= a+b;
		return sum;
	}
	public static void test01(int b,int c){
		for (int a=1;a<b;a++){
			if (a % c == 0)
				continue;
			System.out.println(a);
			
		}
	}
}

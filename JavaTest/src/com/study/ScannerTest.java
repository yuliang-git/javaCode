package com.study;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args){
		test01();
	}
	public static void test01(){
		Scanner s = new Scanner(System.in);
		System.out.println("输入第一个参数");
		int a = s.nextInt();
		System.out.println("输入第二个参数");
		int b = s.nextInt();
		
		int sum = a+b;
		System.out.println("计算结果，和为：" + sum);
	}
}

package com.study;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args){
		test01();
	}
	public static void test01(){
		Scanner s = new Scanner(System.in);
		System.out.println("�����һ������");
		int a = s.nextInt();
		System.out.println("����ڶ�������");
		int b = s.nextInt();
		
		int sum = a+b;
		System.out.println("����������Ϊ��" + sum);
	}
}

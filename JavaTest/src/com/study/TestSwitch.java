package com.study;

public class TestSwitch {
	public static void main(String[] args){
		double d = Math.random();
		int e = 1+(int)(d*6);
		System.out.println(e);
		
		System.out.println("���Զ�ѡ�ṹ");
		if(e==6){
			System.out.println("���������ǳ���");
		}else if(e==5){
			System.out.println("���������ܺ�");
		}else if(e==4){
			System.out.println("��������һ��");
		}else {
			System.out.println("������������");
		}
		
		System.out.println("############################################");
		
		switch(e){
		case 6:
			System.out.println("���������ǳ���");
			break;
		case 5:
			System.out.println("���������ܺ�");
			break;
		case 4:
			System.out.println("��������һ��");
			break;
		default:
			System.out.println("������������");
			break;
		}
		System.out.println("############################################");
		
		char c = 'a';
		int rand = (int) (26*Math.random());
		char c2 = (char)(c + rand);
		System.out.print(c2 + ": ");
		switch(c2){
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
			System.out.print("Ԫ��");
			break;
		case'y':
		case'x':
			System.out.print("��Ԫ��");
			break;
		default:
			System.out.print("����");
		}
	}
}

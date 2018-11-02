package com.study;

public class TestSwitch {
	public static void main(String[] args){
		double d = Math.random();
		int e = 1+(int)(d*6);
		System.out.println(e);
		
		System.out.println("测试多选结构");
		if(e==6){
			System.out.println("今天运气非常好");
		}else if(e==5){
			System.out.println("今天运气很好");
		}else if(e==4){
			System.out.println("今天运气一般");
		}else {
			System.out.println("今天运气不好");
		}
		
		System.out.println("############################################");
		
		switch(e){
		case 6:
			System.out.println("今天运气非常好");
			break;
		case 5:
			System.out.println("今天运气很好");
			break;
		case 4:
			System.out.println("今天运气一般");
			break;
		default:
			System.out.println("今天运气不好");
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
			System.out.print("元音");
			break;
		case'y':
		case'x':
			System.out.print("半元音");
			break;
		default:
			System.out.print("辅音");
		}
	}
}

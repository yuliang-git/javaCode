package test;

public class test2{
	public static void main(String[] aegs){
		f1();
		f2(10,8);
//		int s = f3();
		System.out.println(f3());
    	int y = f4(3,4);
		System.out.println(y);
	}
	
	public static void f1(){
		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println("f1.c的值位" + c);
		
	}
	public static void f2(int a,int b){
		int c = a * b;
		System.out.println("f2.c的值位" + c);
	}
	
	public static int f3(){
		int a = 1;
		int b = 6;
		int c = a+ b;
//		System.out.println("方法输出" +c);
		return c;
	}
	public static int f4(int a,int b){
		int c = a+b;
		return c;
	}
	
}
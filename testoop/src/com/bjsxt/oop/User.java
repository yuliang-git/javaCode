package com.bjsxt.oop;

public class User {
	int id;
	String name;
	String pwd;

	//���췽��
	public User(int id,String name){
		this.id = id;
		this.name = name;
	}


	public void testParamterTransfer01(User u){
		u.name = "��С��";
	}
	
	public void testParamterTransfer02(User u){
	      u9 = new User(200,"����");
	}
	
	public static void main(String[] args){
		User u1 = new User(100,"��С��");
		
		u1.testParamterTransfer01(u1);
		System.out.println(u1.name);
		
		u1.testParamterTransfer02(u1);
		System.out.println(u1.name);
	}

}
		
		
//		User.hh("dd");
//	} 
//	static  void hh(String xx){
//		  String cx;
//	}



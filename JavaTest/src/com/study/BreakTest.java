package com.study;

public class BreakTest {
	public static void main(String[] args){
		int total = 0;
		System.out.println("begin");
		while (true){
			total++;
			int i= (int) Math.round(100*Math.random());
			if(i==88){
				break;
			}
			System.out.println("Game over,used" + total + "times.");
		}
	}
}

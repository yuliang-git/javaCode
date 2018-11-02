package com.study;

public class Testfor {
	public static void main(String[] args){
		
		for(int i=0;i<=1000;i++){
			

			if(i%5 == 0 && i%3 != 0){		
				System.out.print(i + "\t");
  		    }else if(i%5 == 0 && i%3 == 0){
				System.out.print(i + "\n");
			}
		}
	}
}

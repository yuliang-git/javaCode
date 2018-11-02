package com.study;

public class NineNine {
	public static void main(String[] args){
		for(int i=1;i<10;i++){
			int y=1;
			int x;
		    while(i>=y){
		     x=i*y;
			System.out.print(y+ "*"+ i + "=" + x);
			System.out.print('\t');
			if(i==y){
				System.out.println();
			}
			y++;

		   }
		}
	}
}

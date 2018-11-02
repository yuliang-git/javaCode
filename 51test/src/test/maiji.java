package test;

public class maiji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		for(int x=0;x<=20;x++){
			for(int y=0;y<=33;y++){
				for(int z=0;z<=100;z++){
					if((5*x+3*y+z) == 100){
						count ++;
						System.out.print(x + " ");
						System.out.print(y + " ");
						System.out.println(z + " ");
						}
				}
			}
		}			
		System.out.println(count);
}
}

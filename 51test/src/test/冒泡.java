package test;

import java.util.Arrays;

public class ц╟ещ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {6,9,3,88,7};
		int y = 0;
		for(int i = 1;i < a.length;i++) {
			for (int x = 0;x < a.length-i ;x++){
				if(a[x] > a[x+1]){
					y = a[x];
					a[x] = a[x+1];
					a[x+1] = y;
					
				}
				System.out.println(Arrays.toString(a));
			}
			
		}
		
	}

}

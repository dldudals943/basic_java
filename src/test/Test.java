package test;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
        
	int[] a =  {1,2,3,4,5,6,7,8,9,10,-1,-15,-3};
	int[] b = Arrays.copyOfRange(a, 3, 5);
		System.out.println(Arrays.toString(b));
	Arrays.sort(a);
		System.out.print(Arrays.toString(a));;
	}
	
	
}



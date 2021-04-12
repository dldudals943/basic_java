package test;

import java.util.Arrays;
import java.util.Comparator;

public class Test6 {

	public static void main(String[] args) {
		String str1 = "asdfe sdf sdf dfdfdfd";
		String[] str2 = str1.split(" ");
		System.out.println(Arrays.toString(str2));
		
		char a = str2[0].toUpperCase().charAt(0);
		System.out.println(a);
		
		str2[0].toLowerCase();
		char b = ' ';
		System.out.println(b);
		
		int n = 100000000;
		System.out.println(n);
		
		long n1 = 118372;
		String str3 = Long.toString(n1);
		int[] n2 = {};
		
		int[] n3 = {8,7,5,6,4,2,3,5,4};
		char aaa = '2';
		
		int num = 1212121;
		String[] temp = String.valueOf(num).split("");
		System.out.println(Arrays.toString(temp));
		
		   int sum = 0;
		    for (String s : temp) {
		    	if(s.equals("")) continue;
		        sum += Integer.parseInt(s);
		    }
		    
		System.out.println(sum);
	}

}

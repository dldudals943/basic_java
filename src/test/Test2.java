package test;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
	       String s = "ABcdEFG";
	       boolean k = ('A' <= s.charAt(0) && s.charAt(0) <= 'Z');
	       System.out.println(k);
	       String[] ss = new String[3];
	       System.out.println(Arrays.toString(ss));
	       k = ss[0]==null;
	       System.out.println(k);
	       ss[0]="3";
	       ss[0]=null;
	       System.out.println(ss[0]);
	       
	       
	}

}

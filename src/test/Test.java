package test;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
//	   System.out.println((int)Math.ceil(0.5));
//	   System.out.println((int)Math.floor(0.5));
//	   System.out.println((int)Math.round(0.5));
		double x = 0.5;
		double y = 1.5;
	   HashSet<String> set = new HashSet<>();
	   set.add("0,1");
	   set.add("0,1");
	   set.add("0,1");
	   set.add("0,1");
	   
	   set.add(1+","+1);
	   for(String i : set){
		   System.out.println(i);
	   }
	   
	   System.out.println(set.size());
//	int[][] i1 = {{1,2},{3,4}};
//	
//	for(double i = 0; i < 10; i=i+0.5){
//		System.out.println(i);
//	}


}
}

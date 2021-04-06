package test;

import java.util.ArrayList;
import java.util.Arrays;


public class Test {

	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<Integer>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        Integer[] array = list.toArray(new Integer[list.size()]);
	        
	        int[] arr = new int[list.size()];
	        
	        for(int i = 0; i < list.size(); i++){
	        	arr[i] = list.get(i).intValue();
	        }
	        
	        System.out.println(Arrays.toString(arr));
	        
	        
	        
	        Integer any = 3;
	        int any2 = any.intValue();
//	        System.out.println(any2);
        
}

}

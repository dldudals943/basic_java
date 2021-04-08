package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0 ; i < 10 ; i ++){
			set.add(i);
			set.add(9-i);
		}
	     
		Iterator<Integer> itr = set.iterator();
		
		while (itr.hasNext()) { // hasNext() : 데이터가 있으면 true 없으면 false
			System.out.println(itr.next()); // next() : 다음 데이터 리턴
		}
		
		set.size();
		
		
		
	}

}

package j_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraryListClass {

	public static void main(String[] args) {
		/*
		 * Collections Framework
		 * - 다수의 데이터를 다루기 위한 표준 방식
		 * - List
		 * - Map
		 * - Set
		 * 
		 * ArrayList 주요 메서드
		 * - boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
		 * - void add(int index, Object obj) : 지정된 위치에 객체를 추가한다.
		 * - Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.
		 * - Object get(int index) : 지정된 위치의 객체를 반환한다.
		 * - int size() : 지정된 객체의 수를 반환한다.
		 * - Object remove(int index) : 지정된 위치의 객체를 제거하고 반환한다.
		 * - Boolean remove(Object obj) : 지정된 객체를 제거한다. <- 근데 이거 어떻게 쓰는지 모르겠는데 ;
		 */
		
		
		ArrayList sample = new ArrayList();
		sample.add("abc");
		sample.add(100);
		sample.add(new Scanner(System.in));
		
		//아무 타입이나 저장을 할 수가 있다.그리고 타입을 지정한 리스트를 만들 수도 있다.
		//아무거나 막 넣으면 예측하기가 쉽지 않다.
		
		ArrayList<Integer> list = new ArrayList<>();
		// <>  <- 이걸 제네릭이라고 부릅니다.
		
		list.add(new Integer(10));
//		list.add("abc");
		list.add(20); // int 타입을 넣을 수 있다.
		/*
		 * 래퍼 클래스
		 * - byte		:Byte
		 * - short		:Short
		 * - int		:Integer
		 * - long		:Long
		 * - float		:Float
		 * - double		:Double
		 * - boolean	:Boolean
		 * - char		:Character
		 * 
		 * 서로 자동으로 형변환이 됨
		 */
		
		System.out.println(list);
		
		list.add(1,30);
		System.out.println(list);
		
		int before = list.set(2,40);
		System.out.println("before : " + before);
		System.out.println("after : " + list.get(2));
		System.out.println(list);
		
		for(int i = 0 ; i < list.size() ; i++){
			System.out.println(i + " : " + list.get(i));
		}
		
		
		for(int i = list.size()-1; i>=0; i--){
		list.remove(i);
		System.out.println(list);
		}
	
		//list에 1~100사이의 랜덤값을 10개 저장해주세요
		
		for(int i =0; i < 10 ; i++){
			list.add((int)(Math.random()*100)+1);
		}
		
		System.out.println(list);
		
		//list에 저장된 값의 합계와 평균을 구해주세요.
		int sum=0;
		for(int i =0; i < 10 ; i++){
			sum+=list.get(i);
		}
		double avg = (double)sum/list.size();
		System.out.println(sum + " "+avg);
		
		//최소값과 최대값을 구해주세요
		int min = list.get(0);
		int max = list.get(0);
		
		for(int i = 0 ; i < list.size() ; i++){
			if(min > list.get(i)) min=list.get(i);
			if(max < list.get(i)) max=list.get(i);
		}
		
		System.out.println("max : " + max + " min : " + min);
		
		
		System.out.println(list.contains(99));

		//오름차순 정렬
		
		for(int i = 0 ; i < list.size()-1 ; i++){
			min = i;
			for(int j = i+1 ; j < list.size() ; j++){
				if(list.get(min) > list.get(j)) min = j;
			}
			int temp = list.get(i);
			list.set(i, list.get(min));
			list.set(min, temp);
		}
		
		System.out.println(list);
		
		
		//2차원
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(10);
		list3.add(20);
		list3.add(30);
		
		list2.add(list3); //list3 이라는 변수를 저장한게 아니라 그 안에 있는 ArrayList를 저장했다
		
		list3 = new ArrayList<>();
		list3.add(40);
		list3.add(50);
		
		list2.add(list3);
		
		System.out.println(list2);
		
		for(int i = 0; i < list2.size(); i++){
//			ArrayList<Integer> list4 = list2.get(i);
//			for(int j =0; j < list4.size(); j++){
//				System.out.print(list4.get(j) + "\t");
//			}
//			System.out.println();
			for(int j = 0; j < list2.get(i).size(); j++){
				System.out.print(list2.get(i).get(j)+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

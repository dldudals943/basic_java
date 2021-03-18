package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * 석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 * 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 * 삽입정렬 : 두번째 숫자부터 앞의 숫자들과 비교해서 큰 수를 뒤로 밀고 중간에 삽입하는 방식
		 */
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100)+1;
		}
//		System.out.println(Arrays.toString(arr));
//		
//		//석차구하기
//		int[] rank	= new int[arr.length];
//		for(int i = 0; i <arr.length; i++){
//			rank[i] = 1;
//		}
//	
//		for(int i = 0; i < arr.length; i++){
//			for(int j = 0 ; j <arr.length; j++){
//				if(arr[i]<arr[j]){
//					rank[i]++;
//				}
//			}
//		}
//		
//		for(int i = 0; i < arr.length ; i++){
//			System.out.println(arr[i] + " : " + rank[i] + "등");
//		}
	
		//선택정렬 - 선생님 코드
	
//		for(int i = 0 ; i < arr.length - 1; i++){
//			int min = i;
//			for(int j = i + 1; j < arr.length; j++){
//				if(arr[j] < arr[min]){
//					min = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = arr[min];
//			arr[min] = temp;
//			}
//		System.out.println(Arrays.toString(arr));
		
		//버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		//이건 내가 한 코드
//		
//		for(int i = 0; i < arr.length - 1 ; i++){
//			int count = 0;
//			for (int j = 0; j < arr.length - i - 1 ; j++){
//				if(arr[j] > arr[j+1]){
//					count ++;
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//			System.out.println(count);
//			if(count==0)break;
//			
//		}
//		System.out.println(Arrays.toString(arr));
		
		//선생님이 한 버블 정렬 count가 아니라 boolean 타입으로 한게 포인트이다.
//		for(int i = 0; i < arr.length - 1 ; i++){
//			boolean flag = true;
//			for (int j = 0; j < arr.length - i - 1 ; j++){
//				if(arr[j] > arr[j+1]){
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//					flag = false;
//				}
//			}
//			if(flag)break;
//			
//		}
//		System.out.println(Arrays.toString(arr));
		
		// 삽입정렬 선생님 코딩
		
		for(int i = 1; i < arr.length; i++){
			int temp = arr[i];
			int j;
			for (j = i-1; j >=0; j--){
				if(temp < arr[j]){
					arr[j+1]=arr[j];
				}else{
					break;
				}
			}
			arr[j+1] = temp;
		}
		
		//정렬방법을 알았을 때 코드를 짤 수 있는게 중요하다.
		//지금은 안 씀
		//지금은 퀵정렬이라는걸 씀 퀵정렬이 뭔지만 찾아보셈
		//1. 문법을 알아야한다.
		//2. 내 생각을 문법에 맞게 구체화를 시켜야함
		//3. 안 보고 코드를 짬
		
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
	
	}

}
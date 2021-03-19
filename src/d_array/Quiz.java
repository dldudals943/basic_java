package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		//거스름돈 동전 개수
		int money = (int)(Math.random()*500)*10;
		int[] coin = {500,100,50,10};
		System.out.println("거스름돈 : " + money);
		
		/*
		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		 * 
		 * 거스름돈 : 2860원
		 * 500원 : 5개
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 1개
		 */
		
		//내가 쓴 답
//		int change[] = new int[coin.length];
//		
//		for(int i = 0 ; i < change.length ; i++){
//			change[i] = money / coin[i];
//			money %=coin[i];
//			System.out.println(coin[i] + "원이 " + change[i] + "개 필요하다." );
//		}
//		
		
//		change[0] = money / 500;
//		change[1] = (money - change[0] * 500) / 100;
//		change[2] = (money - change[0] * 500 - change[1] * 100) / 50;
//		change[3] = (money - change[0] * 500 - change[1] * 100 - change[2] * 50) / 10;
//		
//		for(int i = 0 ; i < change.length ; i++){
//		System.out.println(coin[i] + "원이 " + change[i] + "개 필요하다." );
//		}
//		
		//선생님 답
		
		for(int i = 0 ; i < coin.length ; i++){
			int count = money / coin[i];
			money %=coin[i];
			System.out.println(coin[i] + "원이 " + count + "개 필요하다." );
		}
		//더 간단하다
		
		//그래프 그리기
		int[] arr = new int[20];
		for(int i =0;i <arr.length ; i++){
			arr[i] = (int)(Math.random()*5)+1;
		}
		
		System.out.println(Arrays.toString(arr));
		/*
		 * 1~5 사이의 숫자가 발생된 만큼 * 을 사용해 그래프를 그려주세요.
		 * 1 : ***** 5
		 * 2 : **** 4
 		 * 3 : **** 4
 		 * 4
 		 * 5
		 */
		

		
		for (int i = 0; i < 5; i++) {
			int count = 0;
			System.out.print(i + 1 + " : ");
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i + 1) {
					count++;
					System.out.print("*");
				}
			}
			System.out.print(" " + count);
			System.out.println();
		}
		
		arr = new int[10];
		for(int i = 0 ; i < arr.length; i++){
			arr[i] = (int)(Math.random()*5)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		/*
		 * 1~5사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
		 * [4, 2, 1, 2, 5, 1, 4, 4, 2, 1]
		 * [4, 2, 1, 5]
		 */
		
		int count = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if (arr[j] == i + 1) {
					count++;
					break;
				}
			}
		}

		int[] arr2 = new int[count];

		System.out.println(count);
		
		int n = 0;
		for(int i = 0 ; i < 10 ; i++){
			boolean flag = true;
			for (int j = 0; j < count; j++){
				if(arr[i]==arr2[j]){
					flag = false;
				}
			}
			if(flag){
				arr2[n++]=arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

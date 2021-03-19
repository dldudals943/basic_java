package d_array;

import java.util.Arrays;

public class Quiz {

	private static final int count1 = 0;

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
		
		//선생님 답
		int[] temp = new int[5];
		count = 0;
		for(int i = 0; i < arr.length; i++){
			boolean flag = true;
			for(int j =0;j<temp.length;j++){
				if(arr[i]==temp[j]){
					flag=false;
				}
			}
			if(flag){
				temp[count++] = arr[i];
			}
		}
		
		int[] result = new int[count];
		for(int i = 0 ; i < result.length; i++){
			result[i] = temp[i];
		}
		
		System.out.println(Arrays.toString(result));
		
		//내 코딩과 다르게 일단 5개의 최대값을 산정하여 임시 배열을 만들고 시작하셨다.
		
		
		//오늘의 과제
		arr = new int[100];
		for(int i = 0 ; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100) + 1;
		}
		/*
		 * 2~5사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을 정렬하여 출력해주세요.
		 * 5
		 * [5, 10, 15, 20, 25, 30]
		 */
		
		int n1 = (int)(Math.random()*4)+2;
		System.out.println(n1+"로 나눕니다.");
		int[] arr3 = new int[50];
		int count1 = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			if (arr[i] % n1 == 0) {
				for (int j = 0; j < arr3.length; j++) {
					if (arr[i] == arr3[j]) {
						flag = false;
					}
				}

				if (flag) {
					arr3[count1++] = arr[i];
				}
			}
		}
		System.out.println(Arrays.toString(arr3));
		count1 =0;
		for (int i =0; i < arr3.length; i++){
			if (arr3[i]==0) break;
			count1++;
		}
		System.out.println(count1);
		int[] arr4 = new int[count1];
		for(int i = 0 ; i < count1 ; i++){
			arr4[i]=arr3[i];
		}
		System.out.println(Arrays.toString(arr4));
		
		for(int i = 1; i < arr4.length; i++){
			int temp1 = arr4[i];
			int j;
			for (j = i-1; j >=0; j--){
				if(temp1 < arr4[j]){
					arr4[j+1]=arr4[j];
				}else{
					break;
				}
			}
			arr4[j+1] = temp1;
		}
		
		System.out.println(Arrays.toString(arr4));
		
		
		
		
		
		
		
		
		
	}

}

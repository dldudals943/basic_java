package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * 배열
		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * - 참조형 타입이다.
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경 할 수 없다.
		 * - 주소를 저장합니다.
		 */
		
		int[] array; // 대괄호의 위치는 타입 뒤와 변수 이름 뒤 둘 다 상관없지만 보통 타입 뒤에 붙입니다.
		array = new int[5]; //배열의 크기 혹은 길이 설정 여기서는 int 5개가 들어가는 배열을 만들었다.
		//배열의 초기화 방법은 이거 이외에도 있지만 이 방법은 기본값(0)으로 다 초기화를 시켜준다.

		/*
		 * 변수 = 주소(100번지)
		 * 
		 * 100번지 - 첫번째 값의 주소
		 * {0,0,0,0,0}
		 */
		
		array = new int[]{1,2,3,4,5}; //두 번째 배열의 초기화 방법 실제 저장하고 싶은 값을 중괄호 안에다가 넣어준다.
		//이 경우에도 또하 5개를 저장할 수 있는 배열이 된다.
		
		//array = {1,2,3,4,5}; // 이 방법은 선언과 초기화를 동시에 이용해야한다.
		
		int[] array2 = {1,2,3,4,5}; //선언과 동시 초기화. 상황에 맞게 이용하면 된다.
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		
		for(int i = 0; i < array.length; i++){
			array[i] = (i+1) * 10;
		}
		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		int[] arr = new int[10];
		
		//배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
		for(int i=0 ; i < arr.length ; i++){
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		//배열의 저장된 모든 값의 합계와 평균을 출력해주세요.
		int sum = 0;
		
		for (int i=0; i <arr.length; i++){
			sum += arr[i];
		}
		
		double avg = (double)sum / arr.length;
		
		System.out.println("합계 : " + sum + " / 평균 : " + avg);
		
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++){
			if (arr[i]>max) max = arr[i];
			if (arr[i]<min) min = arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("최소값 : " + min + " / 최대값 : " + max);
		
		int[] shuffle = new int[10];
		for(int i = 0; i < shuffle.length; i++){
			shuffle[i]= i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		int a=0;
		int temp=0;
		for (int i = 0 ; i < shuffle.length ; i++){
			a=(int)(Math.random()*shuffle.length); // 배열의 인덱스는 0부터 시작에 주의
			temp = shuffle[0];
			shuffle[0] = shuffle[a]; //for 문 안에서 선언을 하면 for문이 끝나면 변수가 사라지는데
			shuffle[a] = temp; // for 바깥에서 선언을 하면 변수가 사라지지 않는다는 단점이 있는데
			//for를 너무 많이하면 선언을 for가 돌 때마다 하게 되니까 이것도 그다지 좋은 방법은 아님 서로 장단점이 있음
		}
		
		System.out.println(Arrays.toString(shuffle));
		
		//1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		int[] count1_10 = new int[10];
		for (int i = 0; i < 500 ; i++){
			int random = (int)(Math.random()*10)+1; //1~10사이의 랜덤값임에 주의
			count1_10[random-1]++;
		}
		
		System.out.println(Arrays.toString(count1_10));
		for(int i = 0; i < count1_10.length; i++){
			System.out.println( (i+1) + "이 생성된 횟수는 "+ count1_10[i] + "번 입니다."  );
		}
		int sum1 = 0;
		for(int i = 0; i < count1_10.length; i++){
			sum1 += count1_10[i];
		}
		System.out.println("총 생성된 횟수는 " + sum1 + "입니다.");
		
		

		
	}

}

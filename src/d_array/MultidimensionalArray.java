package d_array;

import java.util.Arrays;

public class MultidimensionalArray {

	public static void main(String[] args) {
		//배열 안에 배열이 들어있는 게 다차원 배열이다.
		//2차원 배열
		int[][] array2;
		//3차원 배열
		int[][][] array3;
		
		int[][] arr = new int[2][3]; //가장 일반적인 방법
		/*
		 * 변수 = 주소 1 (100번지)
		 * 
		 * 100번지
		 * {주소2(200번지)}, 주소3(300번지)
		 * 
		 * 200번지
		 * {0,0,0}
		 * 
		 * 300번지
		 * {0,0,0}
		 * 
		 */
		
		int arr2[][] = new int[][]{{1,2,3},{4,5,6}};
		int[] arr3[] = {{1,2,3},{4,5,6},{7,8,9}}; //이 방법은 반드시 선언과 초기화를 동시에 해야함 대괄호 위치는 상관 없다 대괄호 숫자만 맞추면 됨
		
		int[][] arr4 = new int[3][]; // 가변 배열 일부만 길이를 정할 수도 있다
		
		arr4[0] = new int[3];
		arr4[1] = new int[4];
		arr4[2] = new int[10]; //각 배열의 크기를 다르게 할 수도 있다.
		
		System.out.println(arr[0][1]);
		
		
//		arr[0]=10; //값을 저장할 수가 없다.
		arr[0] = new int[5]; //배열을 저장해야 한다.
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 200; //값을 저장하기 위해서는 2차원까지 지정해야한다.
		
		System.out.println(arr.length); //1차원 배열의 길이
		System.out.println(arr[0].length); //2차원 배열의 길이
		
		 for(int i = 0 ; i < arr.length; i++){
			 for(int j = 0 ; j < arr[i].length; j++){
				 System.out.println(arr[i][j]);
			 }
		 }
		
		
		//간단한 문제를 냄
		 
		int[][] scores = new int[3][5];
		int[] sum = new int[scores.length];
		double[] avg = new double[scores.length];
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int) (Math.random() * 101);
			}
			System.out.println(Arrays.toString(scores[i]));
		}
		 
		 //3명의 학생이 5과목 씩 점수를 가지고 있다.
		 //5과목의 합계와 평균을 저장해주세요.
		 
		 for(int i = 0; i < scores.length ; i ++){
			 for(int j = 0; j < scores[i].length ; j++){
				 sum[i] += scores[i][j];
			 }
			 avg[i] = (double)sum[i] / scores[i].length; //double 넣는거 까먹었음
			 System.out.println(i+1 + "번째 학생의 총 점수는 " + sum[i] + "이고 평균은 " + avg[i]+ "이다.");
		 }
		 
		 
		 //내일 시험을 볼거임. 지금부터 내는 문제를 시험을 볼거에요
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

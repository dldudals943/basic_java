package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class NeoSecretMap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정사각형의 크기는?");
		int n = Integer.parseInt(s.nextLine());
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		System.out.println("arr1의 수를 하나씩 입력해주세요.");
		for(int i = 0; i < n ; i++){
			arr1[i] = Integer.parseInt(s.nextLine());
		}
		System.out.println("arr2의 수를 하나씩 입력해주세요.");
		for(int i = 0; i < n ; i++){
			arr2[i] = Integer.parseInt(s.nextLine());
		}
		
		
		String[] arr_ans = new String[n];
		for(int i = 0; i < n ; i++){
			arr_ans[i]=Integer.toBinaryString(arr1[i]|arr2[i]);	
			arr_ans[i]=arr_ans[i].replace('0',' ');
			arr_ans[i]=arr_ans[i].replace('1','#');
		}
		
		System.out.println(Arrays.toString(arr_ans));
		
		
		
		
		
		
		

	}

}

package test;

import java.util.Arrays;

public class Test5 {
	public static void main(String[] args) {
		int n = 7;
		
		String answer ="";
		
		String abc = "ttttt yyyyy ZZZZZ";
		char[] arr1 = abc.toCharArray();
		System.out.println(Arrays.toString(arr1));
		
		for(int i = 0 ; i<arr1.length; i++){

			if(65<=arr1[i]&&arr1[i]<=90){
				if(90<arr1[i]+n){
					arr1[i]= (char)((n + arr1[i]) - 26);
				}else{
					arr1[i]= (char)(arr1[i]+n);
				}
			}else if(97<=arr1[i]&&arr1[i]<=122){
				if(122<arr1[i]+n){
					arr1[i]= (char)((n + arr1[i]) - 26);
				}else{
					arr1[i]= (char)(arr1[i]+n);
				}
			}
		}
		
		for(int i : arr1){
			answer += (char)i;
		}
		System.out.println(answer);
		//A는 65번, Z는 90번까지!
		//a는 97번, z는 122번까지!
		
	}
}

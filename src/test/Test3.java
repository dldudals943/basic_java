package test;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		int n=10;
		int m=n-1;
		int answer = 0;
	        int count = 0; 
	        int[] arr = new int[n-1]; // 2부터 n까지 넣을 배열 만들기
	        for(int i=2; i <=n; i++){
	            arr[i-2]=i; // 2부터 n까지 넣어주기
	        }
	        
	        
	        while(true){
	            if(arr[count]!=0 && arr[count]<=Math.sqrt(n)){
	                for(int i = count + 1; i < n-1; i++){
	                    if(arr[i]%arr[count]==0 && arr[i]!=0){
	                        arr[i]=0;
	                        m--;
	                        System.out.println(arr[i]);
	                    }
	                }
	                
	            }
	            count++;
	            if(count>n-2){
	                break;
	            }
	        }
	        
	        for(int i = 0; i < n-1; i++){
	            if(arr[i]!=0){
	                answer++;
	                //System.out.println(arr[i]);
	            }
	        }
	    System.out.println("m은 " + m);
	        
        System.out.println("answer는 " + answer);
        System.out.println(Math.sqrt(10.0));
	}

}

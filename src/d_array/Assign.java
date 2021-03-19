package d_array;

public class Assign {

	public static void main(String[] args) {
		int[] arr = new int[100];
		for(int i = 0 ; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100) + 1;
		}
		/*
		 * 2~5사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을 정렬하여 출력해주세요.
		 * 5
		 * [5, 10, 15, 20, 25, 30]
		 */
		
		int n1 = (int)(Math.random()*4)+2;
		System.out.println(n1);
		int[] arr3 = new int[50];
		int count1 = 0;
		for(int i =0 ; i < arr.length ; i ++){
			if(arr[i]%n1==0){
				arr3[count1++]=arr[i];
			}
		}
	
		count1=0;
		for(int i = 0 ; i < 100; i++){
			for(int j = 0 ; j < arr3.length ; j++){
				if(arr3[j]==i){
					count1++;
				}
			}
			}
		
		System.out.println(count1);
		int[] arr4 = new int[100-count1];
		
		
		

	}

}

package codingTest;

public class TrialExamination {

	public static void main(String[] args) {
		int[] answers = {3,3,1,1,2,2,4,4,5,5};
		int[] answer;
        int[] arr1 = {1,2,3,4,5}; // 5
        int[] arr2 = {2,1,2,3,2,4,2,5}; // 8
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5}; //10
        int[] count = new int[3];
        
        for(int i = 0; i<answers.length; i++){
            if(answers[i]==arr1[i%arr1.length]){
                count[0]++;
            }
            if(answers[i]==arr2[i%arr2.length]){
                count[1]++;
            }
            if(answers[i]==arr3[i%arr3.length]){
                count[2]++;
            }
        }
        
       
        int[] rank = {1,2,3};
        for(int i =0; i < count.length-1;i++){
            int min = i;
            for(int j =i+1; j< count.length;j++){
                if(count[j]>count[min]){
                    min=j;
                }
            }
            int temp = rank[i];
            rank[i] = rank[min];
            rank[min] = temp;
            
            temp = count[i];
            count[i] = count[min];
            count[min] = temp;
        }
        if(count[0]==count[1]){
            if(count[1]==count[2]){
            	System.out.println(rank[0]+" "+rank[1]+" "+rank[2]);
                //return answer = new int[]{rank[0],rank[1],rank[2]};
            }
            System.out.println(rank[0]+" "+rank[1]);
            //return answer =new int[]{rank[0],rank[1]};
        }
        
        
        System.out.println(rank[0]);
       // return answer = new int[]{rank[0]};

	}

}

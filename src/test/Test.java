package test;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String[] board ={"BAAD",
				"AAAD","AACD","ABCD"};
		int m = 4;
		int n = 4;
		int answer = 0;
		String[][] board2 = new String[m][n];
		int count2 = 0;
		
		
		for(int i =0 ; i < m; i++){
	            for(int j =0 ; j < n; j++){
	            	if(('A' <= board[i].charAt(j) && board[i].charAt(j) <= 'Z')){
	                board2[i][j] = board[i].substring(j,j+1);
	            	}
	            }
	        }
	        
         do{
        	 count2 = 0;
         int[][] board3 = new int[m][n];
			for (int i = 0; i < m - 1; i++) {
				for (int j = 0; j < n - 1; j++) {
					if (board2[i][j] != null && board2[i+1][j] != null && board2[i][j+1] != null && board2[i+1][j+1] != null) {
						if(board2[i][j].equals(board2[i][j+1]) && board2[i+1][j].equals(board2[i+1][j+1]) && board2[i][j+1].equals(board2[i+1][j+1]) && board2[i][j].equals(board2[i+1][j])){
								board3[i][j] = 1;
								board3[i][j + 1] = 1;
								board3[i + 1][j] = 1;
								board3[i + 1][j + 1] = 1;
							}
						}
					}
				}
         

	        for(int i =0 ; i < m ; i++){
	            for(int j = 0 ; j < n; j++){
	                if(board3[i][j]==1){
	                    board2[i][j]=null;
	                    count2++;
	                    answer++;
	                }
	            }
	        }
	        
	        
	        int count = 0;
	        do{
	        	count = 0;
	        for(int i = m-1 ; i >0  ; i--){
	            for(int j = 0 ; j < n; j++){
	                if(board2[i][j]==null && board2[i-1][j]!=null){
	                	count++;
	                    board2[i][j] = board2[i-1][j];
	                    board2[i-1][j] = null;
	                }
	            }
	        }}while(count!=0);
	

         }while(count2!=0);
	        
	        System.out.println(answer);
	        
	        

	        
		
	}

}

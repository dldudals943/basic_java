package test;

public class Test {

	public static void main(String[] args) {
		String[] board ={" AAA",
				"AAAA","AAAA","AAAA"};
		int m = 4;
		int n = 4;
		int answer = 0;
		String[][] board2 = new String[m][n];
		
		
		
		for(int i =0 ; i < m; i++){
	            for(int j =0 ; j < n; j++){
	                board2[i][j] = board[i].substring(j,j+1);   
	            }
	        }
	        
         for(int l=0;l<2*m+10;l++){
         int[][] board3 = new int[m][n];
	        for(int i =0 ; i < m -1 ; i++){
	            for(int j = 0 ; j < n -1 ; j++){
	            	if(board2[i][j].equals("&")==false){
	                if(board2[i][j].equals(board2[i][j+1])){
	                    if(board2[i][j].equals(board2[i+1][j])&&board2[i+1][j].equals(board2[i+1][j+1])){
	                        board3[i][j] = 1;
	                        board3[i][j+1] = 1;
	                        board3[i+1][j] = 1;
	                        board3[i+1][j+1] = 1;
	                    }
	                }
	            }}
	        }

	        for(int i =0 ; i < m ; i++){
	            for(int j = 0 ; j < n; j++){
	                if(board3[i][j]==1){
	                    board2[i][j]="&";
	                    answer++;
	                }
	            }
	        }
	        
	        
	        
	        for(int k=0; k < 2*m+10 ; k++){
	        for(int i = m-1 ; i >0  ; i--){
	            for(int j = 0 ; j < n; j++){
	                if(board2[i][j].equals("&")){
	                    board2[i][j] = board2[i-1][j];
	                    board2[i-1][j] = "&";
	                }
	            }
	        }}
	

         }
	        
	        
	        
	        
	        
     
		
	        System.out.println(answer);
	        
	        
	        
	        
	        
	        
	        
		
	}

}

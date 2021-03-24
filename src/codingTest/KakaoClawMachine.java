package codingTest;

import java.util.Arrays;

public class KakaoClawMachine {

	public static void main(String[] args) {
		int[][] board = new int[5][5];
		board[0]=new int[]{0,0,0,0,0};
		board[1]=new int[]{0,0,1,0,3};
		board[2]=new int[]{0,2,5,0,1};
		board[3]=new int[]{4,2,4,4,2};
		board[4]=new int[]{3,5,1,3,1};
		
		int[] moves = new int[]{1,5,3,5,1,2,4};
		
        int answer = 0;
        int[] basket = new int[board.length*board[0].length];
        int count = 0;
        
        
        //뽑기 아직까지는 컴파일 에러 없음
        for(int i = 0 ; i < moves.length ; i++){
            int x=moves[i]-1;
            int doll = -1;
            for(int j = 0 ; j < board.length ; j++){
            if(board[j][x]!=0){//해당 자리가 비어있지 않다면
                doll = board[j][x]; // 인형을 집는다
                board[j][x] = 0; // 인형이 있던 자리를 비어있게 한다
                break; //for문을 부순다
            }    
            }
            if(doll != -1){ //인형을 집는데에 성공한다면
                basket[count++] = doll; //바구니에 count자리에 인형을 넣고 count를 1 늘린다
            }
            System.out.println(Arrays.toString(basket));
            int pop = 0;
            do{
            pop = 0;
            for(int j = 0 ; j < count-1 ; j++){ //바구니에서 인형이 터지는 것을 체크하기위한 for문이다
                                                //count-1만큼의 인형의 연속을 체크한다
                if(basket[j]>0&&(basket[j]==basket[j+1])){
                    basket[j]=0; // 터진 바구니 인덱스에 0
                    basket[j+1]=0; // 같이 터져서 0
                    answer +=2; //answer에 인형이 터진 갯수를 더한다 당연히 2이다
                    pop +=2; //pop이라는 변수에도 2를 넣는다
                    count-=2; //count에 2를 빼서 바구니 인형 두 개 만큼 안 쪽에 넣게한다.
                    }

            }
            }while(pop!=0); //pop이 0이 되면 인형 터지는 체크를 중단한다

            //지금봤는데 어차피 while문 자체가 필요가 없는걸?
            
        }

	}

}

package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		/*
		 * 123 1~9사이에 중복되지 않는 3개의 숫자
		 * 135 라고 불렀다고 한다면 숫자와 정답을 비교합니다.
		 * 1strike(1과 수와 자릿수가 같음) 1ball(3이 있긴 하지만 자릿수가 다름) 1out(5는 존재하지 않음)
		 * 
		 * 
		 * 
		 * 768 : 1S 0B 2O
		 * 743 : 0S 1B 2O
		 * 543 : 0S 1B 2O
		 * 924 : 1S 1B 1O
		 * 461 : 1S 0B 2O
		 * 963 : 0S 0B 3O
		 * 524 : 1S 1B 1O
		 * 254 : 0S 2B 1O
		 * 219 : 0S 1B 2O
		 * 164 : 0S 1B 2O
		 * 428 : 3S
		 */

		int a = (int)(Math.random()*9)+1;
		int b = (int)(Math.random()*9)+1;
		int c = (int)(Math.random()*9)+1;
		
		while( a == b || b == c || c == a ){
			if(a == b){
				b = (int)(Math.random()*9)+1;
			}
			if(b == c){
				c = (int)(Math.random()*9)+1;
			}
			if(c == a){
				a = (int)(Math.random()*9)+1;
			}
		}
		
		Scanner s = new Scanner(System.in);
		int x=0;
		int y=0;
		int z=0;
		int input = 0;
		
		while(a!=x || b!=y || c!=z){
		System.out.println("각 자리수가 중복하지 않는 3자리의 숫자를 입력해주세요>");

		
		input = Integer.parseInt(s.nextLine());
		x = (input%1000)/100;
		y = (input%100)/10;
		z = (input%10);
		
		int strike = 0;
		int ball = 0;
		int out = 0;
		
		//스트라이크 체크
			if(a==x){
				strike +=1;
			}
			if(b==y){
				strike +=1;
			}
			if(c==z){
				strike +=1;
			}
		//볼 체크
			if(a==y || a==z){
				ball +=1;
			}
			if(b==x || b==z){
				ball +=1;
			}
			if(c==x || c==y){
				ball +=1;
			}
		//아웃 체크
		out = 3 - strike - ball;

		System.out.println(strike + "S " + ball + "B " + out + "O");
		
		
		
		
		
		 //선생님 코딩
		 	int a1 = 0;
		 	int a2 = 0;
		 	int a3 = 0;
		 
		 	do{
		 	a1 = (int)(Math.random()*9)+1;
		 	a2 = (int)(Math.random()*9)+1;
		 	a3 = (int)(Math.random()*9)+1;
		 
		 	}while(a1==a2 || a1 == a3|| a2 == a3);
		 	
		 	int count = 0;
		 	
		 	while(true){
		 		System.out.println("3자리 숫자>");
		 		int input2 = Integer.parseInt(s.nextLine());
		 		int i3 = input % 10;
		 		input /=10;
		 		int i2 = input % 10;
		 		input /=10;
		 		int i1 = input % 10;
		 		
		 		int strike2 = 0;
		 		int ball2 = 0;
		 		int out2 = 0;
		 		
		 		if(a1 == i1) strike2 ++;
		 		if(a2 == i2) strike2 ++;
		 		if(a3 == i3) strike2 ++;
		 		
		 		if(a1 == i2 || a1 == i3) ball2 ++;
		 		if(a2 == i1 || a2 == i3) ball2 ++;
		 		if(a3 == i1 || a3 == i2) ball2 ++;
		 		
		 		out2 = 3 - strike2 - ball2;
		 		
		 		System.out.println( ++count + "차 시도(" + i1 + i2 + i3 + ") : " + strike2 + "S " + ball2 + "B " + out2 + "O");
		 		System.out.println("------------------------------------");
		 		if (strike2 == 3){
		 			System.out.println("정답입니다!");
		 			break;
		 		}
		 	
		 		
		 	//선생님 코딩이 가독성이 더 좋은 것 같다	
		 	//과제를 하면서 공부가 되었는가가 중요하다
		 		
		 		
		 		
		 		
		 		
		 	}
		 	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

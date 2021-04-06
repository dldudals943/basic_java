package test;

import java.math.BigInteger;

public class Test2 {

	public static void main(String[] args) {
	     
		BigInteger n = new BigInteger("45");
		System.out.println(new BigInteger("0021",3));

		
        
//        do{
//        a=n.divide(new BigInteger("3"));
//        b=n.remainder(new BigInteger("3"));
//        n3 += (int)(b * Math.pow(10,count++));
//        n=a;
//        }while(a>=1);
//        //10진법을 3진법으로 바꾸기
//        count = 0;
//        //카운트 초기화
//      
//        
//        int dm = (int)(Math.log10(n3)+1);
//        //dm은 n3의 자릿수를 의미함
//        int ren3 = 0;
//        //ren3는 앞뒤 반전 3진법이다
//        for(int i = 0 ; i < dm ; i++){
//            b=n3%10;
//            ren3 += (int)(b*Math.pow(10,dm-i-1));
//            n3/=10;
//        }
//        //앞뒤 반전을 시켜준다
//        int lastn = 0;
//        //lastn은 최종 결과값을 의미한다
//        
//        for(int i = 0 ; i < dm ; i++){
//            b=ren3%10;
//            lastn += (int)(b * Math.pow(3,i)); //3진법이니까 3의 승수로 해야하는 것을 주의하자
//            ren3/=10;
//        }
        //10진법으로 변경하고 answer 값에 넣어 최종 출력하자
        
//        answer = lastn;
//        System.out.println(answer);
//	       
	       
	}

}

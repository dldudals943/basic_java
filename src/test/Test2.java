package test;

import java.math.BigInteger;

public class Test2 {

	public static void main(String[] args) {
	    int input = 1000000;
	
	    String input2 = Integer.toString(input);
		
		
		BigInteger n = new BigInteger(input2);
		//System.out.println(new BigInteger("0021",3));

		int count = 0;
		BigInteger n3 = new BigInteger("0");
		BigInteger a = new BigInteger("0");
		BigInteger zero = new BigInteger("0");
		
        do{
        a=n.divide(new BigInteger("3"));
        BigInteger b=n.remainder(new BigInteger("3"));
        String ar = Integer.toString((int)Math.pow(10,count++));
        BigInteger c = new BigInteger(ar);
        n3 = n3.add((b.multiply(c)));
        n=a;
        }while(a.compareTo(zero)==1);
        //10진법을 3진법으로 바꾸기
        count = 0;
        //카운트 초기화
        System.out.print("입력 받은 값을 3진법으로 변환한 값\t");
        System.out.println(n3);
        
        int dm = n3.toString().length(); // 자리수표현
        System.out.print("3진법 값의 자리수\t");
        System.out.println(dm);
        
        BigInteger ten = new BigInteger("10");
        BigInteger b = new BigInteger("0");
        BigInteger ren3 = new BigInteger("0");
        for(int i = 0 ; i < dm ; i++){
        	b = n3.remainder(ten);
        	BigInteger arr = new BigInteger(Integer.toString((int)Math.pow(10,dm-i-1)));
        	ren3 = ren3.add((arr.multiply(b)));
        	n3 = n3.divide(ten);
        	
        }
        
        System.out.print("변환값의 자리를 거꾸로 바꾼 값\t");
        System.out.println(ren3);
        
        int dm2 = ren3.toString().length();
        System.out.print("바꾼 값의 자리수\t");
        System.out.println(dm2);
        
        BigInteger res = new BigInteger("0");
        BigInteger mul = new BigInteger("1");
        BigInteger three = new BigInteger("3");
        
        for(int i = 0 ; i < dm2 ; i++){
        	BigInteger arr = ren3.remainder(ten);
        	res = res.add(arr.multiply(mul));
        	ren3 = ren3.divide(ten);
        	mul = mul.multiply(three);
        }
        
        
        
        System.out.print("최종 10진법 환산 값\t");
        
        int answer = res.intValue();
        System.out.println(answer);
       
    
	       
	}

}

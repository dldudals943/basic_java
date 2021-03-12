package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * 논리 연산자
		 * - &&(AND), ||(OR), !(NOT)
		 * - 피연산자로 boolean만 허용한다.
		 */
		
		int x = 10;
		int y = 20;
		boolean b = 0 < x && x < 10 || x < y ;  // and와 or가 함께 있으면  and가 우선순위가 높다.		
		
		b = !(x < y); //느낌표 우선순위 주의
		
		//논리연산은 효율적인 연산을 한다
		b = true && true; //true
		b = true && false; //false
		b = false && true; //false
		b = false && false; //false
		
		b = true || true; //true
		b = true || false; //true
		b = false || true; //true
		b = false || false; //false
		
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다. (주의)
		
		int a = 10;
		b = a < 5 && 0 < a++; //boolean 값이 왼쪽에서 false로 정해졌기 때문에 a++ 연산이 수행되지 않는다.
		System.out.println(a); //따라서 11이 아니라 10이 나옴
		
		//다음의 문장들을 코드로 작성해주세요.
		//1. x가 y보다 크고 x가 10보다 작다.
		
		b = x > y && x < 10;
		System.out.println(b);
		
		//2. x가 짝수이고 y보다 작거나 같다.
		
		b = x%2 == 0 && x <= y; 
		System.out.println(b);
		
		//3. x가 3의 배수이거나 5의 배수이다.
		
		b = x%3 == 0 || x%5 == 0;
		System.out.println(b);
		
		
		
		
		

	}

}

package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		/*
		 * 비교 연산자
		 * - <, >, <=, >=, ==, !=
		 * - 문자열 비교 : equals()
		 */

		int x = 10;
		int y = 20;
		boolean b = x < y ;
		System.out.println(b);
		b = x <= y - 15 ; // 산술 연산이 먼저 계산됨. 우선순위가 산술연산이 비교연산 보다 높다!
		System.out.println(b);
		
		String str1 = "abc";
		String str2 = "abc";
		b = str1 == str2 ; //string 은 참조형 타입. 기본형 타입이 아님 이 비교는 내용을 비교한 게 아니다.
		//참조형 타입이기 때문에 주소를 비교한 것이다.
		System.out.println(b); 
		
		b = str1.equals(str2); //이건 메서드를 이용해서 내용을 비교한 것이다.
		System.out.println(b);
		b = !str1.equals(str2); // 앞에 ! 가 붙어서 true를 false로 바꿨다. 또는 false를 true로 바꿀 수도 있다.
		System.out.println(b);
		
		//다음의 문장들을 코드로 작성해주세요.
		// 1. x는 y보다 작거나 같다.
		b = x <= y;
		System.out.println(b);
		// 2. x + 5는 y는 같다.
		b = x+5 == y;
		System.out.println(b);
		// 3. y는 홀수이다.
		b = y % 2 != 0;
		System.out.println(b);
		// 4. "기본형"과 "참조형"은 다르다.
		b = !"기본형".equals("참조형");
		System.out.println(b);
		
		
		
		
	}

}

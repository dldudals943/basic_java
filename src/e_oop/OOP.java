package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * 객체지향 프로래밍(Object Oriented Programming)
		 * - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는 것
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 */
		
//		SampleClass sc = new SampleClass();
//		
//		System.out.println(sc.field);
//		
//		String returnValue = sc.method1(5);
//		
//		System.out.println(returnValue);
//		
//		sc.method2();
//		
//		sc.flowTest1();
		
		//메인 메서드는 호출하지 않는다 되긴하는데 굳이 할 필요가 없음
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		
		Calculator cal = new Calculator();
		double a = 123456;
		double b = 654321;
		double c = cal.plus(a,b);
		System.out.println(c);
		//2. 1번의 결과값 * 123456
		double d=cal.multiply(c, 123456);
		System.out.printf("%f\n", d); //큰 숫자의 실수 표현을 하려면 printf를 이용해주면 된다.
		//3. 2번의 결과값 / 123456
		double e=cal.divide(d, 123456);
		System.out.println(e);
		//4. 3번의 결과값 - 654321
		double f = cal.minus(e, 654321);
		System.out.println(f);
		//5. 4번의 결과값 % 123456
		double g = cal.reminder(f, 123456);
		System.out.println(g);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

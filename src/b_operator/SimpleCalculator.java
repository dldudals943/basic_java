package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// 두 개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		// + - * / % 만 하면 됨
		// 영타 200타 이상 되게 연습을 해주세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("연산자");
		String op = sc.nextLine();
		System.out.println("두 번째 숫자");
		int num2 = Integer.parseInt(sc.nextLine()); 
		
		String result;
		
		result = op.equals("+") == true ? Integer.toString(num1 + num2) : (op.equals("-") == true ? Integer.toString(num1 - num2) : 
			(op.equals("*") == true ? Integer.toString(num1 * num2) : (op.equals("/") == true ? Integer.toString(num1 / num2) : 
				(op.equals("%") == true ? Integer.toString(num1 % num2) : "계산불가")))) ;

		System.out.println(num1 +" "+ op +" "+ num2 +" = "+ result );
		
		
	}

}

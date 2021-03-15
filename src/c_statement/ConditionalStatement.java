package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
//		/*
//		 * 조건문
//		 * - if 문
//		 * - switch문
//		 * 
//		 * if 문
//		 * - if(조건식){} : 조건식의 결과가 true이면 블럭안의 문장을 수행한다.
//		 * - else if(조건식){} : 다수의 조건이 필요할 때 if에 추가한다.
//		 * - else{} : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
//		 */
//
//		int a = 1;
//		
//		if(a == 1){
//			System.out.println("조건식의 연산결과가 true이면 수행된다.");
//		}
//		
//		if(a == 0){
//			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
//		}
//		
//		
//		if(a == 1){ //true가 여러 개일 경우에도 처음 true였던 항목만 수행
//			System.out.println("a가 1인 경우에 하고 싶은 것");
//		}else if(a == 2){
//			System.out.println("a가 2인 경우에 하고 싶은 것");
//		}else if(a == 3){
//			System.out.println("a가 3인 경우에 하고 싶은 것 ");
//		}else{
//			System.out.println("이외의 경우에 하고 싶은 것");
//		}
//		
//		if(a < 10){
//			System.out.println("a가 10보다 작다.");
//		}if(a < 20){
//			System.out.println("a가 20보다 작다.");
//		}
//		//자주 하는 실수. 붙어있다고 한 세트가 아니다.
//		
//		if(a < 10){
//			System.out.println("a가 10보다 작다.");
//		}else if(a < 20){
//			System.out.println("a가 20보다 작다.");
//		}
//		//else if로 해줘야 한 세트로 동작이 된다.
//		
//		//간단한 문제
//		int score = 70;
//		//점수가 60점 이상이면 합격 그렇지 않으면 불합격이라고 출력해주세요.
//		if(score >= 60){
//			System.out.println("합격");
//		}else{
//			System.out.println("불합격");
//		}
//		
//		//점수에 등급을 부여하는 프로그램
//		score = 80;
//		String grade = null;
//		
//		if(90 <= score){
//			grade = "A";
//		}else if(80 <= score){
//			grade = "B";
//		}else if(70 <= score){
//			grade = "C";
//		}else if(60 <= score){
//			grade = "D";
//		}else{
//			grade = "F";
//		}
//		System.out.println(score + "점에 해당하는 등급은 " + grade +"입니다.");
//		
//		/*
//		 * 기본값 : 직접 초기화하지 않았을 때 초기화 되는 값
//		 * 메서드 밖에서 변수를 만들어도 기본값으로 알아서 초기화가 됨
//		 * - 참조형 타입 : null
//		 * - boolean : false
//		 * - char : ' '(0) <-공백
//		 * - 나머지 : 0
//		 */
//		
//		
//		
//		score = 93;
//		grade = null;
//		
//		if (90 <= score) {
//			grade = "A";
//
//			if (97 <= score) {
//				grade += "+";
//			} else if (score <= 93) {
//				grade += "-";
//			}
//		} else if (80 <= score) {
//			grade = "B";
//			if (87 <= score) {
//				grade += "+";
//			} else if (score <= 83) {
//				grade += "-";
//			}
//		} else if (70 <= score) {
//			grade = "C";
//			if (77 <= score) {
//				grade += "+";
//			} else if (score <= 73) {
//				grade += "-";
//			}
//		} else if (60 <= score) {
//			grade = "D";
//			if (67 <= score) {
//				grade += "+";
//			} else if (score <= 63) {
//				grade += "-";
//			}
//		} else if (50 <= score) {
//			grade = "E";
//			if (57 <= score) {
//				grade += "+";
//			} else if (score <= 53) {
//				grade += "-";
//			}
//		} else {
//			grade = "F";
//			if (47 <= score) {
//				grade += "+";
//			} else if (score <= 43) {
//				grade += "-";
//			}
//		}
//		
//		System.out.println(score +"점에 해당하는 등급은 " + grade +"입니다.");
//		
//		//코드를 작성하면서 신경을 써야하는 부분 '{' 블럭이 시작하고 그 다음 줄에서 tab으로 들여쓰기를 맞춰줘야함
//		//컴파일 에러사항은 아니지만 가독성 부분에서 매우매우매우 큰 차이가 나므로 양식이라고 생각해도 된다.
//		//정렬 : Ctrl + Shfit + F
//		//블럭 지정을 하고 사용하는 것을 추천합니다. 주석까지 정렬을 해버려서 흐트러질 수 있으니, 블럭을 지정하고 사용해주세요.
//		
//		/*
//		 * switch문
//		 * - switch (int/String){ case 1: break;}
//		 * - 조건식의 결과는 정수와 문자열만(JDK1.7부터 문자열 허용) 허용한다.
//		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
//		 * - break를 만날 때까지 수행한다.
//		 */ 
//		
//		a = 20; //int
//		switch (a) {
//		case 10:
//			System.out.println("a가 10인 경우에 하고 싶은 것");
//			break;
//		case 20:
//			System.out.println("a가 20인 경우에 하고 싶은 것");
//			break;
//		default:
//			System.out.println("이외에 경우에 하고 싶은 것");
//		}
//		
//		//switch문은 상당히 제한적이라 if문을 자주 사용하게 됨.
//		//switch문을 if문으로 표현할 수 있지만 if문을 switch문으로 표현할 수 없다
//		//다만 같은 표현일 경우에 if문보다 switch문이 더 빠르다고 한다.
//		//그렇지만 왠만하면 if문을 사용한다.
//		
//		
//		String b = "a";
//		switch (b) {
//		case "a":
//			System.out.println("b가 \"a\"인 경우에 하고 싶은 것");
//			break;
//		case "b":
//			System.out.println("b가 \"b\"인 경우에 하고 싶은 것");
//			break;
//		default:
//			System.out.println("이외에 경우에 하고싶은 것");
//		}
//		
//		// \는 탈출 문자. 문자열 안에 " " 를 표현하고 싶어서 \"라고 썼다. 
//		
//		//switch문으로 한 가지 표현을 만들어 봅시다
//		
//		//월에 해당하는 계절을 출력
//		int month = 1;
//		String season = null;
//
//		switch (month) {
//		case 3:case 4:case 5:
//			season = "봄";
//			break;
//		case 6:case 7:case 8:
//			season = "여름";
//			break;
//		case 9:case 10:case 11:
//			season = "가을";
//			break;
//		case 12:case 1:case 2:
//			season = "겨울";
//			break; //어차피 끝나기 때문에 break를 해도 되고 안 해도 상관없음.
//		}
//
//		System.out.println(month + "에 해당하는 계절은 " + season + "입니다.");
//		
//		score = 97;
//		grade = null;
//		switch(score/10){
//		case 10 : case 9 : grade = "A";
//		break;
//		case 8 : grade = "B";
//		break;
//		case 7 : grade = "C";
//		break;
//		case 6 : grade = "D";
//		break;
//		default : grade = "F";
//		}
//		
//		System.out.println(score + "점에 대한 등급은 " + grade +"입니다.");
//		
////		//문제를 좀 내도록 하겠음
////		//숫자를 입력 받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
////		
//		Scanner sc = new Scanner(System.in);
////		System.out.print("숫자 입력>");
////		int num = Integer.parseInt(sc.nextLine());
////
////		switch (num) {
////		case 0:
////			System.out.println("0 입니다.");
////			break;
////		default:
////			System.out.println("0이 아닙니다.");
////		}
////		
////		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
////		System.out.print("숫자 입력>");
////		num = Integer.parseInt(sc.nextLine());
////		
////		if (num % 2 == 0) {
////			System.out.println("짝수입니다.");
////		} else {
////			System.out.println("홀수입니다.");
////		}
////		
//		//점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
//		System.out.print("숫자 입력>");
//		int a1 = Integer.parseInt(sc.nextLine());
//		System.out.print("숫자 입력>");
//		int b1 = Integer.parseInt(sc.nextLine());
//		System.out.print("숫자 입력>");
//		int c1 = Integer.parseInt(sc.nextLine());
//		
//		int sum1 = a1 + b1 + c1; 
//		double avg1 = Math.round(sum1/3.0*100)/100.0;
//		
//		grade = null;
//		if(90 <= avg1){
//			grade = "A";
//		}else if(80 <= avg1){
//			grade = "B";
//		}else if(70 <= avg1){
//			grade = "C";
//		}else if(60 <= avg1){
//			grade = "D";
//		}else{
//			grade = "F";
//		}
//		
//		System.out.println("총점은 "+sum1+"이고 평균은 "+avg1+"이고 등급은 "+grade+"입니다.");
//		
//		
//		
		
		//1~100 사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요.
//		
//		double a = Math.ceil(Math.random()*100);
//		double b = Math.ceil(Math.random()*100);
//		double c = Math.ceil(Math.random()*100);
//		
//		System.out.println("내림차순");
//		
//		if (a > b) {
//			if (a > c) {
//				if (b > c) {
//					System.out.println(a + " " + b + " " + c);
//				} else {
//					System.out.println(a + " " + c + " " + b);
//				}
//
//			} else {
//				System.out.println(c + " " + a + " " + b);
//			}
//		} else if (b > a) {
//			if (b > c) {
//				if (a > c) {
//					System.out.println(b + " " + a + " " + c);
//				} else {
//					System.out.println(b + " " + c + " " + a);
//				}
//			} else {
//				System.out.println(c + " " + b + " " + a);
//			}
//		}
//	// 내림차순
//		
//		System.out.println("오름차순");
//		
//		if (a > b) {
//			if (a > c) {
//				if (b > c) {
//					System.out.println(c + " " + b + " " + a);
//				} else {
//					System.out.println(b + " " + c + " " + a);
//				}
//
//			} else {
//				System.out.println(b + " " + a + " " + c);
//			}
//		} else if (b > a) {
//			if (b > c) {
//				if (a > c) {
//					System.out.println(c + " " + a + " " + b);
//				} else {
//					System.out.println(a + " " + c + " " + b);
//				}
//			} else {
//				System.out.println(a + " " + b + " " + c);
//			}
//		}
//	// 오름차순
		
		int x = (int)(Math.random()*100)+1; 
		int y = (int)(Math.random()*100)+1;
		int z = (int)(Math.random()*100)+1;
	
		int temp = 0;
		
		if (x>y){
			temp = x;
			x = y;
			y = temp;}
		if(x>z){
			temp = x;
			x = z;
			z = temp;}
		if(y>z){
			temp = y;
			y = z;
			z = temp;}
		
		System.out.println(x + " " + y + " " + z);
		
		


}
}
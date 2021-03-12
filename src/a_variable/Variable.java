package a_variable; //클래스의 위치

import java.util.Scanner;

public class Variable { //클래스, 일단은 좀 복잡한 데이터라고 생각하라

	public static void main(String[] args) { //메써드 ()소괄호가 있으면 무조건 메서드이다
		//메서드 : 명령문의 집합
		//이 메서드의 이름은 main이다
		//main메서드 : 프로그램의 시작과 끝
		//주석 : 프로그램 코드로 인식하지 않는 문장(주로 코드를 설명하는데 쓴다)
		//한줄주석 : ctrl + shift + c 여러줄도 한번에 가능
		/* 범위 주석  : ctrl + shift + / (해제\) */
		//주석은 자주 쓰니까 단축키 외우자

		
		/* 데이터의 종류
		 정수 10 -5 
		 실수 3.14 -1.5
		 문자 'a' '3'
		 논리 true false
		 프로그래밍에서는 데이터를 사용하기 위해 종류별로 이름을 붙여놓았다(자료형 data type)
		 기본형타입
		 정수 byte(1), short(2), *int(4), long(8)
		 실수 float(4), *double(8)
		 문자 char(2)
		 논리 boolean(1)
		 
		 */
		
		//변수를 만드는 것(변수를 선언한다)
		//변수를 만드는 방법 : 데이터타입 변쉶
		int name;
		double pi;
		//long name; 한 블락 {}안에서 변수의 이름은 중복될 수 없다
		//=(대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장
		name = 10; //초기화 : 변수를 처음에 값을 저장하는 것
		pi = 3.14; //변수의 타입에 맞는 값을 저장해야한다
		
		int abc = 30; //보통은 선언과 초기화를 동시에 한다
		long l = 40L; //접미사 L을 붙어야 long 타입이 된다 1이랑 구별이 잘 안 되어서 L은 대문자를 자주 쓴다
		float f = 5.5f; //접미사 f를 붙어야 float 타입이 된다
		char c = '한' ; //따옴표 안에 한글자만 넣어야 한다, 아무것도 안 들어가 있으면 에러가 난다. 최소한 공백이라도 한 글자가 들어가야한다.
		boolean b = true; //true, false <- 이 두 가지 값만 가질 수 있다
		
		//8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.
		
		byte b1 = 24;
		short s1 = 64;
		int i1 = 65000;
		long l1 = 123456789L;
		float f1 = 3.141592f;
		double d1 = 789.456123;
		char c1 = 'C';
		boolean b2 = false;
		
		System.out.println(name);
		//실행 ctrl + F11
		
		name = 100;
		System.out.println(name);
		//위에서 만든 8개의 변수에 새로운 값을 저장하고 출력해주세요.
		
		b1 = 64;
		s1 = 128;
		i1 = 12800;
		l1 = 123456789123L;
		f1 = 0.287f;
		d1 = 123.123;
		c1 = 'F';
		b2 = true;
		
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(c1);
		System.out.println(b2);
		
		/*
		 * 타입 선택의 기준
		 * 정수
		 * - byte, short : 메모리를 절약해야 할 때
		 * - int : 기본
		 * - long : int의 범위를 벗어날 때
		 * 
		 * 실수
		 * - float : 메모리를 절약해야 할 때
		 * - double : 기본
		 */
		
		//문자열
		String str = "문자 여러개..."; // "쌍 따옴표"로 묶여있음 기본형 타입이 아니고 참조형 타입이다.
		//참조형 타입은 변수를 직접 저장하는게 아니고 주소를 저장해서 그 주소에 변수들이 저장된다.
		//기본형 타입은 직접 변수를 저장한다. 참조형 타입은 대부분 클래스이다.
		
		System.out.println(str);
		
		//타입과 크기까지 다 외워야한다
		//형변환이란 데이터의 타입을 다른 걸로 바꾸는 것
		//다른 타입의 값을 저장하기 위해서는 갑의 타입을 변경해주어야 하는데 이를 형변환이라고 한다. (type casting)
		int small = 10;
		long big = 10L;
		
		small = (int)big; //형변환 생략 안 됨.
		big = small; //표현범위가 작은 쪽에서 큰 쪽으로의 형변환은 생략이 가능하다.
		//작은 쪽과 큰 쪽은 잘 생각해야한다 byte차이를 이야기하는게 아니다. 얼마만큼의 수를 표현할 수 있는가?
		//long 보다 float이 표현 범위가 크다 <- 이해안됨
		
		/* 명령규칙 (외워야 함) 
		 * - 영문자 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용할 수 있다.
		 * - 한글이 가능하긴한데 왠만하면 사용하지 않는다.
		 * - 숫자로 시작할 수 없다.
		 * - 예약어는 사용할 수 없다. 자바라는 프로그래밍 언어에서 이미 사용하고 있는 단어
		 * - [낙타식 표기법을 사용한다.(mySampleVariable)] <- 구분을 쉽게 하기 위하여 
		 * - [클래스 명의 첫글자는 대문자로 한다.(MySampleClass)] <- 개발자들끼리의 약속
		 *		
		 */
		
		long l2 = 9000000000000000000L;
		float f2 = 0.287f;
		f2 = l2;
		System.out.println(f2);
		System.out.println(l2);
		
		long l3 = 90L;
		float f3 = 0.5f;
		f3 = l3;
		System.out.println(f3);
		
		/*
		 * 상수
		 * - 처음 담긴 값을 변경 할 수 없는 그릇
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		 */
		
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
		//MAX_NUMBER = 100; <- 값을 바꿀 수가 없음, 컴파일 에러
		
		System.out.print("줄바꿈을 하지 않는다.\n");
		System.out.print("줄바꿈을 하지 않는다.\n");
		// \ 는 이스케이프 문자 탈출 문자라고 함 다음에 나오는 글자의 역할을 바꿔준다
		System.out.print("줄바꿈을 \t한다.");
		System.out.printf("문자열 : %s, 숫자 : %d", "Hello", 10); //출력 포맷을 지정한다.
		System.out.println();
		System.out.println("A" + 100); //문자열을 만나게 되면 무조건 문자열로 바뀜
		System.out.println(10+20+"30");
		System.out.println("10"+20+30);
		
		//입력
		Scanner sc = new Scanner(System.in) ; // 입력받기 위한 클래스
		//Scanner라는 클래스를 못 찾겠어서 컴파일에러가 뜸 보통 같은 패키지에 있어야 사용가능
		//다른 패키지에 있다면 그곳을 지정해줘야함 import로
		//import 단축키 ctrl + shift + o  <- 자동으로 찾아줌
		
		//System.out.print("숫자릅 입력해주세요>");
		//int num = sc.nextInt();
		
//		
//		System.out.print("아무거나 입력하세요>");
//		String str5 = sc.nextLine(); // 문자열을 입력받는 메서드
//		System.out.println("입력받은 내용: " + str5);
//		
		//int nextInt = sc.nextInt();
		//double nextDouble = sc.nextDouble();
		//이런것들이 있지만 버그로 인해 사용하지 않는 것을 권장한다.
		//숫자 입력 받고 문자 입력받으려고 하면 문자 입력을 패스해버림
//		
//		System.out.println("int 입력>");
//		int number = Integer.parseInt(sc.nextLine());
//		//참조형 타입을 기본형 타입으로 형변환 할수가 없다. 그래서 다른 방식으로 형변환해야함
//		System.out.println(number);
//		double number2 = Double.parseDouble(sc.nextLine());
//		System.out.println(number2);
//		
		
		//오늘 배운 내용을 가지고 간단한 문제를 내도록 하겠습니다.
		
		// 자신의 이름을 저장할 변수를 선언해주세요.
		String myName;
		
		//위에서 선언한 변수를 초기화 하기 위해 이름을 입력받아주세요.
		System.out.print("이릅을 입력해주세요>");
		myName = sc.nextLine();
		
		//자신의 나이를 저장할 변수를 선언해주세요.
		int myAge;
		
		//위에서 선언한 변수를 초기화 하기 위해 나이를 입력받아주세요.
		System.out.print("나이를 입력해주세요>");
		myAge = Integer.parseInt(sc.nextLine());
		
		System.out.println("이름: " + myName + " / 나이 : " + myAge);

		//간단한 과제 
		
		//다음과 같은 프로그램을 작성해주세요.
		/*
		 * ================== 회원가입 ===================
		 * 아이디>admin
		 * 비밀번호(4자리숫자)>1234
		 * 이름>홍길동
		 * 나이>30
		 * 키>185.5
		 * ============================================
		 * 회원가입 완료!!
		 * ================= 내 정보 =====================
		 * 아이디 : admin
		 * 비밀번호 : 1234
		 * 이름 : 홍길동
		 * 나이 : 30세
		 * 키 : 185.5cm
		 * =============================================
		 * 
		 */
		
		
		
	}

}
















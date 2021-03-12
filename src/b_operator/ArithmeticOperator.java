package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*산술연산, 비교연산, 논리연산이 있다.
		 * 
		 * 산술 연산
		 * - 사칙연산 : +, -, *, /, %(나머지)
		 * - 복합연산자 : +=, -=, *=, /=, %=
		 * - 증감연산자 : ++, --
		 * 
		 */
		
		int result = 10 + 20 - 30 * 40 / 50 % 60;
		// 자바 언어에서도 곱셈 나눗셈을 먼저 하게 된다
		
		// 나머지 연산
		result = 10 / 3 ;
		System.out.println(result);
		result = 10 % 3;
		System.out.println(result);
		
		//5개의 산술연산자를 이용해 5개의 연산을 수행 후 출력해주세요
		result = 10 + 3 ;
		System.out.println(result);
		result = 10 - 3;
		System.out.println(result);
		result = 10 * 3 ;
		System.out.println(result);
		result = 10 / 3;
		System.out.println(result);
		result = 10 % 3;
		System.out.println(result);

		//복합연산자
		result = result + 3;
		result += 3;
		
		result -= 5;
		
		result *= 2;
		
		result /= 3;
		
		result %= 2;
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		//result = result + 10;
		result += 10;
		//result = result % 5;
		result %= 5;
		//result = result - 2 * 3;
		result -= 2 * 3;
		
		//증감연산자
		//증가연산자(++) : 변수의 값을 1 증가시킨다.
		//감소연산자(--) : 변수의 값을 1 감소시킨다.
		
		int i = 0 ;
		++i; //전위형 : 변수의 값을 읽어오기 전에 1 증가한다.
		i++; //후위형 : 변수의 값을 읽어온 후에 1 증가한다.
		--i; //전위형 : 변수의 값을 읽어오기 전에 1 감소한다.
		i--; //후위형 : 변수의 값을 읽어온 후에 1 감소한다.
		
		i = 0 ;
		System.out.println("++i = " + ++i);
		i = 0 ;
		System.out.println("i++ = " + i++ ); //단독으로쓰면 상관없는데 문장속에 들어가있으면 차이가 좀 난다
		System.out.println(i);
		
		//피연산자의 타입이 서로 같아야만 연산이 가능하다.
		//피연산자가 2개면 이항연산자, 3개면 삼항연산자
		int _int = 10;
		double _double = 3.14;
		
		double result2 = _int + _double; //int -> double 형변환이 생략되어있다. 자동형변환.
		//타입이 다르면 연산이 안 되니 자동으로 형변환을 해준다.
		//result2 = (double)_int + _double;
		
		System.out.println(result2);
		
		long _long = 100L;
		_long = _int + _long; // int -> long 타입 형변환이 숨어있다.
		_int = _int + (int)_long; // long -> int 는 자동 형변환이 안 되니까 해줘야한다.
		
		byte _byte = 5;
		short _short = 10;
		_int = _byte + _short; // int보다 작은 타입은 int로 형변환 된다.
		System.out.println(_int); // 연산을 할 때 최소한 4 byte 짜리로 해야하기 때문이다.
		
		char _char = 'a';
		char _char2 = 'b';
		_int = _char + _char2; // char 타입은 2 byte이기 때문에 4 byte인 int로 형변환된다.
		System.out.println(_int);
		
		//오버플로우, 언더플로우
		//표현범위를 벗어나는 값을 표현할 때 발생하는 현상 byte는 -128 ~ 127 까지임. 2^8 = 256, 2^7 = 128
		//short는 -32768 ~ 32767 까지이다. 2^16=65536, 2^15=32768
		//가장 큰 수에 +1을 하면 가장 작은 수가 된다.
		//가장 작은 수에 -1을 하면 가장 큰 수가 된다.
		
		//short : -2^15 ~ 2^15 - 1
		//int : -2^31 ~ 2^31 - 1
		//long : -2^63 ~ 2^63 - 1
		//char : 0 ~ 2^16 (문자는 음수가 필요없기때문에 음수 영역이 존재하지 않는다.)
		
		
		byte b = 127;
		b++;
		System.out.println(b);
		b--;
		System.out.println(b);
		
		char _char3 = 99;
		System.out.println(_char3);
		
		//다음을 한 줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		long a1 = 123456 + 654321;
		System.out.println(a1);
		a1 *=123456;
		System.out.println(a1);
		a1 /= 123456;
		System.out.println(a1);
		a1 -= 654321;
		System.out.println(a1);
		a1 %= 123456;
		System.out.println(a1);
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 출력해주세요.
		int i1 = 999;
		int i2 = 777;
		int i3 = 124;
		System.out.println(i1+i2+i3);
		System.out.println((double)(i1+i2+i3)/3);
		
		//반올림 메서드
		double res = (Math.round(100*(double)(i1+i2+i3)/3))/100.0;
		System.out.println(res);
		
		//랜덤
		//Math.random() : 0.0 ~ 1.0 미만 (0.9999....)
		int random = (int)(Math.random()*100) + 1; // random의 범위는 1<= random <= 100
		System.out.println(random);
		
		random = (int)93.7; // 이 형변환은 버림을 한다.
		System.out.println(random);
		
		
		
		

	}

}

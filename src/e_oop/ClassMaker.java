package e_oop;

public class ClassMaker {
	
	//전역변수 하나를 선언 및 초기화 해주세요.
	int field = 1234;
	
	//리턴타입과 파라미터가 없는 메서드 하나를 만들어주세요.
	//메서드 안에서 전역변수를 출력해주세요.
	
	void method1(){
		System.out.println(field);
	}
	
	//전역변수와 동일한 타입의 리턴타입이 있고 파라미터는 없는 메서드 하나를 만들어주세요.
	//메서드 안에서 전역변수를 리턴해주세요.
	
	int method2(){
		return field;
	}
	
	//리턴타입은 없고 파라미터가 있는 메서드 하나를 만들어주세요.
	//메서드 안에서 파라미터를 출력해주세요.
	
	void method3(int integer){
		System.out.println(integer);
		return; //void에도 리턴을 쓸 수는 있는데 값을 주지는 못하고 메서드를 종료시키는 역할만 하게 됩니다.
	}
	
	//int 타입의 리턴타입과 int 타입의 파라미터 두 개가 있는 메서드 하나를 만들어주세요.
	//메서드 안에서 두 파라미터를 곱한 결과를 리턴해주세요.
	
	int method4(int int1, int int2){
		return int1 * int2; //메서드를 종료시키는 역할도 있습니다.
	}
	
}

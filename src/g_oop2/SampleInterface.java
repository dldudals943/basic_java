package g_oop2;

public interface SampleInterface {

	//상수와 추상 메서드만 가질 수 있는게 인터페이스
	//인터페이스의 모든 멤버변수는 public static final 제어자를 사용해야한다
	public static final int NUM1 = 10;
	
	//모든 멤버변수의 제어자가 같기 때문에 생략이 가능하다.
	int NUM2 = 20;
	
	//인터페이스의 모든 메서드는 public abstract 제어자를 사용해야한다.
	public abstract void method1();
	
	//모든 메서드의 제어자가 같기 때문에 생략이 가능하다.
	void method2();
	
}

class SampleImplement implements SampleInterface, SampleInterface2{
	//인터페이스를 상속받을때는 extends가 아니라 implements에 주의하자
	//상속보다는 인터페이스를 구현한다는 의미가 강하기때문에 예약어가 다르다
	//인터페이스를 구현한다고도 많이 한다
	//클래스는 부모가 하나여야하는데
	//인터페이스는 여러 부모로부터 상속을 받을 수가 있다. [,]컴마로 구분한다
	//1차적인 이유는 내용 만들기를 강제하기 위해서
	@Override
	public void method1() {
		//method1()이 겹치지만 어차피 내용이 비었기 때문에 상관이 없다 다중 상속이 가능하다.
	}

	@Override
	public void method2() {
	
	}

	@Override
	public void method3() {
		
	}
	
}

interface SampleInterface2{
	void method1();
	void method3();
}










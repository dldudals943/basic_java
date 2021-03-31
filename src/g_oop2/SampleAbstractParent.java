package g_oop2;

public abstract class SampleAbstractParent { //클래스에도 추상임을 표시해줘야한다.
//추상메서드 : 내용이 없는 메서드
	
	void method(){
		
	}
	
	abstract void abstractMethod(); //추상메서드임을 표시하기 위해 abstract를 표시한다
	//추상 메서드를 하나라도 갖고 있으면 추상 클래스이다.
	
	//내용이 없는 메서드를 가지고 있어서 호출할 수가 없어서 객체 생성을 할 수가 없다.
	//그래서 부모클래스의 역할만 한다.
	
}


class SampleAbstractChild extends SampleAbstractParent{
	//추상 메소드의 내용을 만들어 주던가
	//상속받는 클래스를 추상 메소드로 만들던가 둘중에 하나를 해야한다
	//override를 이용하여 추상 메서드의 내용을 만들어줘봅시다
	
	@Override
	void abstractMethod(){
		//이런 귀찮은 짓을 왜 하냐면 상속받는 클래스마다 메소드 내용이 달라질 수도 있기 때문이다.
	}
}
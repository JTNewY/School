package Day10.Ex02_NestedInterface;

public class InnerInterfaceEx {

	public static void main(String[] args) {
		
		//중첩 인터페이스의 아우터 클래스 객체 생성
		I i = new I();
		
		// 구현 객체를 메소드를 통해 지정
		
		//i.setInterface(new ImplClass() );
		// 구현객체가 없으면 J 한테 대입된것이 없다.
		// 클래스 안에 인터페이스를 정의할 수있다.
		
		i.setInterface(new ImplClass() );
		i.method();
		
	}
}

package Day09.EX01_Computer;

//부모 클래의 추상 메소드는 반드시 오버라이딩 해야한다.
public class DeskTop extends Computer{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Desktop - display");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("Desktop - typing");
		
	}

}

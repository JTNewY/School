package Day08.EX02_Shape;

public class Point {

	//1.정수 선언 후 [int x,y];
	//2.멤버변수 선언하기 alt+ shift + s /o
	// 체크 다풀고 하나 만들고 체크 하고 하나만들기
	// super는 풀기
	//3.toString() 만들기 alt + shift + s / s
	
	//멤버 변수 x,y
	int x,y;
	
	// 기본생성자
	public Point() {
		
	}
	// 매개변수가 있는 생성자
	public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	
	
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	

	
}

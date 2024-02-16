package Day01;

//Scanner 라는 클래스는 java에 정의 되어있어 외부에서 불러와서 사용해야된다.
//import 외부 클래스를 포함시키기
//import 패키지명.클래스명 ;

//[import] 하는법
// 1. 클래스 : ctrl + space
// 2. 전체 import : alt + shift + O

import java.util.Scanner; 

public class Ex02_Scanner {

	public static void main(String[] args) {
		
		// 객체 생성 키워드 : new
		// 클래스타입 객체명 = new 클래스명();
		// Scanner : 표준 입력 객체
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("a : ");
		int a = sc.nextInt(); //nextInt() : 정수 하나를 입력받는 메소드
		
		System.out.println("a: " + a);
		// "문자열"
		// : 큰 따옴표로 묶여있는 데이터
		// "문자열" + 변수(숫자)
		// - 문자열과 숫자를 +(연결 연산자)로 연결할 수 있다.
		// 이 때, 숫자 데이터는 문자열로 변환되어 연결된다.
		// "a : " "10"
		// 1+2 = 3 , "1"+"2" ="12"
	
		// close() : Scanner 객체를 메모리에서 해제하는 메소드
		sc.close();
		
		//꼭 닫아주기
		//sc.nextInt() 
		//Scanner 객체를 해제한 후에는 더이상 입력을 받을 수 없다.
	}
}

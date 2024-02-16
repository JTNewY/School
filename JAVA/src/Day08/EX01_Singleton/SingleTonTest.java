package Day08.EX01_Singleton;
/*
- SingleTon 패턴
- 메모리 사용 영역
- 추상 클래스 p.280
- 인터페이스 p.313
- 선택정렬/버블정렬/삽입정렬

*/
public class SingleTonTest {

	
	public static void main(String[] args) {
		//SingleTon s = new SingleTon(); private로 걸어낫기때문에 오류가 난다.
		
		SingleTon s01 = SingleTon.getInstance();
		SingleTon s02 = SingleTon.getInstance();
		
		// 인스턴스가 메모리 공간에 하나로 할당되어 있는지 확인
		System.out.println("s01과 s02 가 같은지 여부 : ");
		System.out.println( s01 == s02);
		// 메모리를 활용하기 위해 사용한다.
		// 스태틱으로 고정
		// 가져오는거 instance 활용
	}
}

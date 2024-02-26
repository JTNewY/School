package Day17.Ex01_Lambda;

/*
 * 매개변수 있는 람다식
 * - 최댓값을 구하는 함수
 * - 합계를 구한 함수
 */
@FunctionalInterface
interface SmartCalc {
	int cal(int x, int y);
}
public class LambdaToParameter {
	public static void main(String[] args) {
		// 최댓값
		SmartCalc sc1 = (x,y) -> {return (x > y) ? x: y;};
	
	// x~y 까지의 합계
		SmartCalc sc2 = (x,y) ->{
			int sum = 0;
			for (int i = x; i <= y ; i++) {
				sum += i;
			}
			return sum;
		};
		
		int result1 = sc1.cal(100, 50);
		int result2 = sc2.cal(1, 10);
		
		System.out.println("result1 : "+ result1);
		System.out.println("result2 : "+ result2);
		
		// 메소드의 익명함수(람다식) 전달하여 사용할 수도 있다.
		smartCalc(sc1,10,20);
		smartCalc(sc2,1,50);
		
		
	}
	// ? : 메소드를 메소드(익명함수;람다식)에 전달할 수 있나요?
	// A : 람다식을 정의한 익명함수는 인터페이스 타입으로 전달할 수 있다.
		// ex) sum(add); X
	public static void smartCalc(SmartCalc sm, int a, int b) {
		int result = sm.cal(a, b);
		System.out.println("result : " + result);
	}
	
	
}

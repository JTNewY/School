package Day05.Ex02_Calculator;

import java.util.Scanner;

public class CalculatorEx {

	public static void main(String[] args) {
		int plus ,minus,result ;
		double multiple, divide,remain, sum ,avg;
		
		Calculator calculate = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.print("A : ");
		int A = sc.nextInt();
		System.out.print("B : ");
		int B = sc.nextInt();
		
		int result1 = calculate.plus(A, B);
		System.out.println(A+ "+"+ B+ "="+ result1);
		int result2 = calculate.minus(A, B);
		System.out.println(A+ "-"+ B+ "="+ result2);
		
		
		System.out.print("x : ");
		double x = sc.nextInt();
		System.out.print("y : ");
		double y = sc.nextInt();
	
		double result3 = calculate.multiple(x, y);
		System.out.println("x*y = "+ result3);
		System.out.printf("x*y= %5.2f \n", result3);
		double result4 = calculate.divide(x, y);
		System.out.println("x/y = "+ result4);
		System.out.printf("x/y= %5.2f \n", result4);
		//printf("포맷",변수) : %X.Y(리터럴)
		// - X 양수 - 크기만큼 칸을 지정하고 오른쪽으로 정렬
		// 	   음수 - 크기만큼 칸을 지정하고 왼쪽으로 정렬
		// - Y : 지정한 크기만큼 소수점 아래 자리수를 표현(반올림)
		// *(리터럴) : %d (정수) , %f (실수) , %s (문자열)
		double result5 = calculate.remain(x, y);
		System.out.println("x%y = "+ result5);
		
		int arr[] = {10,20,30,40,50};
		System.out.println("합계 : " + calculate.sum(arr));
		System.out.println("평균 : " + calculate.avg(arr));
		sc.close();
		
	}

}

package Day03;

import java.util.Scanner;

public class Ex10_OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// 1~20 까지 정수 중,
		// 홀수의 합계, 짝수의 합계를 각각 구하여 출력하시오.
		
		int a = 0;
		int sum1 =0;
		int sum2 =0;
		
		//홀수 n%2 ==1
		//짝수 n%2 ==0
		while(a<= 20) {
			//홀수
			if(a%2 == 1) {
				sum1 += a;
			}//짝수
			if(a%2 == 0) {
				sum2 += a;
			}
			a++;
		}
		System.out.println("홀수의 합계 : "+ sum1);
		System.out.println("홀수의 합계 : "+ sum2);
	}

}

package Day03;

import java.util.Scanner;

public class Ex02_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if( num % 2 ==1 ) {
			System.out.println("홀수입니다.");
		}
		else {
			System.out.println("짝수입니다.");
		
		}
		
		sc.close();
	}

}

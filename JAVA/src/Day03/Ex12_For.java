package Day03;

import java.util.Iterator;

public class Ex12_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for(1.초기식 ; 2.조건식, 4.증감식){3. 실행문;}
		// 실행순서: 1-> 반복(2->3->4) 
		
		// 1. 1~10까지의 정수를 출력하시오.
		
		for (int i = 1; i <=10; i++) {
			System.out.print(i +" ");

			
		}
		System.out.println();
		
		//2. 50~100 정수
		for(int i = 50; i<= 100; i++) {
			System.out.println(i+ " ");
		}
		
		//3. 1~20 까지의 정수 중, 짝수만 출력
		
		
		for(int i = 2; i<=20; i+=2){
			System.out.println(i+ " ");
		}
	
		//4. 1~20 까지의 정수 중, 홀수만 출력
		for(int i = 1; i<=20; i+=2) {
			System.out.println(i+ " ");
		}
	}

}

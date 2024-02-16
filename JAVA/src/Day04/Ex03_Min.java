package Day04;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Ex03_Min {

	public static void main(String[] args) {
		// 첫째 줄에 입력할 개수 N 입력받고,
		// 둘째 줄에 N 개의 정수를 공백을 두고 입력받으시오.
		// N개의 정수 중, 최대값을 출력하시오.
		//(입력예시)
		// 5
		// 90 60 70 100 55
		// (출력예시)/
		// 최대값 : 55
		/*
		 	(순서도)
		 	1. 정수 하나를 입력받는다.
		 	2. 입력받은 정수를 변수 N에 대입한다.
		 	3. N번 반복하여 N개의 정수를 입력받는다.
		 	4. 입력받은 N개의 정수를 배열 arr 에 저장한다.
		 	5. 배열 arr을 반복하여, 최대값 변수 max와 i번째 요소를 비교한다.
		 	6. 두 요소 중 더 큰 요소를 max에 대입한다.
		 	7. 반복이 끝나고, 변수 max 를 출력한다.
		 */
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	//최대값 선언
	int min = Integer.MAX_VALUE;
	//int 차입의 최솟값 : -21억XX
	
	//입력과 최소값 비교를 동시에 할 수도 있다.
	for(int i=0 ;i<n;i++) {
		arr[i] = sc.nextInt();
		if(min > arr[i]) {
			min =arr[i];
		}
	
	}		
	System.out.println("최소값 : " + min);
	sc.close();
	
	}

}

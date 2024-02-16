package Day04;

import java.util.Scanner;

public class codeup1503 {

	/*
	하나의 정수N을 입력받아 다음과 같이 작성하시오.

	지그재그로 출력하시오.

	N이 5라면 다음과 같이 출력한다.
	1 2 3 4 5

	10 9 8 7 6

	11 12 13 14 15

	20 19 18 17 16

	21 22 23 24 25
	
	입력
	3
	출력
	1 2 3 
	6 5 4 
	7 8 9 
	 */
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	int N = sc.nextInt();
	int arr[][] = new int[N][N];
	int k= 1;
	
	
	//수식계산
	for(int i=0;i<arr.length;i++) {
		if(i%2==0) {
			for(int j=0;j<arr[i].length;j++) {
				arr [i][j] = k++;
		}
		
		
		}else {
			for(int j=N-1;j >= 0;j--) {
				arr [i][j] = k++;
			}
		}
	}
	//출력	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j] +" ");
		}
		System.out.println();
	}
	
	sc.close();
	}
}

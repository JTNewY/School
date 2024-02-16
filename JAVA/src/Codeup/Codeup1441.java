package Codeup;

import java.util.Scanner;

public class Codeup1441 {
//1441 버블 정렬
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i =0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i =0; i<N-1; i++) {
			for(int j=0;j<N-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int Temp;
					Temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = Temp;
				}
			}
		}
		
		/* 질문할것
	 	for(int i =1; i<N; i++) {
		for(int j=1;j<N-i;j++) {
			if(arr[j]>arr[j+1]) {
				int Temp;
				Temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = Temp;
			}
		}
	}
	 
	 */
		
		
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

	}

}

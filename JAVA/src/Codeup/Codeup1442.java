package Codeup;

import java.util.Scanner;

public class Codeup1442 {

	public static void main(String[] args) {
		//선택 정렬
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int Temp ;
		
		int arr[] = new int [N];
		for(int i=0;i< arr.length;i++) { //숫자입력
			arr[i] = sc.nextInt();
			
				}	
		for(int i =0; i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					Temp = arr[i];
					arr[i] = arr[j];
					arr[j] = Temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

		sc.close();
	}

}

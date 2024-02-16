package Codeup;

import java.util.Scanner;

public class Codeup1443 {
//삽입 정렬
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int arr[] = new int [N];
		int key;
		
		for(int i =0;i<arr.length;i++) { //입력
			arr[i] = sc.nextInt();
		} 
		
		for(int i=1;i<N;i++) { 
			key = arr[i]; //key
			int j = i-1;
			
			//key가 이전 원소보다 크기 전까지 반복
			while (j>=1 && key <arr[j]) { 
				arr[j+1] = arr[j]; // 이전 원소를 한칸 씩 뒤로 미룬다.
				j--;
			}
			/*
			 * 위 반복문에서 탈출 하는 경우 앞의 원소가 타겟보다 작다는 의미이므로
			 * 타겟 원소는 j번째 원소 뒤에 와야한다.
			 * 그러므로 타겟은 j + 1 에 위치하게 된다.
			 */
			arr[j+1] = key;
		}
		for(int i =0;i<arr.length;i++) { //출력
			System.out.println(arr[i]+ " ");
		}
		
		
		
		
	sc.close();
	}
	
}

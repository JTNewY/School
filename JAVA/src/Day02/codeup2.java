package Day02;

import java.util.Scanner;

public class codeup2 {
	//1046
	
	public static void main(String[] args) {
		long A,B,C ;
		long sum;
		float avg;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextLong();
		B = sc.nextLong();
		C = sc.nextLong();
		
		sum = A+B+C;
		avg = (float)(A+B+C)/3 ;
		
		System.out.println(sum);
		System.out.printf("%.1f",avg);
	}
}

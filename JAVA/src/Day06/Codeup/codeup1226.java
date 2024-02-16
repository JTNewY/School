package Day06.Codeup;

import java.util.Scanner;
import java.util.Arrays;
/*	첫 줄에 로또 당첨번호 6개와 보너스 번호 1개가 주어진다.

	둘째 줄에 지혜가 가지고 있는 로또 번호 6개가 주어진다.
	
	13 23 24 35 40 45 7     ===> 로또 당첨번호 + 보너스 번호
	2 6 7 23 40 44
	
 * 1등 = 1 출력, 2등 = 2 출력, 3등 = 3 출력, 4등 = 4 출력, 5등 = 5 출력, 꽝 = 0 출력
 */ 

public class codeup1226 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N[] = new int[7];
		int WON[] = new int []{13,23,24,35,40,45};
		int Bouns = 7;
		int Count = 0;
	
		for(int i=0;i<N.length;i++) {
			N[i] = sc.nextInt();
			int C = N[i];
			for(int j=0;j<N.length;i++) {
				if(C == WON[j]) {
					Count ++;
					}
			}
		}
		
		switch (Count) {
			case 1: System.out.println("꽝"); break;
			case 2: System.out.println("꽝"); break;
			case 3: System.out.println("5"); break;
			case 4: System.out.println("4"); break;
			case 5: 
				System.out.println("3"); 
				// 보너스 번호를 체크
				// 보너스 번호가 맞으면, 2등
				
				break;
			case 6: System.out.println("1"); break;
		}
		
		
		sc.close();
}
}

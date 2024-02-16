package Day03;

import java.util.Scanner;

public class codeup01 {
//1154
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A;
		A = sc.nextInt();

		if(50<= A && A<= 70) {
			System.out.print("win");
		}
		else if(A%6 ==0) {
				System.out.print("win");
		}else {
				System.out.print("lose");
		}
	}

}

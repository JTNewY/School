package Day03;

public class Ex14_GuguAll {

	public static void main(String[] args) {
		
		//(단)*(1~9)
		// 단에 대한 반복 : 1~9
		// 각 단의 곱 : 1~9
		
		//중첩 반복문
		// A x B
		// i : 단(A)
		for (int i = 1; i<=9; i++) {
			//J : 곱(B)
			for(int j=1; j<= 9; j++) {
				System.out.print(i+ "*" + j + "=" + (i*j));
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}

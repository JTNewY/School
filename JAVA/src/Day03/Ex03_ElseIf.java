package Day03;

import java.util.Scanner;

public class Ex03_ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//90점이상, A
		//80점이상, B
		//70점이상, C
		//60점이상, D
		//60점미만, F
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char grade = ' ';
		/*
		if(score >= 90 && score <= 100) {
		System.out.println("학점 : A ");
		}
		if(score >= 80 && score < 90){
		System.out.println("학점 : B ");
		}
		if(score >= 70 && score < 80) {
		System.out.println("학점 : C ");
		}
		if(score >= 60 && score < 70) {
		System.out.println("학점 : D ");
		}
		if(score < 60 && score >= 0) {
		System.out.println("학점 : F");		
		}
		/*
		 ※출력문 하나로 줄이는방법
		 char 넣기
		if(score >= 90 && score <= 100) grade ='A';
		if(score >= 80 && score < 90) grade = 'B';
		if(score >= 70 && score < 80) grade = 'C';
		if(score >= 60 && score < 70) grade = 'D';
		if(score < 60 && score >= 0) grade = 'F';
		System.out.println("학점 : " + grade);
		*/
		// if~else if~else
		if(score >= 90 && score <= 100) {
			grade ='A';
		}
		else if (score >= 80) {
			grade ='B';
		}else if (score >= 70) {
			grade ='C';
		}else if (score >= 60) {
			grade ='D';
		}else {
			grade ='F';
		}
		System.out.println("학점 : " + grade);
		sc.close();
	}

}

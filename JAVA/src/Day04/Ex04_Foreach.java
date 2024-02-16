package Day04;

import java.util.Iterator;

public class Ex04_Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 선언 및 초기화
		String[] week = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		
		//foreach : ctrl + space
		// - for(자료형 반복요소명 : 배열 ){}
		// : 배열 또는 컬렉션의 모든 요소를 순서대로 반복하는 반복문
		for (String day : week) { 
			System.out.print(day +" "); //day :arr[i]
		}
		System.out.println();
	
		//기본 for문
		for(int i=0; i<week.length; i++ ) { //i+=2[2개 건너뛰기]
			//for문은 건너뛸수 있게 만들수 있지만, foreach 문은 순서대로만 가능하다.
			System.out.print(week[i] +" ");
			
		}System.out.println();
	}
	
		

}
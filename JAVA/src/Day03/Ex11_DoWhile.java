package Day03;

import java.util.Scanner;

public class Ex11_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메뉴판
		// 변수 선언 : 메뉴 번호, 메뉴 이름
		int menuNo = 0;
		int count = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		
		//do~while문
		// : 무조건 1회는 실행 후, 조건을 검사하여 반복하는 문장
		do {
		System.out.println("###### 메뉴판 ######");
		System.out.println("1. 맥도날드");
		System.out.println("2. 법대생김밥");
		System.out.println("3. 돈까스");
		System.out.println("4. 짜장면");
		System.out.println("5. 물만난면");
		System.out.println("0. 종료");
		System.out.print("메뉴 번호 : ");
		
		// 메뉴 번호 입력
		menuNo = sc.nextInt();
		
		if(menuNo == 0) {
			break;
			//break : 제어문을 탈출 
			//if(menuNo == 0) return;
			
			
			//return
			//1. 메소드 종료
			//2. 메모리 공간 해제
			//3. (값) 메소드를 호출한 곳으로 반환
			//return 사용하면 안에다가 메뉴판종료 적어주기
		}
		
		switch (menuNo) {
		case 1: menuName = "맥도날드"; break;
		case 2: menuName = "법대생김밥"; break;
		case 3: menuName = "돈까스"; break;
		case 4: menuName = "짜장면"; break;
		case 5: menuName = "물만난면"; break;
		default:  break;
		}
		if(menuNo >=1 && menuNo <=5) {
			System.out.println(menuName + "(을/를) 주문하였습니다..");
			count++;
		}else
		{
			System.out.println("(0~5)번 사이의 번호를 입력해주세요.");
		}
		// 메뉴번호 유효성 검사
		// (조건) : 
		} while (menuNo != 0);
		
		System.out.println(count +"개의 메뉴를 주문하였습니다.");
		System.out.println( "메뉴판을 종료합니다.");
		sc.close();
	}

}

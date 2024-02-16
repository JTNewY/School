package Day05.Ex03_Car;

import java.util.Scanner;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 모델명, 속도,
		// 생성자
		// - 기본 생성자
		Car car = new Car();
		car.model = "볼보";
		// car.speed = 200;
		//private 으로 지정한 변수는 외부에서 접근 불가능
		car.setSpeed(200);
		System.out.println("Model : "+ car.getModel());
		System.out.println("Speed : "+ car.getSpeed());
		
		//car.speed : -50;
		car.setSpeed(-50);
		System.out.println("Speed : "+ car.getSpeed());
		
		car.setSpeed(400);
		System.out.println("Speed : "+ car.getSpeed());
		
		car.setSpeed(200);
		System.out.println("Speed : "+ car.getSpeed());
	}

}

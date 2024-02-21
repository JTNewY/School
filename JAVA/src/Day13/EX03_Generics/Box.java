package Day13.EX03_Generics;

/*
 *  제네릭 기법으로 클래스 정의하기
 *  - 클래스 뒤에 타입매개변수 <E>,<T>,<K>,<V> 등을 작성한다.
 *  
 *  "제네릭 기법"
*  * 클래스의 변수나 메소드의 타입을 클래스를 정의할 때가 아니라,
* 		객체를 생성할 때 타입을 확정하는 클래스 정의 기법
 */

public class Box  <T>	{
	
	T t;

	//getter setter
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	

}

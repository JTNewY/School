package Day12.Ex01_Object;

/*
 *	Object 클래스의 equals() 메소드 활용
 * 
 */

class Student{
	int studentId; //학번
	String studentName; //이름
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

	
	//equals() 메소드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		// 두 객체가 의미상으로 일치하는지 여부를 true, false  반환
		if(this == obj)
			return true;
		
		// null 체크 - 비교 대상이 null 인 경우 비교 자체가 불가
		// * NullPointerException 발생 가능
		if( obj == null ) {
			return false;
		}
		
		// 학번과 학생명이 모두 일치하는 경우
		
		Student student = (Student) obj; // 다운 캐스팅
		if(this.studentId == student.studentId && this.studentName.equals(student.studentName))
		{ return true;
	}
		return false;
	}
	
	
	
}

public class ObjectEquals {
//여기 안에 클래스를 넣으면 중첩클래스가 되므로 밖에다 클래스를 선언해야한다.
	
	// 학생1과 학생2의 레퍼런스 비교
	public static void main(String[] args) { //main 메소드
		Student student = new Student(1001, "김조은");
		Student student2 = student;
		Student student3 = new Student(1001,"김조은");
		
		if(student == student2) {
			System.out.println("student 와 student2의 주소(레퍼런스)가 같습니다.");
		}
		else {
			System.out.println("student 와 student2의 주소(레퍼런스)가 다릅니다.");
		}
		System.out.println("==========================");
	// 학생1과 학생2의 인스턴스 비교
		if(student.equals(student2)) {
			System.out.println("student 와 student2 는 같습니다.");
		}else {
			System.out.println("student 와 student2 는 다릅니다.");
		}
		System.out.println("==========================");
		// ========================================================
	//학생1과 학생3의 레퍼런스 비교
		if(student == student3) {
			System.out.println("student 와 student3의 주소(레퍼런스)가 같습니다.");
		}
		else {
			System.out.println("student 와 student3의 주소(레퍼런스)가 다릅니다.");
		}
		System.out.println("==========================");
	// 학생1과 학생3의 인스턴스 비교
		//안에 들어있는 객체를 비교하는것
		//실제 값을 확인할려면 equals메소드를 오버라이딩 해야한다!
		if(student.equals(student3)) {
			System.out.println("student 와 student3 는 같습니다.");
		}else {
			System.out.println("student 와 student3 는 다릅니다.");
		}
		System.out.println("==========================");
		
	} // main 끝

} //클래스 끝

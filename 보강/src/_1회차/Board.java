package _1회차;

import java.util.Date;

public class Board {
	// 글번호
	// 제목
	// 작성자
	// 내용
	// 등록일자
	// 수정일자
	
	private int no;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private Date updDate;
	
	
	
	// 생성자
	public Board() {
		
	}


	//Board board2 = new Board("제목","작성자","내용");
	public Board(String title, String writer, String content) {
		// 멤버변수의 이름과 매개변수의 이름이 같을 때, 구분해주기 위해서
	
		// 그냥 그냥쓰면 이름이 똑같아서 구분하기 어려우니까 구분해주기위해서 this.멤버변수 를 쓰는거다
		//	멤버변수   매개변수
		this.title = title;
		//String title -> title -> this.title -> private String title;
		this.writer = writer;
		this.content = content;
	}
	
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	//System.out.println(board2.getWriter()); 
	public String getWriter() {
		return writer;
	}

	//board2.setWriter("김조은"); ->  writer -> this.writer -> "작성자" -> "김조은"
	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
				+ regDate + ", updDate=" + updDate + "]";
		
		//객체를 정의하지 않았을때, toString에 자동으로 넣어준다.
		// 틀이라고 생각하면 될거같다. ㅇㅇ
		
	}
	
	// getter, setter
	
	
}

package com.ws.wiseSaying.entity;

public class WiseSaying { // WiseSaying의 객체를 만들기 위한 클래스 설계도
	private int id; // 필드. 객체 안에 정수형 id, 문자형 content와 author을 담을 공간
	private String content;
	private String author;

	public WiseSaying(int id, String content, String author) { // 생성자. WiseSaying 객체 생성과 동시에 매개변수로 받은 id, content, author을 this. 사용해서 필드변수에 담음
		this.id = id;
		this.content = content;
		this.author = author;
	}

	public int getId() { // 객체 내부에 저장되어있는 id 은닉화(private)되서 게터 메서드로 id 리턴
		return id;
	}

	public void setId(int id) { // private id에 값을 넣는 메서드
		this.id = id;
	}

	public String getContent() { // 객체 내부에 저장되어있는 content 은닉화(private)되서 게터 메서드로 content 리턴
		return content;
	}

	public void setContent(String content) { // private content에 값을 넣는 메서드
		this.content = content;
	}

	public String getAuthor() { // 객체 내부에 저장되어있는 author 은닉화(private)되서 게터 메서드로 author 리턴
		return author;
	}

	public void setAuthor(String author) {  // private author에 값을 넣는 메서드
		this.author = author;
	}

}
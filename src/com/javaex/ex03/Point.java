package com.javaex.ex03;

public class Point {
	
	// 필드
	private int x;
	private int y;
	
	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	

	//toString()을 작성 하세요
	
	// -> Object 의 toString()을 재정의
	// 메소드
	@Override
	public String toString() {
		return "[포인트] x:" + this.x + ", y:" + this.y + " 입니다.";		
	}

	
}

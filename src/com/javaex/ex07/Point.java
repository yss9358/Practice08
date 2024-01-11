package com.javaex.ex07;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// equals() 메소드를 작성하세요.

	@Override
	public boolean equals(Object obj) {
		// 결과값으로 나올 값을 정의
		Point p = (Point)obj; 
		boolean result;
		// reuslt의 값을 출력하기 위해 조건을 세움
		if (this.x == p.x) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

}

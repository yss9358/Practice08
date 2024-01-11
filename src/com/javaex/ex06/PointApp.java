package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
		
		/*
		
		equals가 아니라 == 로 실행했을 때는 주소값이 같은지 물어본다.
		new Point 로 생성되면 각각의 주소값을 가지게 된다.
		
		
		1. p1 == p2
		
		p1 과 p2 는 new Point로 생성되어 각각의 주소값을 가진다
		-> 같지 않다 -> false
		
		2. p2 == p3
		
		p2 와 p3 는 new Point로 생성되어 각각의 주소값을 가진다
		-> 같지 않다 -> false
				
		3. p3 == p4 
		
		p3 은 new Point 로 주소값을 받고 , p4는 p1의 주소값을 대입시켜서 
		각각의 주소값이 다르다. -> false
		
		4. p4 == p1 
		
		p4 는 p1의 주소값을 대입한 것으로 같다
		-> true
		
		5. p1.equals(p2)
		
		p1의 값(2,3) p2의 값(2,3)은 같아보일 수 있지만 Point Class 에서 equals에 정의된 값이 없어서
		Object 에서 정의된 equals 값에 따라 같은지 아닌지 판단한다.
		Object equals 에서는 따로 정의된 값이 없어서 모름? 
		-> Point Class 에서 equals를 정의하고 x,y의 값이 같으면 같다고 정의할 수 있다.
		-> false
		
		6. p4.euqals(p1)
		
		p4는 p1의 값을 대입한 것으로 같은 값을 가지게 된다.
		
		-> true
		
		 
		
		
		
		
		
		*/
	}

}



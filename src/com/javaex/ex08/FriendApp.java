package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해주세요");
		
		Friend f01 = new Friend();
		
		Friend[] fArray = new Friend[3];
		
		for (int i=0; i<3; i++) {
			String friend = sc.nextLine();
			
			
			
		}
		
		
		
		
		sc.close();
		
	}

}

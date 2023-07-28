package com.test.question;

import java.util.Scanner;

public class Q067 {

	public static void main(String[] args) {
		
		//Q067.java
		
		/*
		
			요구사항
			- 배열에 요소를 삽입하시오.
			
			조건
			- 배열 길이: 10
			- 마지막 요소는 우측으로 옮겨질 공간이 없으면 삭제된다.
			
			입력
			- 삽입 위치: 2 
			
			- 값: 100 
			
			출력
			원본: [5, 6, 1, 3, 2, 0, 0, 0, 0, 0]
			결과: [5, 6, 100, 1, 3, 2, 0, 0, 0, 0]
		
		*/
		
		int[] list = new int[] {5, 6, 1, 3, 2, 0, 0, 0, 0, 0};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삽입 위치: ");
		int insert = scan.nextInt();
		
		System.out.print("값: ");
		int	num = scan.nextInt();
		
	}
	
}

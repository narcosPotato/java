package com.test.question;

import java.util.Scanner;

public class Q085 {

	public static void main(String[] args) {
		
		//Q085.java
		
		/*
		
			요구사항
			- 주민 등록 번호 유효성 검사를 하시오.
			
			조건
			'-'의 입력 유무 상관없이 검사하시오.
			
			입력
			- 주민등록번호: 951220-1021547 
			
			출력
			- 올바른 주민등록번호입니다.
			
			1, 2 - 1900년대생
			3, 4 - 2000년대생
			9, 0 - 1800년대생
			5, 6 - 귀화
			7, 8
			
			7 0 0 1 0 1 - 1 0 1 0 1 0 4
			x
			2 3 4 5 6 7 8 9 1 2 3 4 5   6
			----------------------------
			14    5   7   9   2   4    = 40
			
			40 % 11 = 7
			
			11 - 7 = 4
			11 - 0 = 11 > 1
			11 - 1 = 10 > 0		
					
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주민등록번호: ");
		String jumin = scan.nextLine();
		int firstJumin = 0;
		
		if (jumin.charAt(6) == '-') {
			for (int i=0; i<6; i++) {
				firstJumin += Integer.parseInt(jumin, jumin.charAt(i)) * i+2;
			}
			
			
		}
		
	}
	
}

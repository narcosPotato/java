package com.test.question;

import java.util.Scanner;

public class Q026 {
	
	public static void main(String[] args) {
		
		//Q026.java
		
		/*
		
			요구사항
			- 학생의 국어 점수를 입력받아 성적을 출력하시오.
			
			조건
			- 90 ~ 100: A
			- 80 ~  89: B
			- 70 ~  79: C
			- 60 ~  69: D
			- 0 ~   59: F
			- 유효성 검사를 하시오.(점수: 0 ~ 100점 이내)
		
		*/
		
		korRecord();
		
	}

	private static void korRecord() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수: ");
		int score = scan.nextInt();
		
		if (score >= 90 && score <= 100) {
			System.out.printf("입력한 %d점은 성적 A입니다.", score);
		} else if (score >= 80 && score <= 89) {
			System.out.printf("입력한 %d점은 성적 B입니다.", score);
		} else if (score >= 70 && score <= 79) {
			System.out.printf("입력한 %d점은 성적 C입니다.", score);
		} else if (score >= 60 && score <= 69) {
			System.out.printf("입력한 %d점은 성적 D입니다.", score);
		} else if (score >= 0 && score <= 59) {
			System.out.printf("입력한 %d점은 성적 F입니다.", score);
		} else {
			System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.");
		}
		
	}
	
}

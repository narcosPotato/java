package com.test.question;

public class Q054 {

	public static void main(String[] args) {
		
		//Q054.java
		
		/*
		
			요구사항
			- 2부터 100사이의 소수를 구하시오.
			
			조건
			- 소수: 1과 자기자신으로밖에 나눠지지 않는 수
			
			출력
			- 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,

		
		*/
		
		boolean check = false;
		
		for (int i=2; i<=100; i++) {
			
				check = false;
			
			for (int j=2; j<i; j++) {
				if (i % j == 0) {
					check = true;
					break;
				}
			}
			
			if (!check) {
				System.out.print(i + ", ");
			}
			
		}
		
	}
	
}

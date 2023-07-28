package com.test.question;

public class Q042 {

	public static void main(String[] args) {
		
		//Q042.java
		
		/*
		
			요구사항
			- 서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.
			
			조건
			- Calendar 클래스 사용 금지
			
			출력
			- 2023년 7월 24일은 738,725일째 되는 날이고 월요일입니다.
			
			for(int i = 1; i<= 2022; i++) {
				sum += 365;
			
			if(i==?) {
					sum++;//366
				}
			}
			
		*/
		
		total();
		
	}

	private static void total() {
		
		System.out.println("서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.");
		
		int year = 365;
		int month = 0;
		int day = 0;
		int dayTotal = 0;
		int total = 0;
		
		for (int i=1; i<=6; i++) {
			
			switch (i) {
			case 1:	case 3:	case 5:	case 7:	case 8:	case 10: case 12:
				day = 31;
				dayTotal += day;
				break;
			case 2:
				day = 28;
				dayTotal += day;
				break;
			case 4:	case 6:	case 9:	case 11:
				day = 30;
				dayTotal += day;
				break;
			}
			
			 
			
		}
		
		total = year * 2023 + dayTotal + 24; 
		
		System.out.printf("%d년 %d월 %d일은 %d일째 되는 날이고 월요일입니다.", 2023, 7, 24, total);
		
	}
	
}

package day1_project;

import java.util.Scanner;

public class ex_6 {
	public static void main(String[] args) {
		/* if문
		int a = 11;
		if(a > 5 ) {
			System.out.println("a는 5보다 크다");
			
		}
		if(a <= 5 ) {
			System.out.println("a는 5보다 작다");
					}
		
		else {System.out.println("a는 5보다 작다");
			
		}
		
		if(a % 2 == 0) {
			System.out.println("a는 짝수");
		} else {
			System.out.println("a는 홀수");
		} */
		
		//if, else if는 조건이 맞으면 다른 if문들을 넘기고 조건이 맞지 않을 경우 else로 넘어간다. 
		/* int a = 3;
		
		if (a > 15) {
			System.out.println("a는 15보다 크다.");
								
		} else if(a > 10) {
			System.out.println("a는 10보다 크다.");
		} else if(a > 5) {
			System.out.println("a는 5보다 크다.");
		} else {
			System.out.println("a는 5보다 작다.");
		} */
		
		
		// 첫 영문자가 대문자일 경우 클래스이다 
				// 클래스로 객체를 만들고 객체를 만드는 단어는 new 이다
				// import 단축기 : ctrl + shift + o 
				// 외부에서 코드를 가져 올수 있으나 import를 입력해야 한다.
			
		int a = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		int score = s.nextInt(); //키보드로 입력된 숫자 값을 가져오겠다.
		System.out.println("입력값 : " + score);
		
	
		if (score >= 90) {
			System.out.println("학점 A");
			
		}else if (score >= 80) {
			System.out.println("학점 B");
		}else if (score >= 70) {
			System.out.println("학점 C");
		}else if (score >= 60) {
			System.out.println("학점 D");
		}else {
			System.out.println("학점 F");
		} 
		
		
		
		
		
		
		
		
	}	

}

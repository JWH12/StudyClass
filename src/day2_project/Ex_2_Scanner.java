package day2_project;

import java.util.Scanner;

public class Ex_2_Scanner {public static void main(String[] args) {
	
	// 첫 영문자가 대문자일 경우 클래스이다 
	// 클래스로 객체를 만들고 객체를 만드는 단어는 new 이다
	// import 단축기 : ctrl + shift + o 
	// 외부에서 코드를 가져 올수 있으나 import를 입력해야 한다.
	
	/*
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
		} */
	
	/*
	Scanner s = new Scanner(System.in);
	System.out.println("숫자를 입력해 주세요.");
	int num = s.nextInt(); //키보드로 입력된 숫자 값을 가져오겠다.
	if (num % 2 == 0 ) {
		System.out.println("짝수");
		if (num > 10) {
			System.out.println("10보다 크다");
		}
	} */
	
	Scanner s = new Scanner(System.in);
	System.out.println("수학 점수를 입력해 주세요.");
	int math = s.nextInt();
	System.out.println("영어 점수를 입력해 주세요.");
	int eng = s.nextInt();
	
	if (math >= 60 && eng >= 60) {
		System.out.println("합격");
	}		else if (math >= 60 && eng < 60) {
			System.out.println("영어 점수 과락");
		}	else if (math < 60 && eng >= 60) {
			System.out.println("수학 점수 과락");
	}		else {
			System.out.println("전체 과락");
}

	
	
	
}

}

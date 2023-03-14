package day2_project;

import java.util.Scanner;

public class Ex_7_반복문3 {public static void main(String[] args) {
	
	
	/*
	// i값이 9가 될때까지 j값을 계속 반복시키는 것
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			if (j == 10) {
				break;
			}
			System.out.println("i = " + i + "  j = " + j);
		}
	} */
	
	
	
	
	
	/* 내가 쓴 코딩 오답
	int num = 1;
	
	
	for (int i = 1; i < 10; i++) {
		System.out.println("======1단=======");
		for (int j = 0; j < 10; j++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}
	} */
	
	
	
	/*
	// 구구단 반복문 for문 사용
	for(int i=2; i < 10; i++) { // 0 
		System.out.println("======= " + i + "단 =======");
		for(int j=1; j<10; j++) { // 0 ~ 9
			System.out.println(i + " * " + j + " = " + (i*j));
		}
	} */ 
	
	
	
	
	
	/* 구구단 반복문 while문 사용(순서 역순)
	int i = 9;
	while(i > 1) {
		System.out.println("======= " + i + "단 =======");
		
		int j = 1;
		while(j < 10) {
			System.out.println(i + " * " + j + " = " + (i*j));
			j++;
		}
		i--;
	} */
	
	
	
	
	
	/*
	// i의 숫자에 따라서 j가 영향을 받는다.
	
	Scanner s = new Scanner(System.in); 
	System.out.println("숫자 입력");
	int num = s.nextInt();
	for(int i=0; i<num; i++) {
		for(int j=0; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();
	
	for(int i=num; i>=0; i--) {
		for(int j=0; j<i; j++) {
			System.out.print("*");
		}
		System.out.println();
	} */
	
	
	
	
	/* 
	// 위 문제를 for문 하나로 마무리 할 수 있다는 예시.
	Scanner s = new Scanner(System.in); 
	System.out.println("숫자 입력");
	int num = s.nextInt();
	
	String star = "";
	for(int i=0; i<num; i++) {
		star += "*";
		System.out.println(star);
			
		} */
		
	}
}



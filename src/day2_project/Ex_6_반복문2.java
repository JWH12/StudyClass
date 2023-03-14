package day2_project;

import java.util.Scanner;

public class Ex_6_반복문2 {public static void main(String[] args) {
	
	
	/*
	// while은 for문과 다르게 따로따로 입력 해야 함
	// sout 다음 증감식을 따로 입력해 줄 것
	// while의 경우 i++;를 sout 밑에 적어야 함
	
	Scanner s = new Scanner(System.in);
	System.out.println("숫자를 입력해 주세요.");
	int num = s.nextInt();
	
	int i = 1;
	while (i < 10) {
		System.out.println(num + "*" + i + "=" + (num * i));
		i++;
	} */
	
	
	
	
	/*
	// do ~ while 최초 한번은 무조건 실행 한 뒤 조건 판별을 함. 
	
	int i = 10;
			
	do {
		
	} while ( i < 10); */
	
	
	
	
	/*
	// while 무한루프에서 빠져 나가는 법
	Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("숫자를 입력해 주세요.(0을 입력하면 종료)");
			int num = s.nextInt();
			if (num == 0) {
				break;
				
			}
		}
		 System.out.println("프로그램을 종료합니다."); */
	
	
	
	
	/*
	// 반복문 탈출하는 작업 테스트
	Scanner s = new Scanner(System.in); 
	while(true) {
		System.out.println("구구단 단수를 선택해주세요.");
		int dan = s.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
		System.out.println("계속 하시겠습니까? 계속(1), 종료(0)");
		int num = s.nextInt();
		if(num == 0) {
			break;
		}
	}
	System.out.println("프로그램이 종료되었습니다."); */
	
	
	
	
	/*
	// for문 무한루프하는 법 ";;" 입력 / 무한루프 멈추는 법은 while 문과 동일
	Scanner s = new Scanner(System.in);
	int i = 0;
	for (;;) {
		System.out.println(i++);
		if (i == 15500) {
			break;
		}
		
	} */
	
	
	
	
	
	// continue는 입력한 내용을 건너뛰고 진행한다.
	
	Scanner s = new Scanner(System.in); 
	for(int i=0; i < 10; i++) {
		if(i == 5) {
			continue; // break;
		}
		System.out.println(i);
	}
	
	
	
	
}

}

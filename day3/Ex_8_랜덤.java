package day3;


import java.util.Random;
import java.util.Scanner;



public class Ex_8_랜덤 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 랜덤으로 숫자나오게 하는 코드
		Random ran = new Random();
		System.out.println(ran.nextInt(10)+1);  */
		// (10)의 의미는 입력된 숫자 -1 최대값을 말한다. 
		// ()뒤에 +1을 입력하면 최소값과 최대값이 1 늘어난다.
		
		
		
		/*
		//랜덤하게 구구단이 나오는 코드
		Random ran = new Random();
		Scanner s = new Scanner(System.in); 
		
		int num1 = ran.nextInt(8)+2;
		int num2 = ran.nextInt(9)+1;
		System.out.println( num1 + " * " + num2 + " = " );
		
		int dan = s.nextInt();
		
		if (dan == (num1 * num2)) {
			System.out.println("정답입니다.");
			
			} else {
				System.out.println("오답입니다. 답은 " + (num1 * num2) + " 입니다.");
		} */ 
		
		
		
		
		
		/* 구구단 문제가 계속 나오게 하는 코드
		 * while을 사용하면 된다.
		Random ran = new Random();
		Scanner s = new Scanner(System.in); 
		
		while (true) {
					
		int num1 = ran.nextInt(8)+2;
		int num2 = ran.nextInt(9)+1;
		System.out.println( num1 + " * " + num2 + " = " );
		
		int dan = s.nextInt();
		
		if (dan == (num1 * num2)) {
			System.out.println("정답입니다.");
			
			} else {
				System.out.println("오답입니다. 답은 " + (num1 * num2) + " 입니다.");
		}
		
		}
		 */
		
		
		
		
		// 입력한 문제수만큼 반복하게 하는 코드
		// 
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in); 
		
		while (true) {
											
			// 문제 수 입력
			System.out.println("문제수를 입력해주세요.");
			int ex = s.nextInt();
			int count = 0;
			
			// 입력받은 문제 수 만큼 반복
			for (int i = 0; i < ex; i++) {
				
				// 랜덤으로 구구단 문제 출력
				int num1 = ran.nextInt(8)+2; // 단
				int num2 = ran.nextInt(9)+1; // 곱해주는 수
				System.out.println( num1 + " * " + num2 + " = " );
				
				// 정답 입력
				int answer = s.nextInt();
				
				// 정답 판별
				if (answer == (num1 * num2)) {
					System.out.println("정답입니다!");
					count++;
					
				} else { System.out.println("오답입니다. 답은 " + (num1 * num2) + " 입니다.");
				}
			}	System.out.println(count);
						
			System.out.println("계속 하시겠습니까? 계속(1), 종료(0)");
			
			int num = s.nextInt();
			if(num == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
		} 
		 
		
			}
		}
	}
		

	



package Ex_Re;

import java.util.InputMismatchException;

import java.util.Scanner;

public class 예외Tset {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in); 
	
	while (true) {
		
	
		try {  // while문의 값을 입력 중 발생하는 예외를 처리하는 코드
		
		System.out.println("숫자입력");
		
		int a = s.nextInt();
		
		System.out.println("문자입력");
		
		String b = s.next();
					
		break; 
	}
	
		  
	 catch(InputMismatchException e) { 

		 System.out.println(e.getLocalizedMessage());		
		
		 System.out.println("다시 입력하세요");
		 
		 s.next();
	
	 }
	 
	
		}
	}
}


package day2_project;

import java.util.Scanner;

public class Ex_3_swtich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		int score = s.nextInt(); //키보드로 입력된 숫자 값을 가져오겠다.
		// char c = '' 은 문자열을 한글자만 사용가능하다 		
		switch (score / 10) {
			case 10 :
				
			case 9 : 
				System.out.println("학점 A");
				break;
			
			case 8 : 
				System.out.println("학점 B");
				break;
			
			case 7 : 
				System.out.println("학점 C");
				break;
			
			case 6 : 
				System.out.println("학점 D");
				break;
			
			default :
				System.out.println("학점 F");
				break;
		}
		
		
		
	}

}

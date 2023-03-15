package W2_Day3;

import java.util.Iterator;
import java.util.Scanner;

public class Ex_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ================= 1번 =====================
		// 입력한 문자에 어절을 구하시오
		
		Scanner s = new Scanner(System.in);
		
//		"I love you";
//		
//		"자바는 객체 지향 언어로서 매우 좋은 언어이다.";
		
		while (true) {
			
			System.out.println(">> ");
			
			String str= s.nextLine();	
			
			System.out.println(str.length());
		
			if ("그만".equals(str)) {
				
				System.out.println("종료합니다.");
				
				break;
				
			} 
//			StringTokenizerEx st = new StringTokenizer(str, " ") ; 
//			System.out.println("어절 개수는 " + str.countTokens());
			
			
			String [] words = str.split(" ");
			
			
			
			System.out.println("어절 개수는" + words.length);
		}
		
		
		
		// ================= 2번 =====================
		
		
		System.out.println("문자열을 입력하세요. 빈 칸이나 있어도 되고 영어 한글 모두 됩니다.");
		
		Scanner scanner = new Scanner(System.in);
		
		String text = scanner.nextLine();
		
		int len = text.length();
		
		for (int i = 0; i < len; i++) {
			String first = text.substring(0, 1); // 인덱스 0에서 1까지 1개문자
			String last = text.substring(1); // 인덱스 1에서 끝까지
			text = last + first;
			
			System.out.println(text);
			
		} // I love you 
		scanner.close();;
		
		
		
		
		

	}

}

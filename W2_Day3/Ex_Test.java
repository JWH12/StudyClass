package W2_Day3;

import java.util.Iterator;

public class Ex_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Hello Java";
		
		
		// a의 숫자를 세어 줄 변수를 선언 및 초기화
		
		int count = 0;
		
		// str1 문자배열에서 a의 개수를 모두 찾을때까지 반복 할 수 있게 코드를 짠다.
		
		for (int i = 0; i < str1.length(); i++) {
			
			// 만약 str1 문자 배열에서 a의 숫자를 찾을 경우 카운트의 수를 증가시키는 코드
			if (str1.charAt(i) == 'a' ) { 
								
				count++;
				
			}	
			
		} System.out.println(count);
	


	}

}

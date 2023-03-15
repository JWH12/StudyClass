package W2_Day3;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/"); 앞쪽 문자열을 /를 기준으로 구분하라는 뜻의 코드
		
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/"); 
		
		
		// String Tokenizer에 다음 토큰이 존재하는지 판별하고 존재한다면 true 즉 반복을 하고 다음 토큰이 존재하지 않다면 false 즉 탈출하라(break;).
		while (st.hasMoreTokens())
			
		System.out.println(st.nextToken());
		

	}

}

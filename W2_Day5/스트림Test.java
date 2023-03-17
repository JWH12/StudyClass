package W2_Day5;

import java.io.*;


public class 스트림Test {

	
		public static void main(String[] args) {
		
		FileReader fin = null;
		
		
		try {
		
			fin = new FileReader("c:\\windows\\system.ini");  // 처음부터 끝까지 경로가 나와있는 것을 절대경로라고 한다.
			
			
		int c;											// c 를 int로 가능한 이유는 아스키코드를 이용하여 문자로 출력이 가능하기 때문이다.
		
		while ((c = fin.read()) != -1) { 				// 한 문자씩 파일 끝까지 읽기 / -1인 빈값을 의미한다. / Enter도 글로 인식하여 출력한다.
		
			System.out.print((char)c);
		
		}
		
		fin.close();
		
		}
		
		catch (IOException e) {
		
		System.out.println("입출력 오류");
		
		}
				
		
	}


}
	

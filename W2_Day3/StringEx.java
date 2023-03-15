package W2_Day3;

import java.util.StringTokenizer;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자열을 비교 할 때는 무조건 equal() 메소드를 사용하여 비교 할 것
		
		String str1 = "Hello";
		String str2 = "Java";
//		String str3 = "Hello";
		
		String str3 = new String ("Hello");
		String str4 = new String ("Hello");
		// str3 과 str4가 같은 값을 가지고 있지만 new로 객체들을 만들었기 때문에 서로 다른 객체이다. 
		
		
		System.out.println(str1);
		System.out.println(str3); 
		
		System.out.println(str1 == str3);
		// str1 과 str3가 같은 값을 가지고 있지만 new로 str3를 새로운 객체로 만들었기 때문에 서로 다른 객체이다. 
		
		System.out.println(str1.equals(str3));
		
//		if (str3.equals(str4)) {
//			System.out.println("같다");
//	}
	
//		if ("Hello".equals(str3)) { // equals를 이용하면 문자열과 객체를 비교 할 수도 있다.
//			System.out.println("같다");
//		
//						
//		} else {
//			System.out.println("다르다");
//		}
		
		System.out.println(str2.charAt(2)); //str2 문자배열 중 3번째의 값을 불러온다
		
		System.out.println(str2.length()); // str2 문자배열 수를 알 수 있다.
		
		// subString
		
		
		// ============== int compareTo ==================
				
		String java= "Java";
		
		String cpp = "C++";
		
		int res = java.compareTo(cpp);
		
		if(res == 0) {
		System.out.println("the same");
		
		}
		else if(res <0) {
		System.out.println(java + " < " + cpp);}
		
		else {
		System.out.println(java + " > " + cpp);}
		
		/*
		 ================ String trim() =============
		 
		 문자열의 양쪽에 있는 공백제거를 할 때 사용한다.
		
		
		================ StringBuffer =============
		
		StringBuffer append => String.comcat 과 비슷한 이치이다.
		
		String.insert(인덱스 숫자, String) => String 배열 중간에 String을 추가한다.
		
		
		================ StringTokenizer ================
		
		java.util.StringTokenizer
		
		하나의 문자열을 여러 문자열 분리하지만 자체 객체를 보유하고 있다.
		
		String 클래스의 split() 메소드를 이용하여 동일한 구현 가능
		
		ex) String query = "name=kitae&addr=seoul&age=21";  
	
			StringTokenizer st = new StringTokenizer(query, "&");
		
		
		
		*/
		
	
		
		
	}

}

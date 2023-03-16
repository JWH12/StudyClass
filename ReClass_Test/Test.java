package ReClass_Test;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		
		// Calc 클래스에서 만든 4개의 메소드를 호출하는 코드
		// 설정한 메게변수 실행 시키는 법
		
		Calc cal = new Calc();
		
		System.out.println(cal.sum(3, 6));
		System.out.println(cal.sum(3, 6.5));
		System.out.println(cal.sum(1.5, 3.5));
		System.out.println(cal.sum(3, 6, 9));
			
								
		// Calc 클래스에서 수정을 하게 하는 코드
		int arr[] = {3, 5, 2};
		
		int a = 10;
		
		Calc calc2 = new Calc();
				
		// 일반 데이터 타입은 값이 복사되어 넘어간다. 그렇기 때문에 수정하는 쪽에서 아무리 수정해도 원본은 변경이 안된다.
		// 객체 레퍼런스(주소)를 보내어 공유하는 경우 어느 곳에서 수정을 해도 값이 변경된다.
		
		calc2.refTest(a);
		calc2.refTest(arr);
		
			
		System.out.println(a);
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
	}

}

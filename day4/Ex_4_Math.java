package day4;

public class Ex_4_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Math 클래스
		
		
		// 크기를 비교해서 더 큰 숫자를 출력한다 
		
		int a = 10;
		int b = 20;
		
		System.out.println(Math.max(a, b)); // 최대값을 출력
		
		System.out.println(Math.min(a, b)); // 최소값을 출력  
													
		System.out.println((a <= b) ? a : b); // 사망연산자로서 (a <= b)에서의 값이 true 면 a: b 중 a가 출력된다
											  // false 면 a: b 중 b가 출력된다.
		
		System.out.println(Math.abs(-123)); // abs에 입력된 절대값을 출력
		
		
		

	}

}

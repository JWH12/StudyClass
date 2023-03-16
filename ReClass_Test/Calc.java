package ReClass_Test;

public class Calc {
	
	// 똑같은 이름을 가진 메소드 == 오버로딩 
	// 데이터타입(★)이 다르면 같은 이름을 가진 메소드를 설정 할 수 있다.
	// 변수의 개수가 달라도 된다.
	
	// 덧셈을 하는 메소드 
	
	int sum(int a, int b) {
		
		return a+b;
		
	}
	
	double sum(int a, double b) {
		
		return a+b;
		
	}
	
	double sum(double a, double b) {
		
		return a+b;
		
	}
	
	int sum(int a, int b, int c) {
		
		return a+b;
}
	
	
	
	//Test에 쓰여지 메소드를 수정하는 코드
	//배열을 받는 메소드
	void refTest(int[] arr) {
		
		arr[1] = 20;
		
	}
	
	void refTest(int a) {
		
		a = 20;
		
	}
	
	
	
	
	
	
}

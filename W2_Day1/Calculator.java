package W2_Day1;

public class Calculator {
	
	
	// sum메소드 생성
	
	
	
	// 1. int 형 변수 2개 받아서 덧셈 후 리턴
	
	int sum(int x, int y) {
		
		return x+y;
	}
	
	
	
	
	
	// 2. int 형 변수 3개 받아서 덧셈 후 리턴
	int sum(int x, int y, int z) {
		
		return x+y+z;
	}
	
	
	
	
	// 3. double 형 변수 2개 받아서 덧셈 후 리턴
	double sum(double x, double y) {
		
		return x+y;
	}
	
	
	
	// 4. int 형 1개, double 형 1개 받아서 덧셈 후 리턴
	double sum(int x, double y) {
		
		return x+y;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		int a = c.sum(3, 5);
		double b = c.sum(3, 3.5);
		double d = c.sum(2.5, 3.5);
		int e = c.sum(3, 4, 5);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}

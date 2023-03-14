package W2_Day1;

public class Ex_1_Test_Circle {
	
	public static void main(String[] args) {
		
//		int q = 10;
//		increase(q);
//		System.out.println(q);
	
		Circle c = new Circle(); 			// c => qwer
		c.radius = 10;						// => qwer.radius = 10;
		increase(c);
		
		System.out.println(c.radius);  		// qwer.radius++
		
	}
	
	static void increase(int a) {			// static의 의미는 
		
		a = a + 1;
	
		
	}
	
	static void increase(Circle w) {  		// w => qwer
		
		w.radius++;							// => qwer.radius++
		
		
	}

}

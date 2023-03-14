package java_Class;

public class Circle {
	
	
	
	public Circle() {} 
	
	String name;
	
	int redius;
	
		double getArea() { 				// void(return이 없음)가 아닌 double(return 있음)이 붙은 이유는 return의 유무이다. 
			return 3.14 * redius * redius;		// return에 쓰이는 데이터타입과 double(void, String)의 위치의 데이터타입과 동일해야한다.
		
		
	}
		
		
	
}


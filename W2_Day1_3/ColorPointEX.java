package W2_Day1_3;

public class ColorPointEX {

	public static void main(String[] args) {
		
		Point p = new Point();   			//point 객체 생성
		
		p.set(1, 2); 					//Point 클래스의 set()호출
		
		p.showPoint();
		
		
		ColorPoint cp = new ColorPoint(); //ColorPoint 
		
		
		cp.set(3, 4);  			// point의 set() 호출
		
		cp.setColor("red");			// ColorPoint의 setColor() 호출
		
		cp.showColorPoint(); 	 	// 컬러와 좌표 출력

	}

}

package W2_Day2;

public class ColorPoint extends Point {
	
	private String color;					 // 점의 색을 정의
	
	
		public ColorPoint(int x, int y, String color) {
			
			super(x, y); 					// Point(부모클래스)의 생성자 Point(x, y) 호출
			
			this.color = color;					
			
		}
		
		public void showColorPoint() {			//컬러 점의 좌표 출력
			
			System.out.print(color);
			
			showPoint(); 						//point 클래스의 showPoint() 호출		
			
		} 
		
	
	

}

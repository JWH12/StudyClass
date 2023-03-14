package W2_Day1_3;

public class ColorPoint extends Point {		// point를 상속받은 colorPoint 선언
	
	private String color;					 // 점의 색을 정의
	
	
	public void setColor(String color) {
		
		this.color = color;					
		
	}
	
	public void showColorPoint() {			//컬러 점의 좌표 출력
		
		System.out.print(color);
		
		showPoint(); 						//point 클래스의 showPoint() 호출		
		
	} 
	
	

}

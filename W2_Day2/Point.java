package W2_Day2;



public class Point {

	private int x, y;				// 한점을 구성하는 x,y 좌표
	
	public void set(int x, int y) {
		
		this.x = this.y = 0;
		
	}
	public Point(int x, int y) {
		
		this.x = x ; this.y = y;
	}
	
	
	public void showPoint() {		// 점의 좌표 출력
	
		System.out.println("(" + x + "," + y + ")");
		
	
}
}

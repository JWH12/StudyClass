package Ex_Re;

// Tv라는 클래스를 상속 받는다
// TV클래스의 메개변수가 있는 생성자가 있으면 상속을 못받는다.
// TV클래스에서 기본 생성자를 만들어서 오류를 해결한다.


public class ColorTV extends Tv {
	
	 private int color; 			// 화소를 뜻한다
	
	
	// 
	
	 ColorTV(){}
	 
	ColorTV(String name, int size, int channel, int sound, int color) {
		
		super(name, size, channel, sound);           // 부모클래스의 있는 값을 가져오는 코드이다.
				
		this.color = color;
}

	
	
	int getColor() {						// private 가 있는 값을 불러오기위해서 get을 사용하는데, 
											// 직접입력이 아닌 우클릭 소스를 사용 할 것
		
		return color;
		
	}
	
	
	
	
	
	
}

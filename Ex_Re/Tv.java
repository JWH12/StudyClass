package Ex_Re;

// 클래스는 변수와 메소드로 만드는 것을 말한다.

// TV라는 새로운 클래스를 만든다.
public class Tv {
	
	
	// Tv의 특성을 부여하고
	String name;
	int size;
	private int channel;
	private int sound;
	
	
	// 생성자를 만든다
	// 생성자는 매게변수의 타입이나 숫자가 다르면 여러개 생성이 가능하다
 

	Tv(){}
	
	
	Tv(String name, int size, int channel, int sound){
		
//		this(name, size, 1, 1); 		//this()는 부모클래스에 있는 값을 호출하는 코드이다.
		
		this.name = name;
		this.size = size;
		this.channel = channel;
		this.sound = sound;			
				
	}
//	
//	
//	
//	
//	Tv(String name, int size, int channel, int sound){
//		
//		this.name = name;
//		this.size = size;
//		
//	}
//	
	
	
	// Tv의 메소드(행동)를 정의 한다.
	
	void channelUp(){
		
		// channel 값을 하나 증가시켜준다.
		channel++;
		
		System.out.println("채널을 올렸습니다." + channel);
						
	}
	
	void channelDown(){
		
		// channel 값을 하나 증가시켜준다.
		channel--;
		
		System.out.println("채널을 내렸습니다.");
						
	}
	
	
	// 특정 숫자를 받아서 그 채널로 옮기는 코드
	
	void channelChange(int channel) {
		
		this.channel = channel;
		
		System.out.println(this.channel + "번 채널로 변경되었습니다.");
		
		
	}
	

	public int getChannel() {
		return channel;
	}


	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
	void soundChange() {
		
	   System.out.println("사운드 변경이 되었습니다.");
		
	}


	public int getSound() {
		return sound;
	}


	public void setSound(int sound) {
		this.sound = sound;
	}
	
	
}

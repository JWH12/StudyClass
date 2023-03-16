package Ex_Re;

import java.util.Scanner;

public class IPTV extends ColorTV {

	
	String ip;
	
	
	IPTV(String name, int size, int channel, int sound, int color, String ip) {
		
		super(name, size, channel, sound, color);
		
		this.ip = ip;
		
	}
	
	
	// IPTV의 기능을 추가한다.
	
	void ott() {
		System.out.println("다시보기 실행");
		
	}
	
	
	// TV클래스의 channel을 오버라이딩 한다.
	// 오버라이딩이란 부모클래스의 메소드를 자식클래스에서 재정의 하는 것을 말한다.
	
	void channelUp(){ 
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("채널을 얼마나 증가시킬겁니까?");
		
		int c = s.nextInt();						// Tv클래스의 channel 값과 직접 입력할 값을 연결한다.
		
		int channel = getChannel();  // private가 걸려있는 TV클래스에 channel을 가져옴
		
		 channel += c;				
		 
		 setChannel(channel); 		// get으로 가져온 channel값을 set메소드를 사용하여 수정한다.
		 
		 System.out.println("채널을 " + c + "증가 했습니다.");
		 System.out.println("현재 채널은 " + getChannel() + "입니다.");
		
	}
	
	
	
	void soundChange() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("사운드를 변경하시겠습니까?");
		
		int sc = s.nextInt();
		
		int sound = getSound();				//TV(부모클래스)에 있는 private int sound를 가져올 수 있는 코드
		
		sound += sc;						// sound 값에 입력할 값을 더해서 출력하기 위한 코드
		
		setSound(sound);
		
		System.out.println("사운드가 " + sc + "으로 변경 되었습니다.");
		System.out.println("현재 사운드는 " + getSound() + "입니다.");
		super.soundChange();				//부모클래스에 있는 soundChange의 문자열을 호출하기 위한 코드
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

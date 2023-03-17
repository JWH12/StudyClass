package NMGS;

public class 제네릭이론 {

	/*
	 ========================== Wapper(boxing, unboxing) =========================================

	 => 기본 자료타입(char, int, float, double, boolean 등)을 객체로 다루기 위해서 사용하는 클래스들을 래퍼 클래스(wrapper class)라고 합니다. 
	     즉, 기본타입을 객체 형태로 '포장'하는 것을 의미한다.
	
	 => 기본형을 래퍼 클래스로 바꾸는 것이 '포장된다'라는 의미이므로 박싱이고, 그 반대가 언박싱인 것이다.
	
	 => auto-boxing/unboxing이 가능하기 때문에 일일이 boxing/unboxing 코드를 입력 할 필요가 없다.
	
	
	 20-1 boxing : 기본 타입에서 wrapper 클래스로 전환  ex) Integer wrapper = new Integer(2);
	
	
	 20-2 unboxing : wrapper 클래스 객체를 기본 타입으로 전환
	
	 => rapper 클래스 객체를 기본형으로 전환하는 방법은 다음과 같이 'intValue()' 메소드를 사용한다.
	
	 ex) int primitive = wrapper.intValue();

	  
	  
	  
	 
	 ========================= Integer =================================
		static String parseInt(String s, int radix) => Integer 클래스의 메소드 중 가장 많이 씀
		
		=> 기본형을 객체로 다루기 위해 사용하는 클래스들을 래퍼 클래스(wrapper class)라고 한다.
		=> Unboxing하지 않을 시 산술 연산 불가능함
		=> null값 처리 가능
		
		사용하는 경우
		=> 매개변수로 객체를 필요로 할 때
		=> 기본형 값이 아닌 객체로 저장해야할 때
		=> 객체 간 비교가 필요할 때

	 
	 
	 
	 */
	
}

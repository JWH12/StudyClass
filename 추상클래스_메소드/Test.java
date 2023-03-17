package 추상클래스_메소드;

public class Test {
	public static void main(String[] args) {
		
		        // 하위 클래스인 AbstractTest 객체 생성
		        AbstractTest at = new AbstractTest();

		        // AbstractTest 클래스에서 재정의된 메소드 호출
		        at.sayHi();              // 안녕?
		        at.printSum(30, 40);     // 30과(와) 40의 합은 70(이)야
		
		
	}

}

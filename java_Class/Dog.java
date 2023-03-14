package java_Class;

public class Dog extends Animal{
	
	//Dog라는 변수 하나를 추가
	
	int test;
	
//	Dog(String name, int age){ 
//		this.name = name;       // this 는 도구클래스로 만든 객체를 뜻한다. 즉 본인을 뜻한다.
//		this.age = age;         // 	this 를 통해 클래스 메소드 및 생성자에서 자기 자신의 데이터를 업데이트하거나 조작할 수 있다.
	
		
		//		System.out.println("강아지 생성!!"); // 매개변수
		
	
	 Dog() {
		System.out.println("test");
	}
	  
	
	
	
	
	
	
//	} // 클래스 이름과 같은 메소드(생성자)는 객체를 만들 때 자동으로 한번 호출이 된다
	
	
	//
	void speak(String name, int age) { //speak라는 메소드를 호출할 때 name을 보내달라는 뜻
		System.out.println(age + "살 "+ name + "가 짖는다" ); //주의할 점은 데이터 타입과 입력 순서
	}
	
	
	
	
	

}

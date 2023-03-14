package java_Class;

public class Student {
	
	
	// 변수 선언
	String name;
	int age; 
	double height;
	
	
	// 생성자 작성
	// 위에 변수를 this 메소드를 사용하여 변수초기화
	
	Student(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
		
		
	}
	
	
	// 메소드 선언 (void 사용)
	void study() {
		
		System.out.println("공부중");
				
	};
	
	
	
	

}

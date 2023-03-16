package ReClass_Test;

import java.util.Scanner;

/*
 1. Human 클래스 생성
	- 이름, 나이, 키, 몸무게, IQ 변수 (모두 private)
	- 첫번째 생성자로 이름, 나이만 받을 경우 몸무게는 60 키는 170, IQ는 100으로 초기화
	- 두번째 생성자로 5개의 값을 모두 받아서 초기화
	- toString 메소드 오버라이딩
		-> '이름은 ooo 나이는 oo 입니다.' 출력
	- eat 메소드 생성
		-> 몸무게 1증가
	- running 메소드 생성
		-> 몸무게 1감소
	- study 메소드 생성
		-> '책을 읽었습니다.'
 */

public class Human {
	
	private String name;
	private int age;
	private double height;
	private double weight;
	private int IQ;
	
	
	
	
	Human(String name, int age) {
//		this(name, age, 170, 60, 100);  // 방법 1
		
		this.name = name;
		this.age = age;
		this.height = 170;
		this.weight = 60;
		this.IQ = 100;
		
	}
	
	Human(String name, int age, double height, double weight, int IQ){
		
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.IQ = IQ;
		
				
	}
	
	public String toString() {
	
		return "이름은 " + this.name + "나이는 " + this.age + "입니다.";
			
		//객체이름으로만 호출이 가능해서 toString을 사용한다.
	}
		
	
	void eat() {
		
		weight++;
		
	}
	
	void running() {
		
		weight--;
		
	}
	
	void study() {
		
		System.out.println("책을 읽었습니다.");
		
	}



	public int getIQ() {
		return IQ;
	}

	public void setIQ(int iQ) {
		IQ = iQ;
	}
	
		

}

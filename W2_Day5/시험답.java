package W2_Day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 시험답 {
	
	/*
	1. 클래스 = 필드와 메소드로 이루어지며 객체를 만들기 위한 설계도이다.
	
	객체를 설명 특징 등을 예시를 들어서 설명 할 것 = 변수와 메소드로 이루어져 있으며, 특성과 행동을 보유하고 있다. 구체화 된 요소이다. 
	
	
	2. 오버로딩 = 부모클래스에서 정의된 메소드를 자식클래스에서 재정의 하는 것
	
	오버라이딩 =  동일한 클래스의 같은 이름을 가진 메소드를 매개변수와 타입등이 다른 것들을 의미한다.
		
		
	3. 배열 컬렉션의 ArrayList의 차이점 등
	​
	가변크기를 가지고 삽입과 삭제가 용이하다.
	
	
	4. ArrayList 코드 예시의 빈칸을 기입하는 것
	
	 
	 */
	
	
	
	
	
	// ArrayList 와 HashMap 을 이용하여 아래와 같이 학생들의 성적을 관리하는 프로그램을 작성하시오.
	
	public static void main(String[] args) {
		
	
	
	Scanner s = new Scanner(System.in);
	ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();

	while(true) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		System.out.println("입력(이름, 수학점수, 영어점수) >> ");
		String name = s.next();
		if(name.equals("그만")) {
			break;
		}
		map.put("name", name);
		map.put("math", s.nextInt());
		map.put("eng", s.nextInt());
		
		list.add(map);
		
	}
	
	for(int i=0; i<list.size(); i++) {
		HashMap<String, Object> map = list.get(i);
		System.out.println("이름 : " + map.get("name"));
		System.out.println("수학 : " + map.get("math"));
		System.out.println("영어 : " + map.get("eng"));
	}
	
	
	}
}

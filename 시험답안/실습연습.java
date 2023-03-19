package 시험답안;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 실습연습 {
	
	public static void main(String[] args) {
	
	// 스캐너 입력을 위한 스캐너 객체 생성	
	Scanner scanner = new Scanner(System.in);
	
	// ArrayList와 HashMap을 이용한 객체 생성
	
	ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
	
	// while문으로 그만이라는 문구가 나올 때 까지 무한반복
	
	while (true) {
		
		// HashMaP을 이용한 객체 생성
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		System.out.println("입력(이름, 수학점수, 영어점수)");
		
		
		// 이름을 입력할 수 있게 한다.
		String name = scanner.next();
		
		// 만약 그만이라는 문구가 나오면 반복문을 빠져나가게 한다.
		if (name.equals("그만")) {
			break;
		}
		
		// map 객체에 HashMap에 있는 값을 put메소드를 이용하여 출력 하게 한다.
		map.put("name",name);
		map.put("math",scanner.next());
		map.put("eng",scanner.next());
		
		list.add(map);
		
	}
		for (int i = 0; i < list.size(); i++) {
			
			// map객체에 값을 추가
			HashMap<String, Object> map = list.get(i);
			
			System.out.println("이름 : " + map.get("name"));
			System.out.println("수학 : " + map.get("math"));
			System.out.println("영어 : " + map.get("eng"));
			
			
		}
		
		
	
	
	

}
}
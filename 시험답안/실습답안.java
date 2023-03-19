package 시험답안;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class 실습답안 {
	
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

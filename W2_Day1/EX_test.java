package W2_Day1;

import java.io.ObjectInputStream.GetField;

public class EX_test {

	public static void main(String[] args) {
		
		Human hwang = new Human("황수연", "컴공과 학생", 20, "여", "A");
		
		// System.out.println(hwang.job); // 황수연의 직업만을 출력할 때 씀
		// hwang.job = "수학과 학생"        // 황수연의 전공을 바꾸는 변수
		// 위와같이 변수에 직접적으로 접근하느 것은 보안상에 문제가 발생할 수 있기 때문에 사용하면 안좋다.
		
		System.out.println(hwang.getJob());		 
		
		hwang.setAge(30);						 // set의 메소드를 사용해서 간접적으로 황수연의 나이를 변경한다.
		
		System.out.println(hwang.getName());
		

	}

}

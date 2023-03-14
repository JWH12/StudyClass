package java_Class;

public class Ex_Studen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student hong = new Student("홍길동", 30, 170.5);

		Student kim = new Student("김철수", 20, 180.5);
		
		kim.height = 160.5; 							// 레퍼런스(주소)를 이용하여 김철수의 정보를 수정하고 싶을 때 씀
		
		hong.study();
		
		
		
		
	}

}

package java_Class;

public class Human_dap {

	public static void main(String[] args) {

		//main 메소드
		Human hong = new Human("홍길동");
		Human yu = new Human("유재석", "인천");
		Human kang = new Human("강호동", "서울", "010-1234-5678");
		Human park = new Human("박명수", "부산", "010-9876-4321", 50);
				
		System.out.println(park); // System.out.println(park.toString());
		System.out.println(yu);
		System.out.println(kang);
		System.out.println(hong);

	}

}

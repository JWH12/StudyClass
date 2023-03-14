package W2_Day2_Java_Tset;

import java.util.Scanner;

public class JavaTest1 {

	public static void main(String[] args) {
		
		
		
		// ========================== 1. 구구단 출력 ==========================
				
		
		for (int i = 2; i < 10; i++) {
			System.out.println("=========== " + i + " 단 ===========");
			
			for (int j = 1; j < 10; j++) {
				
				System.out.println( i + " * " + j + " = " + (i*j));
				
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		// ============= 2. 구구단 3의 배수만(3단, 6단, 9단 + if문 쓰지 않기) ==========================
			
			
			for (int i = 2; i < 10; i++) {
				
				System.out.println("=========== " + i + " 단 ===========");
				
												
				for (int j = 1; j < 10; j++) {
						

				}
			
		}
		
		
		
		
		
		
		/* ============= 3. 0이 입력되기 전까지 입력된 숫자들 더하기(음수 입력 시 다시 입력하도록)  =============
		  								(3 5 2 1 0 => 11) */
		
		Scanner s =new Scanner(System.in);	
		
		int arr[] = {3, 5, 2, 1, 0};
		
		System.out.println("숫자를 입력해 주세요.");
		
			
		
			for (int i = 0; i < arr.length; i++) {
				
				int num = s.nextInt();
												
				if (num < 0) {
					
					System.out.println("1이상의 숫자를 입력해주세요.");
					
				} else {
					
					System.out.println();
					
				}
				
			

								
		}
		
		
		
		
		
		
		
		
		
		
		
		
		// ============= 4. 배열 {10, -20, 30, 40, 50}의 음수를 제외한 평균 값 구하기  =============
		
		
		int arr2[] = {10, -20, 30, 40, 50};
		
		int sum = 0; 
		
		for (int i : arr2) {
						
			if (arr2[i] < 0 ) {
				
				sum += i;
				
			} System.out.println(sum);
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* ============= 5. Car 클래스 생성  =======================================
		 변수 : name, color, speed(int) - 모든 변수의 접근 지시자는 private
		 메소드 : speedUp, speedDown, 각 변수에 대한 get, set 메소드
			-> speedUp 메소드 호출 시 speed값 10증가
			-> speedDown 메소드 호출 시 speed값 10감소(단, 0미만으로 떨어지지 않음)
		 생성자 : name, color를 받아서 초기화, speed는 0으로 초기화 

		 메인 메소드 : Car 객체 생성(생성자 매개 변수 자유롭게), 
					set 메소드를 이용하여 speed 값을 100으로 변경
					speedUp 메소드 호출 후 현재 speed값 출력
					speedDown 메소드 호출 후 현재 speed값 출력 */
		
		

	}

}

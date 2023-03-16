package Ex_Re;
import java.util.Scanner;

public class ReClass_이론 {
	
	/*
	자바의 예외 처리
	 예외(Exception)
	 
	  오동작이나 결과에 악영향을 미칠 수 있는 실행 중 발생한 오류
	  
	  
	  
	 
	  
	  
	 
	 */
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[3]; 
		
		while(true) {
		 
		  System.out.print("나뉨수를 입력하시오:");
		 
		  int dividend = scanner.nextInt(); // 나뉨수 입력
		
		  System.out.print("나눗수를 입력하시오:");
		 
		  int divisor = scanner.nextInt(); // 나눗수 입력
		
		  try {  // while문의 값을 입력 중 발생하는 예외를 처리하는 코드
		
			System.out.println(dividend + "를 "+ divisor + "로 나누면 몫은" + dividend/divisor + "입니다.");
			
			arr[3] = 10;
			
			break; // 정상적인 나누기 완료 후 while 벗어나기
		}
		  
		  // Exception으로 모든 오류를 막을 수 있으나, 정확한 오류 판별이 불가능하다.
		  
		 catch(ArithmeticException e) { // ArithmeticException 예외 처리 코드
			 System.out.println(e.getLocalizedMessage());		// 오류를 메세지로 띄워준다
			 System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
		
		 }
		  catch(ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException 예외 처리 코드
			  
				System.out.println(e.getLocalizedMessage());
				 System.out.println("배열 크기 오류");
		
		}scanner.close();
		
		
		}
		
	}
}

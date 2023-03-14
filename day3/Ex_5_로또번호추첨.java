package day3;

import java.util.Arrays;

public class Ex_5_로또번호추첨 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//로또번호 6개 배열
//		int lotto[] = new int [6];
//		
//		int idx = 0;
//		
//		// 로또번호가 나올 때 까지 무한루프 설정
//		while (true) {
//						
//			boolean insert = true;  //특정상황을 체크하는 용도로 쓰임
//			
//			int num = (int)(Math.random()*45)+1;
//			
//			 for (int i = 0; i <= idx; i++) {
//						
//			
//			 if (lotto [i] == num) {
//				 
//				 insert = false;
//				 break;
//			  }
//			 }
//				 
//				 if (insert == true) {
//				    lotto [idx] = num ;
//				    idx++; 					// 배열 순서를 바꾸기 위한 용도
//				
//				 if (idx == 6)  break;
//				
//				 }	
//				
//				}  System.out.println(Arrays.toString(lotto));
				
				
				
				
		
				// 로또추첨번호 test
				
				// 1. 로또번호의 배열 수를 정한다 
				int lotto [] = new int [6]; 
				
				// 2. 배열의 숫자를 판별하기 위해서 설정해 놓은 용도
				int idx = 0;
				 
				// 3. 무한 루프를 걸어 중복 배제 및 6개의 배열이 나올때까지 값을 추출하기 위한 용도
				 while (true) {
					 
					// 4. 특정상황을 체크하는 용도
					 boolean insert = true; 
					
					// 5. 로또번호가 랜덤으로 나오게 하기 위해서 수식을 걸어 놓는다.
					 int num = (int)(Math.random()*45)+1;
					 
					 // 6. 배열 숫자와 로또 숫자의 중복을 걸러내기 위해서 for문으로 필터를 걸어놓는다.
					 for (int i = 0; i < idx; i++) {
						 
						 // 7. 만약 로또번호와 배열번호의 숫자가 중복이 있다면 for문으로 다시 올라간다.
						 if (lotto [i] == num) {
							 
							 insert = false;
							 
							 break;
						 }
						 
						} // 8. 만약 로또번호와 배열번호의 숫자가 중복이 없다면 배열의 숫자를 올린 뒤 번호를 다시 추첨하기 위해 for문으로 올라간다.
						 if (insert == true) {
							
							 lotto[idx] = num;
							
							 idx++; 
							 
							 // 9. 만약 6개의 배열의 로또 번호를 중복없이 모두 완성 하였다면 값을 출력한다.
							 if (idx == 6) { break;
							 }												 							 							 
							}
						
					} System.out.println(Arrays.toString(lotto));
															 
				 
			 }	
			}
			
		

	



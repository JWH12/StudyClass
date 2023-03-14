package day4;

import java.util.Arrays;
import java.util.Scanner;



public class Ex_2_선택배열문제_1번2번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr [] = {30, 20, 50, 15, 25};
		
			
		// ※1. 배열에 있는 수의 평균 구하기.
		
		 // 더한 값을 출력하기 위한 위한 코드 하나 선언 
		 
		 int sum = 0;  				
				
		 // 배열에 있는 값 더하기 
		 
		 for (int i : arr) {
			 
			 sum += i; 			// sum = sum + arr[i];
			 	 
		}
		 
		 // 더한 값에서 배열 수를 나누어서 평균 구하기
		 
		 int avr = sum / arr.length;
		 
		 System.out.println(avr);
		 
		
		 
		 
		 		
		// ※2. 배열에서 최대값과 최소값 구하기.
		// ※2-1. 최소값의 인덱스(위치 값) 구하기.
		 
		//최대값 최소값을 구하기위한 기본 설정 
		 
		 int max = arr[0]; //max 및 min 값을 int min/max = 0으로 놓을경우 배열에 음수 및 0이 있으면 음수 및 0 때문에 값이 안나옴 
		 					// int min/max = arr[0]으로하여 배열 첫번째 부터 비교하게 하여 값을 출력하게 해야함
		 int min = arr[0]; 
		 int minidx = 0;
		 
		 for(int i = 0; i < arr.length; i++) {
		    
			//최대값 설정 
			 
			 if(max < arr[i]) {
		    	 		    	 
		 	     max = arr[i];
		     }
			 
			//최소값 설정	
			 
			 if(min > arr[i]) {
 		    	 
		 	     min = arr[i];
		 	     
		 	 // 최소값의 위치를 알아보기 위한 용도
				 	minidx = i;
		 	  
		     }
			 
					  
		   } 
		 	
		 		System.out.println("최대값 : " + max);
			 	System.out.println("최소값 : " + min);
				System.out.println("최소값의 위치 : " + minidx );
		
		
		// ※2-2. 첫번째 숫자와 최소값 위치 바꾸기.
				
				// 첫번째 값 30을 임시로 저장
				// 최소 값을 첫번째로 이동
				// 임시로 저장한 최소 값의 위치로 이동
								
				// 순서를 바꾸기 위해서 사용할 temp를 배열 첫번째 숫자로 선언
				
				int temp = arr[0];  	// temp = 30 / {30, 20, 50, 15, 25}
				
				// 최소값의 위치인 minidx를 배열 순서 첫번째에 대입
				arr[0] = arr[minidx];   // arr[0] = 15 / {15, 20, 50, 15, 25}
				
				// 배열 첫번째에 들어간 최소값위치인 minidx에 순서변경으로 사용할 temp를 대입하여 배열 순서를 바꾼다.
				arr[minidx] = temp;  	// {15, 20, 50, 30, 25} 
				
				// 첫번째 배열에 있는 숫자 위치와 최소값위치를 배열순서를 바꾼 것을 출력
				System.out.println(Arrays.toString(arr));
		

			
				
		
		
		
		
		
		
		
		
	}
}



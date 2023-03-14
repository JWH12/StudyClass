package day4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex_5_문제5번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
		// {10, 25, 32, 54, 23, 16, 27, 61}
		// 기본 홀수는 오름차순 짝수는 내림차순
		// 홀, 짝 순으로 출력
		// {23,54,25,32,27,16,61,10}
		
		//=============== 오답 ===================
		
		int arr[] = {10, 25, 32, 54, 23, 16, 27, 61};
//		
//		
//		int even = arr[0];
//		int odd = arr[0];
//		
//		
//		
//		
//		for (int i = 0; i < arr.length; i++) {
//		 	
//					
//			if (arr[i] % 2 == 0) {
//				
//				even = arr[i];
//				
//				arr[i]++;
//				
//				
//				
//			}else {
//				
//				odd = arr[i];
//				
//				Arrays.sort(arr);
//				
//			} System.out.print(odd );
			
		//============정답 1============
		// 홀짝의 개수가 같을 경우
		// 홀짝의 개수를 바꾸면 오류가 뜬다.
		// 오류를 해결하기 위해서는 int idx 를 하나더 활용 할 것
		
//		int newArray2[] = new int [arr.length];
//		Arrays.sort(arr);
//		int oIndex = 0;
//		int eIndex = 0;
//		for (int i = 0; i < newArray2.length; i++) {
//			if (arr[i] % 2 == 1) {
//				newArray2[oIndex] = arr[i];
//				oIndex +=2;
//				
//			} else {
//				newArray2[eIndex] = arr[i];
//				oIndex -=2;
//				
//			}
//		} 	System.out.println(Arrays.toString(newArray2));
//		
//		
//		
		

		
		//===========정답 2 ==========
		//sort를 사용할 때 -를 붙여서 내림차순으로 사용 할 수 있다
		
		
		//========정답 3 ===================
		
		

		int oddArray[] = new int[arr.length];
				int evenArray[] = new int[arr.length];
				Arrays.sort(arr);
				int index = 0;
				for(int i=0; i<arr.length; i++) {
					if(arr[i] % 2 == 1) {
						oddArray[index] = arr[i];
						index++;
					}
				}
				int index2 = 0;
				for(int i=arr.length-1; i>=0; i--) {
					if(arr[i] % 2 == 0) {
						evenArray[index2] = arr[i];
						index2++;
					}
				}
				int newArray[] = new int[arr.length];
				index = 0;
				for(int i=0; i<arr.length; i++) {
					if(oddArray[i] != 0) {
						newArray[index++] = oddArray[i];
					}
					if(evenArray[i] != 0) {
						newArray[index++] = evenArray[i];
					}
				}
				System.out.println(Arrays.toString(newArray));
		
		
		
		
		
		
		
		
		
			
		} 
		
		
		
		
		
		

	}



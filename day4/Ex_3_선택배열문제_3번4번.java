package day4;

import java.util.Arrays;

public class Ex_3_선택배열문제_3번4번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// ※ 3. 배열의 개수만큼 * 찍기
		 //***
		 //*****
		 //**
		 //*****
		 //*	
		
				int arr [] = {3, 5, 2, 5, 1};
				
				// 배열에 입력된 개수대로 반복을 한다
				for(int i = 0; i < arr.length; i++) {
					
					// 배열의 입력된 숫자의 개수로 *를 출력한다
					for (int j = 0; j < arr[i]; j++) {
						System.out.print("*");
					}
					
					System.out.println();
					
					
					
				}
				
					
		
		
		
		/*
		
		int arr[] = {30, 20, 60, 0, 25, 20, 60, 0, 10, 30};
		
		// ※ 4.배열에서 중복된 값 제거하기 (결과 : (30, 20, 60, 0, 25, 10), 순서상관없음}
		
		
		
		
		// ============4번 답 1======================
				
				
			 

		int arr3[] = {30, 20, 60, 0, 25, 20, 60, 0, 10, 30, 30, 30};
		//#1 배열 중복값 제거
		int idx = 0;		
		
		int arridx[] = new int[arr3.length]; //새로운 배열
		
		for (int i = 0; i < arridx.length; i++) { // 새로운 배열에 임의 값 대입
			arridx[i] = -11;
		}
						 
		for (int i : arr3) {  // 새로운 배열과 중복 확인
			boolean check = true;
			
			for(int j = 0; j <= idx; j++) {
				if(arridx[j] == i) {
					check = false;
				}
			}
			
			if (check) {
					arridx[idx] = i;
					idx++;
				}
		}
		
		int stack = 0;
		for (int i : arridx) { // 새로운 배열의 임의 값 개수 확인
			if(i == -11) {
				stack++;
			}
		}
		
		int arridx2[] = new int[arridx.length-stack]; // 크기에 맞는 마지막 배열 생성
		
		for (int i = 0; i < arridx2.length; i++) {
			arridx2[i] = arridx[i];
		}
		
		System.out.println(Arrays.toString(arridx2));
		
		
		
			
			
			
			// ================4번 답 2================
			
			
			int arr4[] = {30, 20, 60, 0, 25, 20, 60, 0, 10, 30};
			int size = 0;
			int idx4 = 0;
			
			for (int i = 0; i < arr4.length; i++ ) {
				
				boolean flag1 = true;
				
				for (int j = i + 1; j < arr4.length; j++) {
					
					if (arr4[i] == arr3[j]) {
						flag1 = false;
					}
				
				}
				
				if (flag1 == true) {
					size++;
				}

			}
			
			int arr5[] = new int[size];
			
			for (int i = 0; i < arr4.length; i++) {
				
				boolean flag2 = true;
				
				for (int j = i + 1; j < arr4.length; j++) {
					
					if (arr4[i] == arr4[j]) {
						flag2 = false;
					}
					
				}
				
				if (flag2 == true) {
					arr5[idx4] = arr4[i];
					idx4++;
				}
				
			}
			
			System.out.println(Arrays.toString(arr5));
		
		
		
		
		*/
		
		
		

	}

}

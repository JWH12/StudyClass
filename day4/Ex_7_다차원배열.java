package day4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.BiConsumer;





public class Ex_7_다차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 다연차 배열 첫번쩨 []는 열(가로)을 나타내고 두번째 []은 행(세로)을 나타낸다.
		
//		int arr[][] = new int [3][2]; // {0,0,0}
//		
//		// {0,0}
//		// {0,0}
//		// {0,0}
//		
//		arr[0][0] = 1;
//		arr[0][1] = 10;
//		arr[1][1] = 3;
//		arr[2][1] = 5;
//		
//	
//		 for (int i = 0; i < arr[0].length; i++) {
//			 for (int j = 0; j < arr[i].length; j++) {
//				
//			}
//			
//		}
//		
//		System.out.println(Arrays.toString(arr[0]));
//		System.out.println(Arrays.toString(arr[1]));
//		System.out.println(Arrays.toString(arr[2]));
		
		
		//=================방법 2============================
		
//		for (int i = 0; i < score.length; i++) {
//			
//			System.out.println(Arrays.toString(score[i])); // 모든 값을 출력한다.
//			
//			System.out.println((score[i][0])); // 각줄의 첫번째 값만 출력한다.
//			
//			for (int j = 0; j < score[i].length; j++) {        // j < 2와 같이 조건에 숫자를 직접 입력하는 것을 하드코딩이라고 한다.
//									   // int j = 0; j <score [i].lenght; j++와 같이 입력할 경우 score에 입력된 모든 값을 순차적으로 출력한다. 
//				
//				System.out.println(score[i][j]); // 각 요소에 순차적으로 접근하여 출력한다.
//				
//			}
//			
//			
//			
//		}
//		
		
		
		
		
		//================문제================
		
		
		double score[][] = {{3.3, 3.4},		// 1학년 1, 2학기 평점
				  			{3.5, 3.6},		// 2학년 1, 2학기 평점
				  			{3.7, 4.0, 4.3},		// 3학년 1, 2학기 평점
				  			{4.1, 4.2} };	// 4학년 1, 2학기 평점
		
		// score[0][0], score[0][1]
		// score[1][0], score[1][1]
	
		
		
		
		//==================test 1==========================
		// 각학면에 평균을 구하기 
		
		
//		for (int i = 0; i < score.length; i++) {
//			double sum = 0;
//			for (int j = 0; j < score[i].length; j++) {
//				sum += score[i][j];
//			}
//			System.out.println(i+1 + "학년 평균 : " + (sum/score[i].length));
//			
//		}
		
		
		
		
		
		
		//==================test 2=====================
		// 전체 학년에 평균을 구하기
		//
		
		// double sum = 0; 을 반복문 밖에서 입력할 경우 반복문 안에서 sum = 0;을 넣어 반복마다 초기화 시켜준다
		
		
		double allsum = 0; // 전체평균을 구하기 위해서 전체합으로 쓸 빈코드를 만든다.
		int cnt = 0;	   // 조건을 비교하기 위해서 빈코드를 만든다.
		
		for (int i = 0; i < score.length; i++) {
			
			double sum = 0;
			
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				allsum += score[i][j];
				cnt++;
				
			}
			
			
			System.out.println(i+1 + "학년 평균 : " + (sum/score[i].length)); 
			
		}  System.out.println("전체 평균 : " + (allsum/cnt)); 
		
		
		
		
		
		
		
	}

}

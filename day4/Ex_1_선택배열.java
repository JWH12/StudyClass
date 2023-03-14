package day4;

public class Ex_1_선택배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 관련있는 것들을 묶어서 설정 할 것
		// 대괄호의 위치는 상관없다 ex ) int [] arr = {} / int arr [] = {} 
		
		
		
		
		// 배열에 순차적으로 접근하고 싶으면 쓰는 용도 
		// 위와 아래의 for문은 같은 값을 불러온다 
		// 아래 for문은 향상된 for문이라고 한다.
		
		int arr [] = {1, 2, 3,};
		int arr2[] = new int [3]; // {0, 0, 0,}
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		for(int num : arr) {
			System.out.println(num);
			
		}
		
		
		

	}

}

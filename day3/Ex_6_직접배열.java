package day3;

import java.util.Arrays;

public class Ex_6_직접배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 선택정렬을 사용하여 정령 할 것
		// 선택정렬은 배열 된 숫자들 중 최소 값을 배열 첫번째로 가져와서 고정시킨다.
		// 디버깅이란 코드를 순서대로 접근하면서 보는 것으로 보통 오류를 찾을 때 사용한다.
		// 디버깅을 설정 해 놓으면 지정한 열까지만 실행 된다.
		
		int arr[] = {9, 6, 7, 3, 5};
		for(int i=0; i<arr.length-1; i++) {
			int min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			System.out.println(Arrays.toString(arr));
		}
		 
		
		

	}

}

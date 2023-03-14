package day5;

import java.util.Arrays;
import java.util.Iterator;

public class Ex_1_다차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
//		int a = 10;
//		int b;
//		
//		b = a;
//		b = 30;
//		
//		
//		System.out.println(a);
//		System.out.println(b);
		
		
		
		// 객체변수는 주소(위치)를 저장한다
		
//		int arr[] = {1, 2, 3, 4, 5};
//		int arr2[];
//		arr2 = arr;    // arr 값을 arr2에 넣은것이 아닌 arr이 가리키고 있는 주소(위치)를 arr2가 같이 가리키고 있는 것이다. 즉 주소(위치) 공유를 한다.
//		arr2 [0] = 100;
//		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		// 배열 복사 방법 1
		// 복사하면서 순차적으로 배열을 집어 넣는다
		
		
//		int arr[] = {1, 2, 3, 4, 5};
//		int arr2[] = new int[arr.length]; // 복사할 객체와 같은 배열의 수를 만든다
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr2[i] = arr[i];
//			
//		} 
//		arr2[0] = 100;
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		// 배열 복사 방법 2
		// Arrays.copyof(주소, 복사할 개수)복사하면서 순차적으로 배열을 집어 넣는다
		
		int arr[] = {1, 2, 3, 4, 5};
		int arr2[];
		
		Arrays.copyOf(arr, arr.length);
		arr2 = Arrays.copyOf(arr, arr.length);
		
		arr2[0] = 100;   
		// arr의 주소를 arr2와 공유하고 있기 때문에 arr2 첫번째 배열에 100을 넣으면 arr에 배열 값에 변화없이 arr2에서 100을 첫번째 배열에 출력할 수 있다.
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		
		
		

	}

}

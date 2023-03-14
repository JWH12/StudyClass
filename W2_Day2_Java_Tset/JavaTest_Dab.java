package W2_Day2_Java_Tset;

import java.util.Scanner;

public class JavaTest_Dab {

	public static void main(String[] args) {
		
		
		// 1.
		for(int i=2; i<10; i++) {
			System.out.println("=========" + i + " 단 =========");
			for(int j=1; j<10; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
		
		
//		 2.
		for(int i=3; i<10; i+=3) {
			System.out.println("=========" + i + " 단 =========");
			for(int j=1; j<10; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
		
		
		// 3.
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 입력(0입력 시 종료, 양수만)");
		int sum = 0;
		while(true) {
			int in = s.nextInt();
			if(in == 0) {
				break;
			} else if(in < 0) {
				System.out.println("0보다 큰 수 입력");
			} else {
				sum += in;
			}
		}
		System.out.println("합 : " + sum);
		
		
		// 4.
		int arr[] = {10, -20, 30, 40, 50};
		int sum2 = 0;
		int cnt = 0;
		for(int num : arr) {
			if(num > 0) {
				sum2 += num;
				cnt++;
			}
		}
		System.out.println("평균 : " + (sum2/cnt));
		
		
		
	
	}

}

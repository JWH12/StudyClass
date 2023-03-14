package day2_project;

import java.util.Iterator;
import java.util.Scanner;

public class Ex_5_반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 반복문 1. for 2. while
		// for의 인수는 i로 사용 
		//
		
		/*
		int sum = 0;
		for(int i = 1; i<10; i++) {
			sum = sum + i; // i = 1, sum = 0 + 1 = 1 (sum += i)
				
		}
		System.out.println(sum); */
		
		/*
		//짝수만 분별하여 더하는 법
		//홀수만 분별하여 더하는 법
		int oddSum = 0; 
		int evenSum = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			}else {
				oddSum += i;
			}
		}
		System.out.println("짝수 : " + evenSum);
		System.out.println("홀수 : " + oddSum); */
		
		
		/*
		// 10부터 1까지 역순으로 나오게 하기
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		} */
		
		
		/*
		// 키보드로 입력한 숫자까지 반복하게 만드는 법
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		int num = s.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println(i); 
		} */
		
		// 입력받은 숫자가 구구단으로 출력 하는 법
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		int num = s.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + "*" + i + "=" + (num * i)); 
		}
	}

}

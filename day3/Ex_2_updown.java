package day3;

import java.util.Random;
import java.util.Scanner;

public class Ex_2_updown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		// 랜덤숫자 설정
		int num1 = ran.nextInt(100) +1 ;
		int count = 1;
		System.out.println("숫자를 맞춰보세요");
		
				
		// 반복문 설정
		while (true) {
					
				
		// 입력값 설정	
		int num = s.nextInt();
		
		
		// 입력 한 숫자와 정답과의 차이 알림 
		if (num < num1) {
			System.out.println("up");
				count++;
			} else if(num > num1) {
				System.out.println("down");
				count++;
				}
		
			else {
				System.out.println("정답입니다. " + count + " 번 만에 맞추셨습니다.");
			break;		}
		
			}
	
	}
}

package day4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ex_6_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//=========1번===========
		// Scanner 클래스를 통해 6개의 공간을 가지는 int형 배열에 값을 입력한다.
		// (단, 0이하의 숫자를 입력 할 경우 저장하지 않고 1 이상의 숫자를 입력하라는 안내문구를 띄운다.
		// ex) {10, 5, 3, 8, 20, 15}
		
		
		
		Scanner s = new Scanner(System.in);
		
			int array[] = new int [6];
		
		
			System.out.println("6개의 숫자를 입력해주세요.");
			
				 
			for (int i = 0; i < array.length; i++) {
				
				int num = s.nextInt();
				
				if (num < 0) {
					System.out.println("1이상의 숫자를 입력해주세요.");
					i--;
					
				} else {
					array[i] = num;
					
				}
			} 
				
		
			
		
		//=========1-2번==========
		// 입력받은 배열의 숫자에 순차적으로 접근하여 홀수일 경우 음수로 바꿔준다.
		//ex) {10, -5, -3, 8, 20, -15}
		
			
		
				
			int odd = 0;
			
			
			for (int i = 0; i < array.length; i++) {
				
			
				if (array[i] % 2 == 0) {
					
					System.out.print(array[i] + " " );
					
				} else {
					
					odd = array[i];
					
					System.out.print(-odd + " ");
				
				} 
			}
			
			
			
			
			//=======3번==========
			//배열내 양수의 평균을 구한다. (소수점까지)
			//=======4번==========
			//배열내 음수의 개수를 구한다.
			 
			int sum = 0;
			int cnt = 0;
			
			 for (int i = 0; i < array.length; i++) 
				
			 {  if (array[i] > 0) {
				
				  sum += array[i];
				  cnt++;
			
			 
			 }
			 }
					 
			 System.out.println(sum/cnt);
			 System.out.println(cnt);
			
			


	
	}
}

package day5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_3_5번6번문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//5.배열내 수를 재정렬한다 (양수,음수,양수,음수 순으로)
		//
		//6.배열내에서 2개의 수의 차가 가장큰 경우를 구하라
		//음수는 절대값으로 처리
		//가장큰수화 작은수 두개를구함
		
		
		System.out.println("======1번======");
		Scanner s = new Scanner(System.in);
		int arr[] = new int[6];
		System.out.println("숫자 6개를 입력해주세요(1이상)");

		for (int i = 0; i < arr.length; i++) {
			int n = s.nextInt();
			if (n <= 0) {
				System.out.println("1이상 입력해주세요");
				i--;
			} else if (n > 0) {
				arr[i] = n;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("======2번======");
		//2입력받은 배열의 숫자에 순차적으로 접근하여 홀수일경우 음수로 바궈준다
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==1) {
				arr[i]=-arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("======3번======");
		//3.배열내 양수의 평균을 구한다.소수점까지
		double sum=0;
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
				count++;
			}
		}
		System.out.println((double)sum/count);
		
		System.out.println("======4번======");
//		4.배열내 음수의 개수를 구한다.
		int count2=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0) {
				sum+=arr[i];
				count2++;
			}
		}
		System.out.println("배열내 음수의 개수 : "+count2);
		
		
		
		
		
		
		
		
		System.out.println("======5번======");
		//5.배열내 수를 재정렬한다 (양수,음수,양수,음수 순으로)
		
				int up[]= new int[arr.length];
				int down[]= new int[arr.length];
				int arr2[]= new int[arr.length];
				
				//음수 양수 분리
				int index =0;
				int index2 =0;
				for(int i=0;i<arr.length;i++) {
					if(arr[i]<0) {
						down[index]=arr[i];
						index++;
					}
					if(arr[i]>0) {
						up[index2]=arr[i];
						index2++;
					}
					
				}
				System.out.println("up");
				System.out.println(Arrays.toString(up));
				System.out.println("down");
				System.out.println(Arrays.toString(down));
				//음수 양수 순으로 배열 입력
				index = 0;
				for(int i=0;i<arr2.length;i++) {
					
					if(down[i]!=0) {
						arr2[index]=down[i];
						index++;
					}
					if(up[i]!=0) {
						arr2[index]=up[i];
						index++;
					}
				}
				System.out.println("음수 양수 순으로 정렬");
				System.out.println(Arrays.toString(arr2));
				System.out.println("");
				
				
				
				
				System.out.println("======6번======");
				//6.배열내에서 2개의 수의 차가 가장큰 경우를 구하라
				//음수는 절대값으로 처리
				//가장큰수와 작은수 두개를구함
				for (int i = 0; i < arr.length; i++) {
					if(arr[i]<0) {
						arr[i]=-arr[i];
					}
				}
				System.out.println(Arrays.toString(arr));
				int min=arr[0];
				int max=arr[0];
				for (int i = 0; i < arr.length; i++) {
						if(arr[i]>max) {
							max=arr[i];
						}
						if(arr[i]<min) {
							min=arr[i];
						}
				}
				System.out.println("max : "+Math.abs(max)+" min : "+Math.abs(min));
		
		
		

	}

}

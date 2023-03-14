package day5;


import java.util.Arrays;
import java.util.Iterator;



public class Ex_2_연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// p144 문제 3. 배열에 담긴 점수들의 합계 점수와 평균점수를 출력하는 코드를 완성하시오.
		
		
		int [] score = {90, 80, 60, 100};
		int totalScore = 0;
		
		double avgScore = 0;
		
		for (int i = 0; i < score.length; i++) {
			
			totalScore += score[i]  ; 
			
						
		}
		avgScore = (double)totalScore / score.length;
		
		System.out.println("합계점수 : " + totalScore);
		
	    System.out.println("평균점수 : " + avgScore);
		
		
		
		
		
		
		
		
		
		// 문제 4 
		
	    
	    int [] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    int [] num2 = new int[10];
	    
	     	    	    
	    
	    for (int i = 0; i < num2.length; i++) {
				    	
	    	num2[i] =(int) Math.pow(num1[i], 2); // Math.pow(제곱할 배열, 제곱할 수)
	    	
	    	
		} System.out.println(Arrays.toString(num2));
		
		
		
		

	}

}

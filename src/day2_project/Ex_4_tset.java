package day2_project;

public class Ex_4_tset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제4
		int age = 5;
		int height = 130;
		boolean hearch = false;
		boolean parent = true;
		
		System.out.println((age >= 6 || (height >= 120 && parent)) && height >= 120 && !hearch);
		
		if ((age >= 6 || (height >= 120 && parent)) && height >= 120 && !hearch) {
		
			System.out.println("탑승 가능");
			
			
		}
		
		
		//문제5
		int year = 2020;
		boolean leapYear = (year % 4 == 0 && year /100 != 0) || 2020 % 400 == 0 ;
			System.out.println(leapYear);
		
				
		
		
		
		
		

	}

}

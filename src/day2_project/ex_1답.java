package day2_project;

public class ex_1답 {
	public static void main(String[] args) {
		// ex4
				int age = 5;
				int height = 130;
				boolean parent = true;
				boolean hearch = false;
				
				System.out.println((age >= 6 || (height > 120 && parent)) && height >= 120 && !hearch);
				if((age >= 6 || (height >= 120 && parent)) && height >= 120 && !hearch) {
					System.out.println("탑승 가능");
				}
				System.out.println();
				// ex5
				int year = 2020;
				boolean leapYear = (year % 4 == 0 && year% 100 != 0) || year% 400 == 0;
				System.out.println(leapYear);
				System.out.println();
				
				
				// ex6
				int price = 187000;
				int oman = price/50000;
				int ilman = price % 50000 / 10000; 
				int ochun = price % 10000 / 5000;
				int ilchun = price % 5000 / 1000;
				
				
				System.out.println("5만원권 : " + oman + "장");
				System.out.println("1만원권 : " + ilman + "장");
				System.out.println("5천원권 : " + ochun + "장");
				System.out.println("1천원권 : " + ilchun + "장");
				System.out.println();
				
				
				// ex7
				int number = 1234;
				int result = number / 100 * 100;
				System.out.println(result);
				System.out.println();
	}

}

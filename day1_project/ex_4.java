package day1_project;

public class ex_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int a = 10;
		a += 20; // a = a + 20 => 30
		a -= 10; // a = a - 10 => 20 */
		
		/*
		int number1 = 10;
		System.out.println("number1 = 10 → " + number1); // 10출력
		number1 += 10; // 더하고 대입
		System.out.println("number1 += 10 → " + number1); // 20출력
		number1 -= 10; // 빼고 대입
		System.out.println("number1 -= 10 → " + number1); // 10출력
		number1 *= 2; // 곱하고 대입
		System.out.println("number1 *= 2 → " + number1); // 20출력
		number1 /= 2; // 나누고 대입
		System.out.println("number1 /= 2 → " + number1); // 10출력
		number1 %= 3; // 나머지 대입
		System.out.println("number1 %= 3 → " + number1); // 1출력 */
		
		/*
		//정수와 정수가 계산 될 때는 정수가 나오지만 정수와 실수가 계산되면 실수가 나온다.
		int a = 10;
		int b = 3;
		System.out.println(a / b); // 정수끼리 연산 = 결과 정수
		double c = 3;
		System.out.println(a /c ); // 실수하나라고 있으면 결과 실수 */
		
		/*
		int a = 10;
		a++;
		System.out.println("a++ : " + a);
		int b = 10;
		b += 1;
		System.out.println("b += 1 : " + b);
		int c = 10;
		c = c + 1;
		System.out.println("c = c + 1 : " + c); */
		
		
		//증강연산자
		int num1 = 10;
		int num2 = num1++;
		System.out.println(num1); // 11출력
		System.out.println(num2); // 10출력
		int num3 = --num2;
		System.out.println(num2); // 9출력
		System.out.println(num3); // 9출력
		int num4 = num3++;
		System.out.println(num3); // 10출력
		System.out.println(num4); // 9출력
		
		
		
		
		
		

	}

}

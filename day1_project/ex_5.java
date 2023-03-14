package day1_project;

public class ex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// true and true => true
		// true and false => false
		// true or true => true
		// true or false => true
		
		/*
		int a = 20;
		int b = 10;
		System.out.println(a>b && a>10); //&&(and)
		System.out.println(a>b && a>30);
		
		System.out.println(a>b || a>30); // \ + Shift = ||(or)
		System.out.println(!(a>b || a>30)); // !는 현재값의 부정을 의미함
		System.out.println(!true);  */
		
		
		int a = 20;
		int b = 10;
				
		System.out.println(a>b | a>30); // |를 한개 입력 시 뒷부분까지 계산 함 
		System.out.println(a>b || a>30); // ||를 두개 입력 시 뒷부분은 계산 안함
		
		
		
	}

}

package ReClass_Test;

public class Student extends Human {
	
	
	private String stuNum;
	
	
	
	Student(String name, int age, double height, double weight, int IQ, int hb) {
		
		super(name, age, height, weight, IQ); //부모 클래스로부터 값을 받음
		
		this.stuNum = stuNum;
	}
	
	
	void study(int IQ) {
		
		int parIQ = getIQ();
		
		parIQ += IQ;
		
		setIQ(parIQ);
		
		super.study();
		
		
	}
	
	

}

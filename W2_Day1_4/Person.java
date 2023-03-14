package W2_Day1_4;

import W2_Day1.Human;

public class Person {
	
	//==================== p203 3번 ===============
	
	private String name;
	private String gender;
	private int age;
	private int height;
	private int weight;
	
	Person(){}
	
	
	Person(String name, String gender, int age, int height, int weight){
		
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
					
	}
	
	public String toString() {
		return getName() + ", " + getGender() + ", " + getAge() + "세, " + getHeight() + "cm, " + getWeight() + "kg 입니다.";
	}
	
	
	public String getName() {
		return name;
	}


	public String getGender() {
		return gender;
	}


	
	public int getAge() {
		return age;
	}


	
	public int getHeight() {
		return height;
	}


	
	public int getWeight() {
		return weight;
	}


		
	
	public static void main(String[] args) {
		
		Person hu = new Person("김휴먼", "남", 30, 180, 75 );
		
		System.out.println(hu);
	}

}

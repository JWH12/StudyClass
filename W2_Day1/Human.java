package W2_Day1;

public class Human {
	
	
	//Human 클래스의 변수 선언
	private String name;
	private String job;  // private를 사용하면 클래스 내의 접근을 막는다. 즉 변수를 변경 할 수없다.
	int age;
	private String gender;
	private String blood;
	
	Human(){}
	
	
	//변수 초기화
	Human(String name, String job, int age, String gender, String blood) {
		
		this.name = name;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.blood = blood;		
		
	}
	
//	// ===============get 메소드=================== 
//	// private 변수명 앞에 get을 붙인다.
//	// private변수에 간접적인 접근을 할 수 있게 만든다.
//	
//	String getjob() {
//		return this.job; 
//	}
//	
//	// ============= set 메소드===================
//	// set은 간접적으로 private 변수를 간접적으로 변경 할 수 있게 해준다.
//	
//	void setAge(int age) {
//		this.age = age;
//	}
//	
	
	
	
	
	void eat() {
		
	}
	
	
	void sleep() {
		
	}
	
	
	void speak() {
		
	}
	
	void walking() {
		
	}

// 우클릭 source 에서 
// get메소드와 set메소드를 자동으로 추가해 준다.
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getBlood() {
		return blood;
	}


	public void setBlood(String blood) {
		this.blood = blood;
	}
	
	
	

}

package 추상클래스_메소드;

public class AbstractTest extends Exam {
	
	// Exam 클래스의 sayHi() 추상 메소드 오버라이딩
    public void sayHi() {
        System.out.println("안녕?");
    }

    // Exam 클래스의 printSum() 추상 메소드 오버라이딩
    public void printSum(int a, int b) {
        int result = sum(a, b);
        System.out.println(a + "과(와) " + b + "의 합은 " + result + "(이)야");
    }
	

}

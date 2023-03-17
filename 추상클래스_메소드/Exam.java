package 추상클래스_메소드;

//추상 메소드를 가진 추상 클래스
abstract class Exam {
	

	  // 일반 메소드
    public int sum(int x, int y) {
        
    	return x + y; 
        
    }
    
    /* 추상 메소드, 하위 클래스에서 오버라이딩을 완료해야 함 */
    // 하위 클래스에서 "안녕?"을 출력하는 메소드로 구현
    abstract public void sayHi();

   
    // 하위 클래스에서 매개변수 a와 b를 더한 뒤 결과를 출력하는 메소드로 구현
    abstract public void printSum(int a, int b);
        
    
    
    
    
}

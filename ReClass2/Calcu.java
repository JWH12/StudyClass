package ReClass2;

// 인터페이스 클래스를 상속받을 때 쓴다.

public class Calcu implements Calc{

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	
	
}

package JAVA_GUI;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	public MyFrame() {						// 생성자를 이용하여 객체에서 만들어지게 함
		setTitle("300x300 스윙 프레임 만들기");         	
		
		setSize(300, 300);  		// 프레임 크기 300x300
		
		setVisible(true); 		// 특정조건에 해당하면 프레임 출력 / 이 코드를 지울 시 화면에 안보일 뿐 백그라운드에서는 실행이 되고 있다.
		}
	
		public static void main(String[] args) {
		
			MyFrame frame = new MyFrame();
		}

}

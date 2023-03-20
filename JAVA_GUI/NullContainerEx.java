package JAVA_GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame{
	
	public NullContainerEx() {
		
		setTitle("Null Container Sample");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(null);								// null 값을 사용하여 JPanel의 배치관리자를 삭제하는 예
		
//		JPanel p = new JPanel();						// 이런 형식으로도 입력한다.
//		p.setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		
			la.setLocation(130, 50);
		
			la.setSize(300, 50);							// 크기를 잘못 설정하면 버튼이 짤린다
			
			la.setOpaque(true);							// 이 코드가 true값이 되어야만 적용한 색이 출력된다
			
			la.setFont(new Font("serif", Font.ITALIC, 30));  		// Font라는 객체를 이용해서 폰트를 지정할 수 있는 코드이다.
			
			la.setBackground(Color.orange);				// 백그라운드의 색을 정할 수 있다.
			
			c.add(la);
		
		for(int i=1; i<=9; i++) {
			
			JButton b = new JButton(Integer.toString(i));  // 버튼 생성
			
			b.setLocation(i*15, i*15);					   // 버튼의 위치는 왼쪽 상단에서부터 (0, 0) 부터 시작한다.
			
			b.setSize(50, 20);							   // 
			
			c.add(b); 									   // 버튼을 컨텐트팬에 부착
		}
			
			setSize(500, 500);								
			
			setVisible(true);
		}
			
			public static void main(String[] args) {
				new NullContainerEx();
		}


}

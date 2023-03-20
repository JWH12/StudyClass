package JAVA_GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame {

		
		public InnerClassListener() {					
		
		setTitle("Action 이벤트 리스너 예제");					//this.setTitle과 같은 코드이다.
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		
		btn.addActionListener(new MyActionListener());			// addActionListener();는 버튼을 클릭하면 이벤트가 발생하게 하는 코드
		
		c.add(btn);
		
		setSize(350, 150);
		
		setVisible(true);

	
		}   //======= 내부 클래스로 Action 리스너를 추가한다 =========
		
		private class MyActionListener implements ActionListener {  // 버튼을 눌렀을 때 발생하는 이벤트를 
			
			public void actionPerformed(ActionEvent e) {		// actionPerformed는 acttion메소드에 있는 추상메소드이다. 
				                                                // ActionEvent e는 이벤트가 발생한 위치를 찾아낸다.
				JButton b = (JButton)e.getSource();			    // getSource()를 통하여 이벤트가 발생한 위치를 찾아낸다.
			
			if(b.getText().equals("Action"))
			
					b.setText("액션");
			
			else
			
				b.setText("Action"); 						  // InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
			  							
			InnerClassListener.this.setTitle(b.getText());    // 프레임 타이틀에 버튼 문자열을 출력한다.
			
			}
		}
			public static void main(String [] args) {
				new InnerClassListener();

			}
}

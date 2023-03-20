package JAVA_GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame {
	
	//익명 클래스로 Action 이벤트 리스너 만들기
	
	public AnonymousClassListener() {
		
	setTitle("Action 이벤트 리스너 작성");
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container c = getContentPane();
	
	c.setLayout(new FlowLayout());
	
		
	JButton btn = new JButton("Action");
	
	c.add(btn);
	
	btn.addActionListener(new ActionListener() {
	
		public void actionPerformed(ActionEvent e) {
				
			JButton b = (JButton)e.getSource();
	
						
			if(b.getText().equals("Action")) {
	
				b.setText("액션");
				
				c.setBackground(Color.ORANGE);
		}
			else {
	
				b.setText("Action");
	
			setTitle(b.getText());
			
			c.setBackground(Color.cyan);
			}
	}
	
	});
	
	setSize(350, 150);
	
	setVisible(true);
	}
	
	public static void main(String [] args) {
	
		new AnonymousClassListener();
}
}
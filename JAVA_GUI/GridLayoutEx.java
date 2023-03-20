package JAVA_GUI;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		
//		   컴포넌트의 절대 크기와 절대 위치 설정
//		 프로그램 내에서 이루어져야 함
//		 컴포넌트 크기 설정 : component.setSize(int width, int height);
//		 컴포넌트 위치 설정 : component.setLocation(int x, int y);
//		 컴포넌트 위치와 크기 동시 설정 : component.setBounds(int x, int y, int width, int height); / 대부분 사용을 안함
		
		setTitle("GridLayout Sample");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(2, 2);
		
		grid.setVgap(4);
		
		Container c = getContentPane();
		
		c.setLayout(grid);
		
		c.add(new JLabel(" 이름"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		
		
		setSize(300, 200);
		
		setVisible(true);
	}
		public static void main(String[] args) {
			new GridLayoutEx();
}
}


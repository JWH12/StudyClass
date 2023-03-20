package JAVA_GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame { 
	
	public ContentPaneEx() {  
		
		setTitle("ContentPane과 JFrame");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // GUI를 사용할 때 계속 복사하여 사용할 코드 / 백그라운드에 남아있는 프로그램을 종료시키는 코드
		
		Container contentPane = getContentPane();   // 컨텐트팬을 알아내기 위한 코드
		
		contentPane.setBackground(Color.ORANGE);   // 백그라운드의 다양한 색을 지정하는 코드 / 
//		contentPane.setLayout(new FlowLayout());   // 배치를 지정하는 코드 즉, 배치관리자이며 기본적으로 왼쪽부터 정렬을 시킨다.
//		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5)); // FlowLayout.LEFT, 5, 5 왼쪽정렬로 간격을 5로 설정한다.
		contentPane.setLayout(new BorderLayout(30, 20));	// BorderLayout을 통해서 상하좌우의 간격 값을 넣어준다
		
		
		
		contentPane.add(new JButton("OK"), BorderLayout.CENTER);	// BorderLayout을 통해서 버튼에 위치 값을 넣어준다

//		JButton btn = new JButton("OK");		// 위 버튼 코드를 정석으로 친 코드이며 버튼에 이벤트를 부여하기 위해서는 이 코드를 이용해야한다. 
//		contentPane.add(btn);
		
		contentPane.add(new JButton("Cancel"), BorderLayout.WEST);
		contentPane.add(new JButton("Ignore"), BorderLayout.EAST);
		contentPane.add(new JButton("sub"), BorderLayout.NORTH);
		contentPane.add(new JButton("mul"), BorderLayout.SOUTH);
//		contentPane.add(new JButton("Calculate"));
		
		
		setSize(500, 500);
		
		setVisible(true);
		}
		 public static void main(String[] args) {
		 
			 new ContentPaneEx();
		}

}

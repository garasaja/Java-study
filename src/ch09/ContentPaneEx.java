package ch09;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("ㅎㅇ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 윈도우 누르면 자동종료 명령어 
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("d"));
		contentPane.add(new JButton("s"));
		contentPane.add(new JButton("gdfgdf"));
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}

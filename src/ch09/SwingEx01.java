package ch09;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx01 extends JFrame{

	public SwingEx01() {
		Container contentPane = getContentPane(); // JFrame기본패널 접근
		contentPane.setLayout(new FlowLayout()); // 기본 패널은 BorderLayout(border의 기본값 center로 되있음) -> FowLayout으로 변경함
		contentPane.add(new JButton("첫번째 버튼")); // 버튼그리기
		setSize(300,300); //원하는 사이즈 조절
		setVisible(true); // painting하기
		setTitle("쇼곱하기 쇼는 쇼만들기");//제목
		
	}
	
	public static void main(String[] args) {
		new SwingEx01();
	}
}

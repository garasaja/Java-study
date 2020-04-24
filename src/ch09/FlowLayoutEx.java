package ch09;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{
	public FlowLayoutEx() {
		setTitle("zzz");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		c.add(new JButton("���ϱ�"));
		c.add(new JButton("����"));
		c.add(new JButton("���ϱ�"));
		c.add(new JButton("������"));
		c.add(new JButton("����ϱ�"));
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}

package ch14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventEx02 extends JFrame implements ActionListener{

	EventEx02 ex02;
	
	public EventEx02() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// �̺�Ʈ �й� ������ ����
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		
		btn.addActionListener(this);
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { // Ÿ�� eventex02�� �������ִ�.
		System.out.println("��ư Ŭ��");
		
	}
	
	public static void main(String[] args) {
		new EventEx02();

	}
}
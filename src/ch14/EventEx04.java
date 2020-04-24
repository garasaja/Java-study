package ch14;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventEx04 extends JFrame{

	private JLabel la;
	
	public EventEx04() {
		setTitle("���콺 �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		la = new JLabel("hello");
		Container c =getContentPane();
		c.addMouseListener(new MyMouseListener());
		c.setLayout(null);
		la.setSize(50,20); // �󺧱���ũ��
		la.setLocation(30,30); 
		c.add(la);
		setSize(250,250);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();//���콺 Ŭ�������� x��ǥ
			int y = e.getY();//���콺 Ŭ�������� y��ǥ
			la.setLocation(x,y); // �� ��ġ���� (������Ʈ)
		}
	
		
	}
	
	public static void main(String[] args) {
		new EventEx04();

	}

}

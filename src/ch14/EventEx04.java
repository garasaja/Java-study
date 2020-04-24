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
		setTitle("마우스 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		la = new JLabel("hello");
		Container c =getContentPane();
		c.addMouseListener(new MyMouseListener());
		c.setLayout(null);
		la.setSize(50,20); // 라벨글자크기
		la.setLocation(30,30); 
		c.add(la);
		setSize(250,250);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();//마우스 클릭햇을때 x좌표
			int y = e.getY();//마우스 클릭햇을때 y좌표
			la.setLocation(x,y); // 라벨 위치변경 (리페인트)
		}
	
		
	}
	
	public static void main(String[] args) {
		new EventEx04();

	}

}

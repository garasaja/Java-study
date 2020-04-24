package ch14;

import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventEx05 extends JFrame {

	private JLabel la;

	public EventEx05() {
		la = new JLabel("Hello");
		setTitle("MouseEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null);  // absolute 레이아웃
		la.setSize(50, 20);	// 라벨의 사이즈
		la.setLocation(30, 30);	// 라벨의 위치
		
		c.add(la);
		setSize(250, 250);
		setVisible(true); // paint()

	}

	class MyMouseListener extends MouseAdapter {
		
		// 마우스를 클릭하고 땠을 때
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();	// x좌표
			int y = e.getY();	// y좌표
			
			Point p = la.getLocation();
			double labelX = p.getX();
			double labelY = p.getY();

			double diff = y - labelY;
			
			double step = diff / 10;
			
			for (int i = 0; i < 10; i++) {
				la.setLocation((int)labelX, (int)(labelY + step));
				System.out.println("x, y : " + labelX + " " + (int)(labelY + step));
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				labelY += step;
				
				/// 미완성 상태임....
				
			}
			
			// la.setLocation(x, y); // 라벨 위치 변경 -> 내부적으로 repaint()도 호출됨
			
		}
	}

	public static void main(String[] args) {
		new EventEx05();

	}

}
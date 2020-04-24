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
		setTitle("MouseEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null);  // absolute ���̾ƿ�
		la.setSize(50, 20);	// ���� ������
		la.setLocation(30, 30);	// ���� ��ġ
		
		c.add(la);
		setSize(250, 250);
		setVisible(true); // paint()

	}

	class MyMouseListener extends MouseAdapter {
		
		// ���콺�� Ŭ���ϰ� ���� ��
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();	// x��ǥ
			int y = e.getY();	// y��ǥ
			
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
				
				/// �̿ϼ� ������....
				
			}
			
			// la.setLocation(x, y); // �� ��ġ ���� -> ���������� repaint()�� ȣ���
			
		}
	}

	public static void main(String[] args) {
		new EventEx05();

	}

}
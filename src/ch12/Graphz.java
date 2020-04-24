package ch12;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ch12.GraphicsDrawLineEx.MyPanel;

public class Graphz extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public Graphz() {
		setTitle("drawLine 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		Container c =getContentPane();
		c.setLayout(null);
		JLabel la = new JLabel("hello1");
		JLabel la2 = new JLabel("hello2");
		JLabel la3 = new JLabel("hello3");
		la.setSize(250,250);
		la.setLocation(15, 150);
		c.add(la);
		la2.setSize(250,250);
		la2.setLocation(200, 150);
		c.add(la2);
		la3.setSize(250,250);
		la3.setLocation(400, 150);
		c.add(la3);
		setSize(500,500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(0, 50, 50, 200);
			g.setColor(Color.GREEN);
			g.fillRect(200, 50, 50, 200);
			g.setColor(Color.BLUE);
			g.fillRect(400, 50, 50, 200);
			
		}
	}
	
	public static void main(String[] args) {
		new Graphz();
	}

}

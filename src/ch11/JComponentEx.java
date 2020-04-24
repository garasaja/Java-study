package ch11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JComponentEx extends JFrame {
	
	private JButton btn1,btn2,btn3;
	private JTextField txt1;
	
	public JComponentEx() {
		setTitle("JComponent 공통 메소드 예제");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		btn1 = new JButton("Magenta/Yellow Button");
		btn2 = new JButton("  Disabled Button ");
		btn3 = new JButton("getX(), getY()");
		txt1 = new JTextField();
		
		btn1.setBackground(Color.YELLOW);
		btn2.setForeground(Color.MAGENTA);
		btn3.setFont(new Font("Arial",Font.ITALIC,20));
		btn2.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//JButton b = (JButton)e.getSource(); // object를 리턴하기 때문에 다운 캐스팅
				btn3.setText("hi");
			}
		});
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(txt1);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JComponentEx();
	}
}

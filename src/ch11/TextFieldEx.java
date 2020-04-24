package ch11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame{
	
	private JTextField tf;
	private JTextArea ta;
	private ScrollPane sp;
	private Scrollbar sb;
	
	public TextFieldEx() {
		itit();
		setTitle("¤¾¤·");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		tf.setFont(new Font("Arial",Font.BOLD,30));
		tf.setPreferredSize(new Dimension(100,100));
		
		
		ta.setBackground(Color.ORANGE);
		//ta.setEnabled(false);
		ta.setForeground(Color.BLUE);
		ta.setFont(new Font("Arial",Font.BOLD,30));
		sp.add(ta);
		//sb.add(ta);
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					String value = tf.getText();
					ta.append(value + "\n");
					tf.setText("");
				}												
			}			
		});
		
		c.add(tf,BorderLayout.SOUTH);
		c.add(sp,BorderLayout.CENTER);
		setVisible(true);
	}
	
	private void itit() {
		tf = new JTextField("",20);
		ta = new JTextArea("",5,20);
		sp = new ScrollPane();
	}
	
	public static void main(String[] args) {
		new TextFieldEx();
	}
}

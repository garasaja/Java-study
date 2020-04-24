package ch14;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;

public class LabelEx extends JFrame{
	
	private JLabel textLabel1 , label, imageLabel;
	private ImageIcon beauty , normalIcon;
	private BorderLayout bl;
	private JList list;
	private JButton btn;
	
	public LabelEx() {
		setTitle("h1");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		textLabel1 = new JLabel("좋겠당ㅋㅋㅋㅋㅋ");
			
		beauty = new ImageIcon("img/beauty.jpg");
		imageLabel = new JLabel(beauty);
		
		normalIcon = new ImageIcon("img/normalIcon.gif");
		label = new JLabel("전화해봐", normalIcon,SwingConstants.CENTER);
		
		c.add(textLabel1,bl.NORTH);
		c.add(imageLabel,bl.CENTER);
		c.add(label,bl.SOUTH);
		btn = new JButton("클릭");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				beauty.setImage(normalIcon.getImage());
				repaint();
			}
		});
		
		list = new JList();
		getContentPane().add(list, BorderLayout.EAST);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new LabelEx();
	}
}

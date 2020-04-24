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
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 이벤트 분배 쓰레드 종료
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		
		btn.addActionListener(this);
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { // 타겟 eventex02가 가지고있다.
		System.out.println("버튼 클릭");
		
	}
	
	public static void main(String[] args) {
		new EventEx02();

	}
}
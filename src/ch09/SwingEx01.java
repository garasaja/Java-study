package ch09;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx01 extends JFrame{

	public SwingEx01() {
		Container contentPane = getContentPane(); // JFrame�⺻�г� ����
		contentPane.setLayout(new FlowLayout()); // �⺻ �г��� BorderLayout(border�� �⺻�� center�� ������) -> FowLayout���� ������
		contentPane.add(new JButton("ù��° ��ư")); // ��ư�׸���
		setSize(300,300); //���ϴ� ������ ����
		setVisible(true); // painting�ϱ�
		setTitle("����ϱ� ��� ����");//����
		
	}
	
	public static void main(String[] args) {
		new SwingEx01();
	}
}

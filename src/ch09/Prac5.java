package ch09;

import javax.swing.*;

import java.awt.*;
import java.io.*;

public class Prac5 extends JFrame {
	Prac5() {
		setTitle("Practice Problem V");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color X[] = { Color.RED, Color.YELLOW, Color.BLUE, Color.BLACK, Color.RED, Color.RED, Color.YELLOW, Color.BLUE,
				Color.BLACK, Color.RED, Color.YELLOW, Color.YELLOW, Color.BLUE, Color.GRAY, Color.GREEN, Color.RED };
		JLabel A[] = new JLabel[16];
		GridLayout grid = new GridLayout(4, 4);
		setLayout(grid);
		for (int i = 0; i < 16; i++) {
			A[i] = new JLabel(i + "");
			add(A[i]);

			A[i].setBackground(X[i]);
			A[i].setOpaque(true);
		}

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Prac5();
	}

}

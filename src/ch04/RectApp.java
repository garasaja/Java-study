package ch04;

import java.util.Scanner;

class Rectangle{
	private int width;
	private int height;
	public int getArea() {
		return width *height;
	}
	public Rectangle() {
		
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}

public class RectApp {
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("�ʺ�� ���̸� �Է��ϼ���.");
		r.setWidth(sc.nextInt());
		r.setHeight(sc.nextInt());
		System.out.println("�簢���� ������ : " + r.getArea() + "�Դϴ�.");
		

	}

}

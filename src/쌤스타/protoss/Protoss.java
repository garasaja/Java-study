package �ܽ�Ÿ.protoss;

import �ܽ�Ÿ.Behavior;

public abstract class Protoss implements Behavior{
	@Override
	public void move() {
		System.out.println("�̵�");
	}
	@Override
	public void repair() {
		System.out.println("���� ġ��");	
	}
	public static void upgrade() {
		Zealot.attack++;
		Dragoon.attack++;
		System.out.println("�����佺 ���׷��̵� �Ϸ�");
	}
}

package ch05;

//�߻�Ŭ������

abstract class Food1 {
	//abstract final String NAME;
	abstract void eat();
}

class ���1 extends Food1{
	final String NAME = "���";
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println(NAME+"������ ��ū�ϳ�");
	}
}

class �Ұ��1 extends Food1 {
	final String NAME = "�Ұ��";

	@Override
	void eat() {
		System.out.println(NAME+" ��� ����?");
		
	}
	
}

class ����1 extends Food1 {
	final String NAME = "����";
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println(NAME+"�� LA��!!");
	}
}

public class FoodEx01 {
	
	static void start(Food1 f) {
		f.eat();
	}
	
	public static void main(String[] args) {
		start(new ���1());
		
		
		/*Food n = new ���();
		Food b = new �Ұ��();
		Food la = new ����();
		n.eat();
		b.eat();
		la.eat();*/
	}

}

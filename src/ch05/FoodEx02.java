package ch05;

abstract class Food {
	abstract void standby();
	void eat() {
		System.out.println("������ �Խ��ϴ�.");
	}
	abstract void cook();
	
	void auto() {
		standby();
		cook();
		eat();
	}
}
class ��� extends Food{

	@Override
	void cook() {
		// TODO Auto-generated method stub
		System.out.println("���� ���δ�.");
	}

	@Override
	void standby() {
		// TODO Auto-generated method stub
		System.out.println("���� ���� �غ��մϴ�.");
		
	}
	
}
class ���� extends Food{

	@Override
	void cook() {
		// TODO Auto-generated method stub
		System.out.println("���ǿ� ���´�.");
	}

	@Override
	void standby() {
		// TODO Auto-generated method stub
		System.out.println("����� ������ �غ��մϴ�.");
	}
	
}
public class FoodEx02 {
	static void start(Food f) {
		f.auto();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start(new ���());
		System.out.println("------------------------------------------------");
		start(new ����());
	}

}

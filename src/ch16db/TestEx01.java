package ch16db;

class MyConnection {
	
}

class MyJDBC extends MyConnection{
	static MyConnection conn;
	
	public MyJDBC() {
		System.out.println("������ ȣ��");
	}
	static { //���� �ʱ�ȭ�Ҷ� �Լ��� ���� ���ϰ� �ٷ� ȣ���Ѵ�. new�Ҷ� static ���� ȣ��
		conn = new MyJDBC();
	}
}

public class TestEx01 {
	public static void main(String[] args) {
		//MyJDBC  mj = new MyJDBC();
		try {
			Class.forName("ch16db.MyJDBC");
			MyConnection conn = MyJDBC.conn;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

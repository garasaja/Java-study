package ch16db;

class MyConnection {
	
}

class MyJDBC extends MyConnection{
	static MyConnection conn;
	
	public MyJDBC() {
		System.out.println("생성자 호출");
	}
	static { //보통 초기화할때 함수명 생성 안하고 바로 호출한다. new할때 static 내부 호출
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

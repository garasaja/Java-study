package coffeeshop.test;

class ����� {
	
	public static ����� instance = new �����();
	public static ����� getInstance() {
		return instance;
	}
	
	private �����() {
	
	}
}

public class SingleTonEx01 {

	public static void main(String[] args) {
		����� d1 = �����.getInstance();
		����� d2= �����.getInstance();
		����� d3 = �����.getInstance();
		����� d4 = �����.getInstance();

	}

}

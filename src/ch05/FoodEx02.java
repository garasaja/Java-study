package ch05;

abstract class Food {
	abstract void standby();
	void eat() {
		System.out.println("음식을 먹습니다.");
	}
	abstract void cook();
	
	void auto() {
		standby();
		cook();
		eat();
	}
}
class 라면 extends Food{

	@Override
	void cook() {
		// TODO Auto-generated method stub
		System.out.println("냄비에 끓인다.");
	}

	@Override
	void standby() {
		// TODO Auto-generated method stub
		System.out.println("라면과 냄비를 준비합니다.");
		
	}
	
}
class 삼겹살 extends Food{

	@Override
	void cook() {
		// TODO Auto-generated method stub
		System.out.println("불판에 굽는다.");
	}

	@Override
	void standby() {
		// TODO Auto-generated method stub
		System.out.println("삼겹살과 불판을 준비합니다.");
	}
	
}
public class FoodEx02 {
	static void start(Food f) {
		f.auto();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start(new 라면());
		System.out.println("------------------------------------------------");
		start(new 삼겹살());
	}

}

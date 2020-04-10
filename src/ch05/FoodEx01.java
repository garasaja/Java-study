package ch05;

//추상클래스는

abstract class Food1 {
	//abstract final String NAME;
	abstract void eat();
}

class 라면1 extends Food1{
	final String NAME = "라면";
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println(NAME+"국물이 얼큰하네");
	}
}

class 불고기1 extends Food1 {
	final String NAME = "불고기";

	@Override
	void eat() {
		System.out.println(NAME+" 노맛 ㅇㅈ?");
		
	}
	
}

class 갈비1 extends Food1 {
	final String NAME = "갈비";
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println(NAME+"는 LA지!!");
	}
}

public class FoodEx01 {
	
	static void start(Food1 f) {
		f.eat();
	}
	
	public static void main(String[] args) {
		start(new 라면1());
		
		
		/*Food n = new 라면();
		Food b = new 불고기();
		Food la = new 갈비();
		n.eat();
		b.eat();
		la.eat();*/
	}

}

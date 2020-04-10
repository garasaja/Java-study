package animal;

interface Animal {
	void run();
	void sound();
}



class Dog implements Animal{

	@Override
	public void run() {
		System.out.println("강아지 달린다.");
		
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
		
	}

}

class Bird implements Animal{

	@Override
	public void run() {
		System.out.println("새는 달린다.");
		
	}

	@Override
	public void sound() {
		System.out.println("짹짹");
		
	}
	public void fly() {
		System.out.println("새는 난다.");
	}
}

public class AnimalEx02 {
	static void start(Animal a) {
		a.run();
		a.sound();
		if(a instanceof Bird) {
			((Bird)a).fly();// 다운캐스팅
		}
	}
	
	public static void main(String[] args) {
		start(new Dog());
		start(new Bird());
		/*Animal d =new Dog();
		d.run();
		d.sound();
		
		Animal b =new Bird();
		b.run();
		b.sound();
		
		if(b instanceof Bird) {
			((Bird)b).fly();// 다운캐스팅
		}*/
		
		
	}
}

package ch05;

class A {
	void run() {
		System.out.println("A �޸���.");
	}
	
}
class B extends A {
	@Override
	void run() {
		System.out.println("B �޸���");
	}
}
class C extends B {
	String name = "��浿";
	@Override
	void run() {
	System.out.println(name + " C �޸���.");
	
	}
}

public class OverrideEx01 {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		B b1 = new C();
		A a1 = new B();
		A a2 = new C();
		
		a.run();
		a.run();
		a.run();
		b1.run();
		a1.run();
		a2.run();
	}

}

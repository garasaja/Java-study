package ch05;

abstract class Animal {
	abstract String getName();
	
	/*String NAME;

	public String getName() {
		return NAME;
	}*/
}

class Dog extends Animal {
	final static String NAME = "������";

	public String getName() {
		return NAME;
	}	
}

class Cat extends Animal {
	final static String NAME = "�����";

	public String getName() {
		return NAME;
	}		
}

class Bird extends Animal {
	final static String NAME = "��";

	public String getName() {
		return NAME;
	}		
}

class Mouse extends Animal {
	final static String NAME = "��";
	
	@Override
	String getName() {
		// TODO Auto-generated method stub
		return NAME;
	}
	
	
}

public class AnimalEx01 {

	/*static void attack(Dog u1 , Cat u2) {
		System.out.println(u2.NAME + "�� " + u1.NAME + "���� ���� ���ϰ� �ֽ��ϴ�.");
	}
	static void attack(Dog u1 , Bird u2) {
		System.out.println(u2.NAME + "�� " + u1.NAME + "���� ���� ���ϰ� �ֽ��ϴ�.");
	}
	static void attack(Cat u1 , Bird u2) {
		System.out.println(u2.NAME + "�� " + u1.NAME + "���� ���� ���ϰ� �ֽ��ϴ�.");
	}*/
	
	  static void attack(Animal u1 , Animal u2) { 
		  System.out.println(u2.getName() + "�� "+ u1.getName() + "���� ���� ���ϰ� �ֽ��ϴ�."); }
	 

	public static void main(String[] args) {

		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Bird b1 = new Bird();
		Animal d = new Dog();
		Animal c = new Cat();
		Animal b = new Bird();
		Mouse m1 = new Mouse();
						
		System.out.println("-----------------------------------------------");
		System.out.println(d1.NAME + " ź��");
		System.out.println(c1.NAME + " ź��");
		System.out.println(b1.NAME + " ź��");
		System.out.println("-----------------------------------------------");
		attack(d,c);
		attack(d1,b1);
		attack(c1,m1);
		System.out.println("-----------------------------------------------");
		
		
	}
}

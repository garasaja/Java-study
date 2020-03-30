package stars;

abstract class StarCraft {
	//String NAME;
	//int hp;
	//int attack;

	abstract String getNAME();	
	abstract int getHp();
	abstract void setHp(int hp);
	abstract int getAttack();
	abstract void setAttack(int attack);
}

//����
class Zealot extends StarCraft {
	private final String NAME;
	private int hp;
	static int attack = 10;

	public Zealot(String name) {

		this.NAME = name;
		this.hp = 100;
	}

	@Override
	String getNAME() {
		// TODO Auto-generated method stub
		return NAME;
	}

	@Override
	int getHp() {
		// TODO Auto-generated method stub
		return hp;
	}

	@Override
	void setHp(int hp) {
		// TODO Auto-generated method stub
		this.hp = hp;
	}

	@Override
	int getAttack() {
		// TODO Auto-generated method stub
		return attack;
	}

	@Override
	void setAttack(int attack) {
		this.attack = attack;
		// TODO Auto-generated method stub
		
	}
	
	
}

//��ũ���÷�
class DarkTempler extends StarCraft {
	private final String NAME;
	private int hp;
	static int attack = 50;

	public DarkTempler(String name) {

		this.NAME = name;
		this.hp = 100;
	}

	@Override
	String getNAME() {
		// TODO Auto-generated method stub
		return NAME;
	}

	@Override
	int getHp() {
		// TODO Auto-generated method stub
		return hp;
	}

	@Override
	void setHp(int hp) {
		// TODO Auto-generated method stub
		this.hp = hp;
	}

	@Override
	int getAttack() {
		// TODO Auto-generated method stub
		return attack;
	}

	@Override
	void setAttack(int attack) {
		this.attack = attack;
		// TODO Auto-generated method stub
		
	}
	


	

}

//����
class River extends StarCraft {
	private final String NAME;
	private int hp;
	static int attack = 70;

	public River(String name) {
		//super();
		this.NAME = name;
		this.hp = 100;
	}

	@Override
	String getNAME() {
		// TODO Auto-generated method stub
		return NAME;
	}

	@Override
	int getHp() {
		// TODO Auto-generated method stub
		return hp;
	}

	@Override
	void setHp(int hp) {
		// TODO Auto-generated method stub
		this.hp = hp;
	}

	@Override
	int getAttack() {
		// TODO Auto-generated method stub
		return attack;
	}

	@Override
	void setAttack(int attack) {
		this.attack = attack;
		// TODO Auto-generated method stub
		
	}

	
}

//���
class Dragoon extends StarCraft {
	private final String NAME;
	private int hp;
	static int attack = 15;

	public Dragoon(String name) {
		//super();
		this.NAME = name;
		this.hp = 100;
	}

	@Override
	String getNAME() {
		// TODO Auto-generated method stub
		return NAME;
	}

	@Override
	int getHp() {
		// TODO Auto-generated method stub
		return hp;
	}

	@Override
	void setHp(int hp) {
		// TODO Auto-generated method stub
		this.hp = hp;
	}

	@Override
	int getAttack() {
		// TODO Auto-generated method stub
		return attack;
	}

	@Override
	void setAttack(int attack) {
		this.attack = attack;
		// TODO Auto-generated method stub
		
	}
	
	
}

public class GameStart {

	/*
	 * static void attack(Zealot u1,Zealot u2) { u2.hp = u2.hp-u1.attack;
	 * System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�."); System.out.println(u2.NAME +
	 * "�� ü���� " + u2.hp + "�Դϴ�."); } static void attack(Zealot u1,Dragoon u2) {
	 * u2.hp = u2.hp-u1.attack; System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
	 * System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�."); } static void
	 * attack(Zealot u1,DarkTempler u2) { u2.hp = u2.hp-u1.attack;
	 * System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�."); System.out.println(u2.NAME +
	 * "�� ü���� " + u2.hp + "�Դϴ�."); } static void attack(Zealot u1,River u2) { u2.hp
	 * = u2.hp-u1.attack; System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
	 * System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�."); } static void
	 * attack(Dragoon u1,Zealot u2) { u2.hp = u2.hp-u1.attack;
	 * System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�."); System.out.println(u2.NAME +
	 * "�� ü���� " + u2.hp + "�Դϴ�."); } static void attack(Dragoon u1,Dragoon u2) {
	 * u2.hp = u2.hp-u1.attack; System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
	 * System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�."); } static void
	 * attack(Dragoon u1,DarkTempler u2) { u2.hp = u2.hp-u1.attack;
	 * System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�."); System.out.println(u2.NAME +
	 * "�� ü���� " + u2.hp + "�Դϴ�."); } static void attack(Dragoon u1,River u2) { u2.hp
	 * = u2.hp-u1.attack; System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
	 * System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�."); } static void
	 * attack(River u1,Zealot u2) { u2.hp = u2.hp-u1.attack;
	 * System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�."); System.out.println(u2.NAME +
	 * "�� ü���� " + u2.hp + "�Դϴ�."); } static void attack(River u1,Dragoon u2) { u2.hp
	 * = u2.hp-u1.attack; System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
	 * System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�."); } static void
	 * attack(River u1,DarkTempler u2) { u2.hp = u2.hp-u1.attack;
	 * System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�."); System.out.println(u2.NAME +
	 * "�� ü���� " + u2.hp + "�Դϴ�."); } static void attack(River u1,River u2) { u2.hp =
	 * u2.hp-u1.attack; System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
	 * System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�."); } static void
	 * attack(DarkTempler u1,Zealot u2) { u2.hp = u2.hp-u1.attack;
	 * System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�."); System.out.println(u2.NAME +
	 * "�� ü���� " + u2.hp + "�Դϴ�."); } static void attack(DarkTempler u1,Dragoon u2) {
	 * u2.hp = u2.hp-u1.attack; System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
	 * System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�."); } static void
	 * attack(DarkTempler u1,DarkTempler u2) { u2.hp = u2.hp-u1.attack;
	 * System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�."); System.out.println(u2.NAME +
	 * "�� ü���� " + u2.hp + "�Դϴ�."); } static void attack(DarkTempler u1,River u2) {
	 * u2.hp = u2.hp-u1.attack; System.out.println(u2.NAME + "�� ���ݴ��ϰ� �ֽ��ϴ�.");
	 * System.out.println(u2.NAME + "�� ü���� " + u2.hp + "�Դϴ�."); }
	 */
	static void attack(StarCraft u1, StarCraft u2) {
		u2.setHp(u2.getHp()-u1.getAttack()); 
		//u2.hp = u2.getHp() - u1.getAttack();
		System.out.println(u2.getNAME() + "�� "+u1.getNAME()+"�� ���� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.getNAME() + "�� ü���� " + u2.getHp() + "�Դϴ�.");
	}

	public static void main(String[] args) {
		// ���ݷ� ���׷��̵� �ϱ�
		//Zealot.attack++;
		Zealot z1 = new Zealot("1������");
		//System.out.println(Zealot.attack);
		Zealot z2 = new Zealot("2������");
		//System.out.println(Zealot.attack);
		Dragoon d1 = new Dragoon("1�����");
		//System.out.println(Dragoon.attack);
		Dragoon d2 = new Dragoon("2�����");
		//System.out.println(Dragoon.attack);
		Zealot dk1 = new Zealot("1����ũ���÷�");
		//System.out.println(Zealot.attack);
		Zealot dk2 = new Zealot("2����ũ���÷�");
		//System.out.println(Zealot.attack);
		Zealot r1 = new Zealot("1������");
		//System.out.println(Zealot.attack);
		Zealot r2 = new Zealot("2������");
		//System.out.println(Zealot.attack);

		// �����ϱ�
		attack(z1, z1);
		System.out.println("--------------------------------------");
		attack(z1, d1);
		System.out.println("--------------------------------------");
		attack(z1, dk1);
		System.out.println("--------------------------------------");
		attack(z1, r1);
		System.out.println("--------------------------------------");
		attack(z1, z2);
		System.out.println("--------------------------------------");
		attack(z1, d2);
		System.out.println("--------------------------------------");
		attack(z1, dk2);
		System.out.println("--------------------------------------");
		attack(z1, r2);
		System.out.println("--------------------------------------");
		attack(d1, z1);
		System.out.println("--------------------------------------");
		attack(d1, d2);
		System.out.println("--------------------------------------");
		attack(d1, d2);
		System.out.println("--------------------------------------");
		attack(d1, d2);
		System.out.println("--------------------------------------");
		attack(d1, d2);
		System.out.println("--------------------------------------");
		attack(d1, d2);
		System.out.println("--------------------------------------");
		attack(d1, d2);
		System.out.println("--------------------------------------");
		attack(d1, d2);
		System.out.println("--------------------------------------");
		attack(d1, d2);
		System.out.println("--------------------------------------");
		attack(d1, d2);
		System.out.println("--------------------------------------");
		attack(d1, d2);
		System.out.println("--------------------------------------");
		attack(z1, z2);
		System.out.println("--------------------------------------");
		attack(z1, z2);
		System.out.println("--------------------------------------");
		attack(z1, z2);
		System.out.println("--------------------------------------");
		attack(z1, z2);
		System.out.println("--------------------------------------");
	}

}

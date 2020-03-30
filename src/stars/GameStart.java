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

//질럿
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

//다크템플러
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

//리버
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

//드라군
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
	 * System.out.println(u2.NAME + "이 공격당하고 있습니다."); System.out.println(u2.NAME +
	 * "의 체력은 " + u2.hp + "입니다."); } static void attack(Zealot u1,Dragoon u2) {
	 * u2.hp = u2.hp-u1.attack; System.out.println(u2.NAME + "이 공격당하고 있습니다.");
	 * System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다."); } static void
	 * attack(Zealot u1,DarkTempler u2) { u2.hp = u2.hp-u1.attack;
	 * System.out.println(u2.NAME + "이 공격당하고 있습니다."); System.out.println(u2.NAME +
	 * "의 체력은 " + u2.hp + "입니다."); } static void attack(Zealot u1,River u2) { u2.hp
	 * = u2.hp-u1.attack; System.out.println(u2.NAME + "이 공격당하고 있습니다.");
	 * System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다."); } static void
	 * attack(Dragoon u1,Zealot u2) { u2.hp = u2.hp-u1.attack;
	 * System.out.println(u2.NAME + "이 공격당하고 있습니다."); System.out.println(u2.NAME +
	 * "의 체력은 " + u2.hp + "입니다."); } static void attack(Dragoon u1,Dragoon u2) {
	 * u2.hp = u2.hp-u1.attack; System.out.println(u2.NAME + "이 공격당하고 있습니다.");
	 * System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다."); } static void
	 * attack(Dragoon u1,DarkTempler u2) { u2.hp = u2.hp-u1.attack;
	 * System.out.println(u2.NAME + "이 공격당하고 있습니다."); System.out.println(u2.NAME +
	 * "의 체력은 " + u2.hp + "입니다."); } static void attack(Dragoon u1,River u2) { u2.hp
	 * = u2.hp-u1.attack; System.out.println(u2.NAME + "이 공격당하고 있습니다.");
	 * System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다."); } static void
	 * attack(River u1,Zealot u2) { u2.hp = u2.hp-u1.attack;
	 * System.out.println(u2.NAME + "이 공격당하고 있습니다."); System.out.println(u2.NAME +
	 * "의 체력은 " + u2.hp + "입니다."); } static void attack(River u1,Dragoon u2) { u2.hp
	 * = u2.hp-u1.attack; System.out.println(u2.NAME + "이 공격당하고 있습니다.");
	 * System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다."); } static void
	 * attack(River u1,DarkTempler u2) { u2.hp = u2.hp-u1.attack;
	 * System.out.println(u2.NAME + "이 공격당하고 있습니다."); System.out.println(u2.NAME +
	 * "의 체력은 " + u2.hp + "입니다."); } static void attack(River u1,River u2) { u2.hp =
	 * u2.hp-u1.attack; System.out.println(u2.NAME + "이 공격당하고 있습니다.");
	 * System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다."); } static void
	 * attack(DarkTempler u1,Zealot u2) { u2.hp = u2.hp-u1.attack;
	 * System.out.println(u2.NAME + "이 공격당하고 있습니다."); System.out.println(u2.NAME +
	 * "의 체력은 " + u2.hp + "입니다."); } static void attack(DarkTempler u1,Dragoon u2) {
	 * u2.hp = u2.hp-u1.attack; System.out.println(u2.NAME + "이 공격당하고 있습니다.");
	 * System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다."); } static void
	 * attack(DarkTempler u1,DarkTempler u2) { u2.hp = u2.hp-u1.attack;
	 * System.out.println(u2.NAME + "이 공격당하고 있습니다."); System.out.println(u2.NAME +
	 * "의 체력은 " + u2.hp + "입니다."); } static void attack(DarkTempler u1,River u2) {
	 * u2.hp = u2.hp-u1.attack; System.out.println(u2.NAME + "이 공격당하고 있습니다.");
	 * System.out.println(u2.NAME + "의 체력은 " + u2.hp + "입니다."); }
	 */
	static void attack(StarCraft u1, StarCraft u2) {
		u2.setHp(u2.getHp()-u1.getAttack()); 
		//u2.hp = u2.getHp() - u1.getAttack();
		System.out.println(u2.getNAME() + "이 "+u1.getNAME()+"에 의해 공격당하고 있습니다.");
		System.out.println(u2.getNAME() + "의 체력은 " + u2.getHp() + "입니다.");
	}

	public static void main(String[] args) {
		// 공격력 업그레이드 하기
		//Zealot.attack++;
		Zealot z1 = new Zealot("1번질럿");
		//System.out.println(Zealot.attack);
		Zealot z2 = new Zealot("2번질럿");
		//System.out.println(Zealot.attack);
		Dragoon d1 = new Dragoon("1번드라군");
		//System.out.println(Dragoon.attack);
		Dragoon d2 = new Dragoon("2번드라군");
		//System.out.println(Dragoon.attack);
		Zealot dk1 = new Zealot("1번다크템플러");
		//System.out.println(Zealot.attack);
		Zealot dk2 = new Zealot("2번다크템플러");
		//System.out.println(Zealot.attack);
		Zealot r1 = new Zealot("1번리버");
		//System.out.println(Zealot.attack);
		Zealot r2 = new Zealot("2번리버");
		//System.out.println(Zealot.attack);

		// 공격하기
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

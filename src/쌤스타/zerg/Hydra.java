package 쌤스타.zerg;

import 쌤스타.Behavior;

public class Hydra extends Zerg{ 
	private String name;
	private int hp;
	public static int attack = 20;
	
	public Hydra(String name) {
		this.name = name;
		this.hp = 100;
	}

	@Override
	public void attack(Behavior unit) {
		System.out.println("원거리 독침 공격");
	}	
}

package ½Ü½ºÅ¸.terran;

import ½Ü½ºÅ¸.Behavior;

public class Marine extends Terran{ 
	private String name;
	private int hp;
	public static int attack = 5;
	
	public Marine(String name) {
		this.name = name;
		this.hp = 100;
	}

	@Override
	public void attack(Behavior unit) {
		System.out.println("¿ø°Å¸® ±â°üÃÑ °ø°Ý");
	}	
}

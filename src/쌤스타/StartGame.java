package 쌤스타;

import 쌤스타.protoss.Dragoon;
import 쌤스타.protoss.Protoss;
import 쌤스타.protoss.Zealot;
import 쌤스타.terran.Tank;
import 쌤스타.zerg.Hydra;

public class StartGame {
	
	public static void move(Behavior b) {
		b.move();
	}
	
	public static void repair(Behavior b) {
		b.repair();
	}
	
	public static void attack(Behavior b1, Behavior b2) {
		b1.attack(b2);
	}
	
	public static void main(String[] args) {
		Protoss.upgrade();
		Zealot z1 = new Zealot("占쏙옙占쏙옙1");
		Dragoon d1 = new Dragoon("占쏙옙占�1");
		move(z1);
		repair(z1);
		attack(z1, d1);
		
		Hydra h1 = new Hydra("占쏙옙占쏙옙占�1");
		Tank t1 = new Tank("占쏙옙크1");
		
		repair(h1);
		move(t1);
		repair(t1);
		attack(h1, t1);
	}
}

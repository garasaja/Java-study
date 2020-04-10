package ½Ü½ºÅ¸.terran;

import ½Ü½ºÅ¸.Behavior;

public abstract class Terran implements Behavior{
	@Override
	public void move() {
		System.out.println("ÀÌµ¿");
	}
	@Override
	public void repair() {
		System.out.println("SCV Ä¡·á");	
	}
	public static void upgrade() {
		Marine.attack++;
		Tank.attack++;
	}
}

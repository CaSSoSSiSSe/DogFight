package jpu2016.dogfight.model;

import java.awt.Dimension;

public class Missile {
	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGHT = 10;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";

	public Missile(Direction direction, Dimension dimension){
		return;
	}

	public static int getWIDTH() {
		return WIDTH;
	}

	public static int getHEIGHT() {
		return HEIGHT;
	}

	public void move(){
		return;
	}

	public boolean Weapon(){
		final boolean Weapon;
		double RNG;
		RNG = Math.random() ;
		if (RNG <= 0.5){
			Weapon = true;
		}
		else{
			Weapon = false;
		}
		return Weapon;
	}




}

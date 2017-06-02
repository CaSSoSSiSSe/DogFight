package jpu2016.dogfight.model;

import java.awt.Dimension;

public class Missile extends Mobile{
	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGHT = 10;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";

	public Missile(final Direction direction, final Position position){
		super(direction, position, new Dimension(WIDTH,HEIGHT), SPEED, IMAGE);

	}

	public static int getWidthWithADirection(Direction direction) {
		return WIDTH;
	}

	public static int getHeightWithADirection(Direction direction) {
		return HEIGHT;
	}

	@Override
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

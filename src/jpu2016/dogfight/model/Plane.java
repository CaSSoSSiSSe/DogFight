package jpu2016.dogfight.model;

import java.awt.Dimension;

public class Plane extends Mobile{
	private static int SPEED = 2;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	private int player;


	public Plane(final Direction direction, final Position position, final String image){
		super(direction, position, new Dimension(WIDTH,HEIGHT), SPEED, image);
	}

	@Override
	public boolean isPlayer(final int player){
		return true;
	}

	@Override
	public boolean hit(){
		return true;
	}



}

package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Mobile implements IMobile{

	private final Position position;
	private final Dimension dimension;
	private final String imageName;
	private Image[] images;

	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){
		this.setDirection(direction);
		this.position = position;
		this.dimension = dimension;
		this.getSpeed();
		this.imageName = image;
	}

	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub

	}

	@Override
	public Position getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub

	}

	public IDogfightModel getDogfightModel(){
		return null;
	}

	@Override
	public boolean hit() {
		this.getDogfightModel().removeMobile(this);
		return true;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}

	public Color getColor(){
		return null;
	}

	private void moveUp(){
		this.getPosition().setY(this.getPosition().getY() + this.getSpeed());
	}

	private void moveRight(){
		this.getPosition().setX(this.getPosition().getX() + this.getSpeed());
	}

	private void moveLeft(){
		this.getPosition().setX(this.getPosition().getX() - this.getSpeed());
	}

	private void moveDown(){
		this.getPosition().setY(this.getPosition().getY() - this.getSpeed());
	}

	public void buildAllImages()throws IOException{
		this.images = new Image[4];
		this.images[Direction.UP.ordinal()] = ImageIO.read(new File("images/" + this.imageName + "_UP.png"));
		this.images[Direction.DOWN.ordinal()] = ImageIO.read(new File("image/" + this.imageName + "_DOWN.png"));
		this.images[Direction.LEFT.ordinal()] = ImageIO.read(new File("image/" + this.imageName + "_LEFT.png"));
		this.images[Direction.RIGHT.ordinal()] = ImageIO.read(new File("image/" + this.imageName + "_RIGHT.png"));
	}
}

package jpu2016.dogfight.model;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel{

	public DogfightModel(){
		return ;
	}

	@Override
	public IArea getArea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buildArea(final Dimension dimension) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addMobile(final IMobile Mobile) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeMobile(final IMobile Mobile) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMobile getMobileByPlayer(final int Player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMobilesHavesMoved() {
		// TODO Auto-generated method stub
	}
}

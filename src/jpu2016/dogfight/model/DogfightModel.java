package jpu2016.dogfight.model;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel{

	private Sky sky;
	private final ArrayList<IMobile> mobiles;

	public DogfightModel(){
		this.mobiles = new ArrayList<IMobile>();
	}

	@Override
	public IArea getArea() {
		return this.sky;
	}

	@Override
	public void buildArea(final Dimension dimension) {
		this.sky = new Sky(dimension);
	}

	@Override
	public void addMobile(final IMobile Mobile) {
		this.getMobiles().add(Mobile);
	}

	@Override
	public void removeMobile(final IMobile Mobile) {
		this.getMobiles().remove(this.mobiles);
	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMobile getMobileByPlayer(final int Player) {
		for(final IMobile mobile : this.mobiles){
			if(mobile.isPlayer(Player)){
				return mobile;
			}
		}
		return null;
	}

	@Override
	public void setMobilesHavesMoved() {
		this.setChanged();
		this.notifyObservers();
	}
}

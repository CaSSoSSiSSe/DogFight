package jpu2016.dogfight.controller;

import dogfight.view.IViewSystem;
import jpu2016.dogfight.model.Direction;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;

public class DogFightController implements IOrderPerformer {

	private static int TIME_SLEEP = 30;
	private final IDogfightModel doghtfightModel;
	private IViewSystem viewSystem;


	public DogFightController(final IDogfightModel doghtfightModel){
		this.doghtfightModel = doghtfightModel;
	}

	@Override
	public void orderPerform(final UserOrder userOrder) {	// Ici donne les ordres pour diriger l'avion après avoir récupérer les touches dans EventPerformer
		Direction direction = null;

		if(userOrder != null){
			final IMobile plane = this.doghtfightModel.getMobileByPlayer(userOrder.getPlayer());
			if(plane != null){
				switch(userOrder.getOrder()) {
				case UP :
					direction = Direction.UP;
					break;
				case DOWN :
					direction = Direction.DOWN;
					break;
				case RIGHT :
					direction = Direction.RIGHT;
					break;
				case LEFT :
					direction = Direction.LEFT;
					break;
				case SHOOT :
					this.launchMissile(userOrder.getPlayer());
					break;
				case NOP :
				default :
					direction = this.doghtfightModel.getMobileByPlayer(userOrder.getPlayer()).getDirection();
					break;
				}
				plane.setDIrection(direction);
			}
		}
	}

	public void setViewSystem(final IViewSystem viewSystem){

	}

	private void launchMissile(final int player){

	}

	private void gameLoop(){

	}

	private boolean isWeaponOnMobile(final IMobile mobile, final IMobile weapon) {
		if (weapon.getPosition().getX() / weapon.getWidth() >= mobile.getPosition().getX() / weapon.getWidth() && weapon.getPosition().getX() / weapon.getWidth() <= (mobile.getPosition().getX() + mobile.getWidth()) / weapon.getWidth()) {
			if (weapon.getPosition().getY() / weapon.getHeight() >= mobile.getPosition().getY() / weapon.getHeight() && weapon.getPosition().getY() / weapon.getHeight() <= (mobile.getPosition().getY() + mobile.getHeight()) / weapon.getHeight()) {
				return true;
			}
		}
		return false;
	}

	public void manageCollision(final IMobile mobile, final IMobile weapon){
		if(this.isWeaponOnMobile(mobile, weapon) == true){

		}
		else {

		}
	}

	public void play(){
		this.gameLoop();
		this.viewSystem.displayMessage("Game Over!");
		this.viewSystem.closeAll();

	}


}

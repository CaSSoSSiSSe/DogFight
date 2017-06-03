package jpu2016.dogfight.controller;

import dogfight.view.IViewSystem;
import jpu2016.dogfight.model.Direction;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.dogfight.model.Missile;
import jpu2016.dogfight.model.Position;

// TODO: Auto-generated Javadoc
/**
 * The Class DogFightController.
 */
public class DogFightController implements IOrderPerformer {

	/** The time sleep. */
	private static int TIME_SLEEP = 30;

	/** The doghtfight model. */
	private final IDogfightModel doghtfightModel;

	/** The view system. */
	private IViewSystem viewSystem;


	/**
	 * Instantiates a new dog fight controller.
	 *
	 * @param doghtfightModel the doghtfight model
	 */
	public DogFightController(final IDogfightModel doghtfightModel){
		this.doghtfightModel = doghtfightModel;
	}

	/* (non-Javadoc)
	 * @see jpu2016.dogfight.controller.IOrderPerformer#orderPerform(jpu2016.dogfight.controller.UserOrder)
	 */
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

	/**
	 * Sets the view system.
	 *
	 * @param viewSystem the new view system
	 */
	public void setViewSystem(final IViewSystem viewSystem){
		this.viewSystem = viewSystem;
	}

	/**
	 * Launch missile.
	 *
	 * @param player the player
	 */
	private void launchMissile(final int player){
		final IMobile plane = this.doghtfightModel.getMobileByPlayer(player);
		if(plane != null){
			// Voir pour mon new car arg player player ou 0, 0.
			final Position position = new Position(plane.getPosition().getX() + (plane.getWidth() - Missile.getWidthWithADirection(plane.getDirection() )) /2, plane.getPosition().getY() + (plane.getHeight() - Missile.getHeightWithADirection(plane.getDirection())) /2, 0, 0);
			switch(plane.getDirection()) {
			case UP :
				position.setY(position.getY() - plane.getHeight() - plane.getSpeed());
				break;
			case DOWN :
				position.setY(position.getY() + plane.getHeight() + plane.getSpeed());
				break;
			case RIGHT :
				position.setX(position.getX() + plane.getWidth() + plane.getSpeed());
				break;
			case LEFT :
				position.setX(position.getX() - plane.getWidth() - plane.getSpeed());
				break;
			default :
				break;
			}
		}
	}

	/**
	 * Game loop.
	 */
	private void gameLoop(){

	}

	/**
	 * Checks if is weapon on mobile.
	 *
	 * @param mobile the mobile
	 * @param weapon the weapon
	 * @return true, if is weapon on mobile
	 */
	private boolean isWeaponOnMobile(final IMobile mobile, final IMobile weapon) {
		if (weapon.getPosition().getX() / weapon.getWidth() >= mobile.getPosition().getX() / weapon.getWidth() && weapon.getPosition().getX() / weapon.getWidth() <= (mobile.getPosition().getX() + mobile.getWidth()) / weapon.getWidth()) {
			if (weapon.getPosition().getY() / weapon.getHeight() >= mobile.getPosition().getY() / weapon.getHeight() && weapon.getPosition().getY() / weapon.getHeight() <= (mobile.getPosition().getY() + mobile.getHeight()) / weapon.getHeight()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Manage collision.
	 *
	 * @param mobile the mobile
	 * @param weapon the weapon
	 */
	public void manageCollision(final IMobile mobile, final IMobile weapon){
		if(this.isWeaponOnMobile(mobile, weapon) == true){

		}
		else {

		}
	}

	/**
	 * Play.
	 */
	public void play(){
		this.gameLoop();
		this.viewSystem.displayMessage("Game Over!");
		this.viewSystem.closeAll();

	}


}


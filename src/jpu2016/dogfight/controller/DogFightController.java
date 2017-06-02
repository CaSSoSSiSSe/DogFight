package jpu2016.dogfight.controller;

public class DogFightController implements IOrderPerformer {

	private static int TIME_SLEEP = 30;
	private final IDogfightModel doghtfightModel;


	public DogFightController(final IDogfightModel doghtfightModel){
		this.doghtfightModel = doghtfightModel;
	}

	@Override
	public void orderPerform(final UserOrder userOrder) {

	}

	public void play(){

	}

	public void setViewSystem(final IViewSystem viewSystem){

	}

	private void launchMissile(final int player){

	}

	private void gameLoop(){

	}

}

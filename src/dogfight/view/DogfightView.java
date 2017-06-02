package dogfight.view;

import java.util.Observable;

public class DogfightView implements IViewSystem, Runnable {

	public DogfightView(final IOrderPerformer orderPerformer, final IDogfightModel dogfightModel, final Observable observable){
		super(orderPerformer, dogfightModel, observable);
	}

	@Override
	public void displayMessage(final String message) {
		// TODO Auto-generated method stub
	}

	@Override
	public void closeAll() {
		// TODO Auto-generated method stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
}

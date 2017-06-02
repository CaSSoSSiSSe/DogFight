package dogfight.view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer {

	EventPerformer (final IOrderPerformer orderPerformer) {
		super(orderPerformer);
	}

	@Override
	public void eventPerform(final com.sun.glass.events.KeyEvent keyCode) {
		// TODO Auto-generated method stub
	}
	
	
	private UserOrder keyCodeToUserOrder(final int keyCode){
	}

}

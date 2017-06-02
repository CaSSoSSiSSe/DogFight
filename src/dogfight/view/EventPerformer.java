package dogfight.view;

import java.awt.event.KeyEvent;

import gameframe.IEventPerformer;
import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;

public class EventPerformer implements IEventPerformer {

	public EventPerformer (final IOrderPerformer orderPerformer) {
		super();
	}

	private UserOrder keyCodeToUserOrder(final int keyCode){
		return this.keyCodeToUserOrder(keyCode);
	}

	@Override
	public void eventPerform(final KeyEvent keyCode) {
		// TODO Auto-generated method stub

	}

}

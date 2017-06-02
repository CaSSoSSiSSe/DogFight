package dogfight.view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import gameframe.IGraphicsBuilder;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;

public class GraphicsBuilder implements IGraphicsBuilder {

	public GraphicsBuilder(final IDogfightModel dogfightModel){
		super();
	}

	@Override
	public void applyModelToGraphics(final Graphics graphics, final ImageObserver observer) {
		// TODO Auto-generated method stub
	}

	private void buildEmptySky(){
	}

	private void drawMobile(final IMobile mobile, final Graphics graphics, final ImageObserver observer){
	}

	@Override
	public int getGlobalWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGlobalHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
}

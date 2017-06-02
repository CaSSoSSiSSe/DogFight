import dogfight.view.DogfightView;
import jpu2016.dogfight.controller.DogFightController;
import jpu2016.dogfight.model.DogfightModel;

public class DogFightMain {

	public static void main(final String[] args) {
		final DogfightModel dogfightModel = new DogfightModel();
		final DogFightController dogfightController = new DogFightController(dogfightModel);
		final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel, dogfightModel);
		dogfightController.setViewSystem(dogfightView);
		dogfightController.play();
	}

}

package balloon.command;

import java.util.ArrayList;
import java.util.List;

/*
 * Command Pattern
 */

// Portal class acts as a command invoker class
public class Portal {

	private List<Occasion> occasionList = new ArrayList<Occasion>();

	public void addOccasion(Occasion order) {
		occasionList.add(order);
	}

	public void processBalloons() {
		for (Occasion occasion : occasionList) {
			System.out.println(occasion.designBalloons());
		}
		occasionList.clear();
	}
}

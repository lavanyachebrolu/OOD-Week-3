package balloon.facade;

/*
 * Facade Pattern
 */

public class Green implements Color {

	@Override
	public String selectColor() {
		System.out.println("Green color selected");
		return "GREEN";
	}

}

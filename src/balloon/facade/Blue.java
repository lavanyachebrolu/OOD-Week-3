package balloon.facade;

/*
 * Facade Pattern
 */

public class Blue implements Color {

	@Override
	public String selectColor() {
		System.out.println("Blue color selected");
		return "BLUE";
	}

}

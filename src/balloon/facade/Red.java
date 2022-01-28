package balloon.facade;

/*
 * Facade Pattern
 */

public class Red implements Color{

	@Override
	public String selectColor() {
		System.out.println("Red color selected");
		return "RED";
	}

}

package balloon.facade;

/*
 * Facade Pattern
 */

// BalloonPainter acts as a facade class
public class BalloonPainter {

	private Color red;
	private Color green;
	private Color blue;

	public BalloonPainter() {
		red = new Red();
		green = new Green();
		blue = new Blue();
	}

	public String selectRed() {
		return red.selectColor();
	}

	public String selectGreen() {
		return green.selectColor();
	}

	public String selectBlue() {
		return blue.selectColor();
	}
}

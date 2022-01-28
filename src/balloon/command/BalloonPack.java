package balloon.command;

/*
 * Command Pattern
 */

// BalloonPack acts as a request class
public class BalloonPack {

	private int balloonsCount;

	public BalloonPack() {
	}

	public BalloonPack(int balloonsCount) {
		this.balloonsCount = balloonsCount;
	}

	public int getBalloonsCount() {
		return balloonsCount;
	}

	public void setBalloonsCount(int balloonsCount) {
		this.balloonsCount = balloonsCount;
	}

	public String designForBirthday() {
		return "Designed for Birthday";
	}

	public String designForWedding() {
		return "Designed for Wedding";
	}

}

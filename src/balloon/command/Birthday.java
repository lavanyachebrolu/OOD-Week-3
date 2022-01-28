package balloon.command;

/*
 * Command Pattern
 */

// Birthday concrete class implementing occasion
public class Birthday implements Occasion {

	private BalloonPack balloonPack;

	public Birthday() {

	}

	public Birthday(BalloonPack balloonDesign) {
		this.balloonPack = balloonDesign;
	}

	public BalloonPack getBalloonDesign() {
		return balloonPack;
	}

	public void setBalloonDesign(BalloonPack balloonDesign) {
		this.balloonPack = balloonDesign;
	}

	@Override
	public String designBalloons() {
		System.out.print(balloonPack.getBalloonsCount() + " balloons - ");
		return balloonPack.designForBirthday();
	}

}

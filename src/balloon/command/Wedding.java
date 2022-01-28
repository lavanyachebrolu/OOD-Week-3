package balloon.command;

/*
 * Command Pattern
 */

//Wedding concrete class implementing occasion
public class Wedding implements Occasion {

	private BalloonPack balloonPack;

	public Wedding() {
	}

	public Wedding(BalloonPack balloonDesign) {
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
		return balloonPack.designForWedding();
	}

}

package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import balloon.command.BalloonPack;
import balloon.facade.BalloonPainter;

public class BalloonTest {

	// testing the facade class response
	@Test
	public void testBalloonPainter() {
		BalloonPainter painter = new BalloonPainter();
		assertEquals("BLUE", painter.selectBlue());
		assertEquals("GREEN", painter.selectGreen());
		assertEquals("RED", painter.selectRed());
	}

	/*
	 * balloon pack holds the balloons count of each order and it includes the
	 * command request methods
	 * 
	 * test method to test the allocated balloon count
	 */
	@Test
	public void testBalloonPack() {
		BalloonPack balloonPack = new BalloonPack(10);
		assertEquals(10, balloonPack.getBalloonsCount());
	}

	/*
	 * test method to test the allocated balloon count and command invocation
	 */
	@Test
	public void testCommand() {
		BalloonPack balloonPack = new BalloonPack(10);
		assertEquals(10, balloonPack.getBalloonsCount());
		assertEquals("Designed for Birthday", balloonPack.designForBirthday());
	}

	/*
	 * test method to test the allocated balloon count and a different command
	 * invocation
	 */
	@Test
	public void testBalloonPackWithCommand() {
		BalloonPack balloonPack = new BalloonPack(20);
		assertEquals(20, balloonPack.getBalloonsCount());
		assertEquals("Designed for Wedding", balloonPack.designForWedding());
	}
}

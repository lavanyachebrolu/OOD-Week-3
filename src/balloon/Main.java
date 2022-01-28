package balloon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import balloon.command.BalloonPack;
import balloon.command.Birthday;
import balloon.command.Occasion;
import balloon.command.Portal;
import balloon.command.Wedding;
import balloon.facade.BalloonPainter;

public class Main {

	public static void main(String[] args) throws IOException {

		// declaring BufferedReader
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("---------- Bubbly Ballons ----------");

		// reading color input
		int color = 0;
		while (true) {
			System.out.println("\nSelect the color: \n1. Red\n2. Green\n3. Blue");
			color = Integer.parseInt(bufferedReader.readLine());
			if (color == 1 || color == 2 || color == 3) {
				break;
			} else {
				System.out.println("Invalid color!");
			}
		}

		// applying colors to balloons
		BalloonPainter paint = new BalloonPainter();
		if (color == 1) {
			paint.selectRed();
		} else if (color == 2) {
			paint.selectGreen();
		} else if (color == 3) {
			paint.selectBlue();
		}

		// creating instance for portal class
		Portal portal = new Portal();
		do {
			// reading count to order
			int count = 0;
			while (true) {
				System.out.print("\nEnter the number of ballons to order: ");
				count = Integer.parseInt(bufferedReader.readLine());
				if (count > 0) {
					break;
				} else {
					System.out.println("Invalid ballons!");
				}
			}
			// reading the occasion type
			int type = 0;
			while (true) {
				System.out.println("Select the occasion type: \n1. Birthday\n2. Wedding");
				type = Integer.parseInt(bufferedReader.readLine());
				if (type == 1 || type == 2) {
					break;
				} else {
					System.out.println("Invalid occasion type!");
				}
			}

			// creating instance for BalloonPack class
			BalloonPack balloonPack = new BalloonPack(count);

			// switching between the different occasions
			Occasion occasion = null;
			if (type == 1) {
				occasion = new Birthday(balloonPack);
			} else if (type == 2) {
				occasion = new Wedding(balloonPack);
			}

			// adding order item to portal
			portal.addOccasion(occasion);

			System.out.println("\nDo you want to add more items to this order? Y/N");
			String choice = bufferedReader.readLine();

			if (!choice.equalsIgnoreCase("y")) {
				// processing balloon order
				portal.processBalloons();
				System.out.println("\nThank You!");
				break;
			}
		} while (true);
	}

}

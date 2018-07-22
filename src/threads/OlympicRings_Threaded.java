package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot blue = new Robot(100, 100);
		Robot yellow = new Robot(200, 50);
		Robot black = new Robot(300, 150);
		Robot green = new Robot(400, 50);
		Robot red = new Robot(500,100);
		
		blue.setPenColor(Color.BLUE);
		yellow.setPenColor(Color.YELLOW);
		black.setPenColor(Color.BLACK);
		green.setPenColor(Color.GREEN);
		red.setPenColor(Color.RED);
		
		blue.penDown();
		yellow.penDown();
		black.penDown();
		green.penDown();
		red.penDown();
		
		Thread b = new Thread(()->{
			blue.turn(1);
			blue.move(1);
		});
		Thread y = new Thread(()->{
			yellow.turn(1);
			yellow.move(1);
		});
		Thread bl = new Thread(()->{
			black.turn(1);
			black.move(1);
		});
		Thread g = new Thread(()->{
			green.turn(1);
			green.move(1);
		});
		Thread r = new Thread(()->{
			red.turn(1);
			red.move(1);
		});
		
		for(int i = 0; i<=360; i++) {
			b.run();
			y.run();
			bl.run();
			g.run();
			r.run();
		}
	}
}


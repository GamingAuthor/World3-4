package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot blue = new Robot(500, 450);
		Robot yellow = new Robot(650, 550);
		Robot black = new Robot(800, 450);
		Robot green = new Robot(950, 550);
		Robot red = new Robot(1100,450);
		
		blue.setPenColor(Color.BLUE);
		yellow.setPenColor(Color.YELLOW);
		black.setPenColor(Color.BLACK);
		green.setPenColor(Color.GREEN);
		red.setPenColor(Color.RED);
		
		blue.setPenWidth(10);
		yellow.setPenWidth(10);
		black.setPenWidth(10);
		green.setPenWidth(10);
		red.setPenWidth(10);
		
		blue.setSpeed(10);
		yellow.setSpeed(10);
		black.setSpeed(10);
		green.setSpeed(10);
		red.setSpeed(10);
		
		blue.penDown();
		yellow.penDown();
		black.penDown();
		green.penDown();
		red.penDown();
		
		Thread b = new Thread(()->{
			for(int i = 0; i<=360; i++) {
			blue.turn(1);
			blue.move(2);		
			}
			blue.hide();
		});
		Thread y = new Thread(()->{
			for(int i = 0; i<=360; i++) {
			yellow.turn(1);
			yellow.move(2);		
			}
			yellow.hide();
		});
		Thread bl = new Thread(()->{
			for(int i = 0; i<=360; i++) {
			black.turn(1);
			black.move(2);			
			}
			black.hide();
		});
		Thread g = new Thread(()->{
			for(int i = 0; i<=360; i++) {
			green.turn(1);
			green.move(2);				
			}
			green.hide();
		});
		Thread r = new Thread(()->{
			for(int i = 0; i<=360; i++) {
			red.turn(1);
			red.move(2);
			}
			red.hide();
		});

			b.start();
			y.start();
			bl.start();
			g.start();
			r.start();
			
	}
}


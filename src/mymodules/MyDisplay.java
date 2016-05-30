package mymodules;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
	public void setup() {
		size(400, 400);
		background(200, 200, 200);
	}
	
	public void draw() {
		fill(255, 255, 0);
		ellipse(200, 200, 300, 300);
		fill(0, 0, 0);
		ellipse(150,150, 25, 50);
		fill(0, 0, 0);
		ellipse(250,150,25,50);
		
		noFill();
		arc(200, 280, 75, 75, 0, PI);
		// System.out.println(second());
	}
}

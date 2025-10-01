package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	while(true){
		int redComponent = (int) (Math.random()*255);
		int greenComponent = (int) (Math.random()*255);
		int blueComponent = (int) (Math.random()*255);


		double x = 0.5; //x1
		double y = 0.25;//y1
		double halfWidth = 0.5; //x2
		double halfHeight = 0.25;///y2
		StdDraw.clear(); // removing the previous frame
		StdDraw.setPenColor(redComponent,greenComponent,blueComponent);
		StdDraw.filledRectangle(x,y,halfWidth,halfHeight);

		//4 rectangle
		halfWidth = 0.5;
		halfHeight = 0.05;
		x = 0.5;
		y = 0.25;
		redComponent = (int) (Math.random()*255);
		greenComponent = (int) (Math.random()*255);
		blueComponent = (int) (Math.random()*255);
		StdDraw.setPenColor(redComponent,greenComponent,blueComponent);
		StdDraw.filledRectangle(x, y, halfWidth, halfHeight);

		halfWidth = 0.5;
		halfHeight = 0.05;
		StdDraw.setPenColor(redComponent,greenComponent,blueComponent);
		StdDraw.filledRectangle(x, y, halfWidth, halfHeight);


		// circle
		x = 0.25;
		y = 0.25;
		halfWidth = 0.1;
		redComponent = (int) (Math.random()*255);
		greenComponent = (int) (Math.random()*255);
		blueComponent = (int) (Math.random()*255);
		StdDraw.setPenColor(redComponent,greenComponent,blueComponent);
		StdDraw.filledCircle(x,y,halfWidth);
	StdDraw.pause(200);
	StdDraw.show();
	}



		
	}
}
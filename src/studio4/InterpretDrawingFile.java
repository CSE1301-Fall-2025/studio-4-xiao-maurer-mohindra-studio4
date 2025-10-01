package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String Shapename = in.next();
		int redComponent = in.nextInt();
		int greenComponent =in.nextInt();
		int blueComponent = in.nextInt();
		boolean isfilled = in.nextBoolean();
		double x = in.nextDouble(); //x1
		double y = in.nextDouble();//y1
		double halfWidth = in.nextDouble(); //x2
		double halfHeight = in.nextDouble();///y2
		double x3 = in.nextDouble();//x3
		double y3 = in.nextDouble();//y3
		
		// drawing
		// rectangle
		StdDraw.clear(); // removing the previous frame
		StdDraw.setPenColor(redComponent,greenComponent,blueComponent);
		if(Shapename.equals("rectangle")){
			if (isfilled == false){
				StdDraw.rectangle(x,y,halfWidth,halfHeight);
			}
			else{
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
		}

		// ellipse
		else if (Shapename.equals("ellipse")){
			if (isfilled == false){
				StdDraw.ellipse(x,y,halfWidth,halfHeight);

			}
			else{
				StdDraw.filledEllipse(x,y,halfWidth,halfHeight);
			}
		}

		// triangle
		else if (Shapename.equals("triangle")){
			double[] x_array = {x,halfWidth,x3};
			double[] y_array = {y,halfHeight,y3};
			if (isfilled == false){
				StdDraw.polygon(x_array,y_array);
			}
			else{
				StdDraw.filledPolygon(x_array,y_array);
			}
		}




	StdDraw.show();
		//Square



	}
}

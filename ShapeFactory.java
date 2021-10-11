package EECS3311_Project1;
//@author Sheshan Verma STD No. 217631441

//Singleton class to instantiate shapes
//https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java

import java.awt.Color;
import java.util.Random;

public class ShapeFactory {
	private static ShapeFactory shapefact;

	private ShapeFactory() {

	}

	public static ShapeFactory getInstance() {
		if (shapefact == null) {
			shapefact = new ShapeFactory();
		}
		return shapefact;
	}

	public static void generateShape(Panel panel) {
		for (int i = 0; i < 6; i++) {
			Random random = new Random();
			Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
			int upperX = 40;
			int upperY = 40;
			int height = random.nextInt(60);
			int width = random.nextInt(60);
			int randshape = new Random().nextInt(3);

			if (randshape == 0) {
				new Rectangle(upperX, upperY, height, width, color);
			} else if (randshape == 1) {
				new Square(upperX, upperY, height, width, color);
			} else if (randshape == 2) {
				new Circle(upperX, upperY, height, width, color);
			}

		}
		panel.getShape().clear();
	}
//	public static void paintshape(Color color) {
//		
//	}

}

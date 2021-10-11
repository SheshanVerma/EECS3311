package EECS3311_Project1;
//@author Sheshan Verma STD No. 217631441	

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Panel extends JPanel {
	private final ArrayList<Shape> shapelist = new ArrayList<Shape>();

	public ArrayList<Shape> getShape() {
		return shapelist;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Shape shape : shapelist) {
			shape.draw(g);
		}
	}
}

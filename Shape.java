package EECS3311_Project1;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {

	private int upperX;
	private int upperY;
	private int width;
	private int height;
	private Color shapeColor;

	// getters
	public Color getColor() {
		return shapeColor;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getUpperX() {
		return upperX;
	}

	public int getUpperY() {
		return upperY;
	}

	// setters
	public void setColor(Color aShapeColor) {
		this.shapeColor = aShapeColor;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setUpperX(int upperX) {
		this.upperX = upperX;
	}

	public void setUpperY(int upperY) {
		this.upperY = upperY;
	}

	public abstract double computeSurface();

	public abstract void draw(Graphics g);

	public int compareTo(Shape o) {
		// TODO write the right Java code here to support the comparison
		double surface1 = this.computeSurface();
		double surface2 = o.computeSurface();
		return (surface1 < surface2) ? -1 : ((surface1 == surface2) ? 0 : 1);
	}

}

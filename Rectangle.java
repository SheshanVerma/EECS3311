package EECS3311_Project1;

//@author Sheshan Verma STD No. 217631441
import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {

	private int upperX;
	private int upperY;
	private int height;
	private int width;
	private Color shapeColor;

	public Rectangle(int x, int y, int height, int width, Color color) {
		this.upperX = x;
		this.upperY = y;
		this.height = height;
		this.width = width;
		this.shapeColor = color;
	}

	@Override
	public double computeSurface() {
		return this.getHeight() * this.getWidth();
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(this.getColor());
		g.fillRect(upperX, upperY, height, width);
	}
}

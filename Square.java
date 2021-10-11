package EECS3311_Project1;

//@author Sheshan Verma STD No. 217631441
import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape {

	private int upperX;
	private int upperY;
	private int height;
	private int width;
	private Color shapeColor;

	public Square(int x, int y, int height, int width, Color color) {
		this.upperX = x;
		this.upperY = y;
		this.height = height;
		this.width = width;
		this.shapeColor = color;
	}

	@Override
	public double computeSurface() {
		// TODO Auto-generated method stub
		return this.getWidth() * this.getWidth();
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(getColor());
		g.fillRect(upperX, upperY, width, height);

	}

}

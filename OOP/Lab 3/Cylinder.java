/*
Tyler Paulley
Exercise #5 Chapter 11
January 28th, 2014
Cylinder.java
*/

public class Cylinder extends Circle
{
	private double height;

	public Cylinder()
	{
		super();
		height = 0.0;
	}

	public Cylinder(double x, double y, double r, double h)
	{
		super(x, y, r);
		height = h;
	}

	public void setCylinder(double x, double y, double r, double h)
	{
		setCircle(x, y, r);
		height = h;
	}

	public void setHeight(double h)
	{
		height = h;
	}

	public double getHeight()
	{
		return height;
	}

	public double volume()
	{
		return super.area() * height;
	}

	public double surfaceArea()
	{
		return 2 * area() + height * circumference();
	}

//Method to set the base already exists in Circle
//Method to set the center of the base already exists in Point

	public String toString()
	{
		return super.toString() + String.format("%nCylinder:\n") + "\t"
								+ String.format("Height: %.2f", height) + "\n\t"
						 		+ String.format("Surface Area: %.2f", this.surfaceArea()) + "\n\t"
						 		+ String.format("Volume: %.2f", this.volume());
	}
}

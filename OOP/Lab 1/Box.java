/*
Tyler Paulley
January 14th, 2014
Box.java
Lab Assignment #1
C.S. 131-01
*/

public class Box
{
	private double height;
	private double width;
	private double length;

		public Box()
			{height = 1; width = 1; length = 1;}

		public Box(double length, double width, double height)
			{this.height = height; this.length = length; this.width = width;}

		public double getLength()
			{return length;}

		public double getWidth()
			{return width;}

		public double getHeight()
			{return height;}

		public void setLength(double length)
			{this.length = length;}

		public void setWidth(double width)
			{this.width = width;}

		public void setHeight(double height)
			{this.height = height;}

		public double volume()
			{return length * width * height;}

		public double surfaceArea()
			{return 2 * (length * width + length * height + height * width);}

		public String toString()
		{
			String str = "";
			str += "\nThe measurements of the Box are:";
			str += "\n\tLength = " + getLength();
			str += "\n\tWidth = " + getWidth();
			str += "\n\tHeight = " + getHeight();
			str += "\n\tSurface Area = " + surfaceArea();
			str += "\n\tVolume = " + volume();
			return str;
		}
}


/*
Tyler Paulley
Exercise #3 Chapter 11
January 28th, 2014
Point.java
*/

public class Point extends Object
{
	private double x;
	private double y;

		public Point()
		{
			x = 0.0;
			y = 0.0;
		}

		public Point(double xValue, double yValue)
		{
			x = xValue;
			y = yValue;
		}

		public void setX(double x)
		{
			this.x = x;
		}

		public void setY(double y)
		{
			this.y = y;
		}

		public void setPoint(double x, double y)
		{
			this.x = x;
			this.y = y;
		}

		public String getPoint()
		{
			String str = "";
			str += "[ " + x + ", " + y + " ]";
			return str;
		}

		public double getX()
		{
			return x;
		}

		public double getY()
		{
			return y;
		}

		public boolean equals(Point p)
		{
			return (x == p.x) && (y == p.y);
		}

		public void makeCopy(Point p)
		{
			x = p.x;
			y = p.y;
		}

		public Point getCopy()
		{
			Point fakePoint = new Point();
			fakePoint.x = this.x;
			fakePoint.y = this.y;
			return fakePoint;
		}

		public String toString()
		{
			return String.format("%nPoint:%n") + "\t"
				 + String.format("[%.2f", x) + ", "
				 + String.format("%.2f", y) + "]";
		}

/*		public String toString()
		{
			String str = "";
			str += "The x-value is " + x
				+  "The y-value is " + y;
			return str;
		}
*/
}




public class Circle extends Object
{
	private double X;
	private double Y;
	private double R;
	
	public Circle()
	{
		X = 0;
		Y = 0;
		R = 1;
	}

	public Circle(double x, double y)
	{
		X = x;
		Y = y;
	}
	
	public Circle(double x, double y, double r)
	{
		X = x;
		Y = y;
		R = r;
	}
	
	public Circle(Circle c)
	{
		X = c.X;
		Y = c.Y;
		R = c.R;
	}
	
	public void setX(double x)
	{
		this.X = x;
	}

	public void setY(double y)
	{
		Y = y;
	}

	public void setR(double R)
	{
		this.R = R;
	}

	public void setPoint(double x, double y)
	{
		X = x;
		Y = y;
	}
	
	public double getX()
	{
		return X;
	}
	
	public double getY()
	{
		return Y;
	}
		
	public double getR()
	{
		return this.R;
	}

	public String getPoint()
	{
		String output = "";
		output += "(" + X + ", " + Y + ")";
		return output;
	}

	public double area()
	{
		return Math.PI * Math.pow(R, 2);
	}

	public double circum()
	{
		return 2 * Math.PI * R;
	}

	public String equals(Circle c)
	{
		boolean equal = false;
		String s = "";
	
		if((this.X == c.X) && (this.Y == c.Y) && (this.R == c.R))
			equal = true;
		
		if(equal)
			s += "equal";
		else 
			s += "not equal";
		return s;
	}

	public void makeCopy(Circle c)
	{
		c.X = X;
		c.Y = Y;
		c.R = R;
	}
	
	public Circle getCopy()
	{
		return new Circle(X, Y, R);
	}

	public void print()
	{
		String s = "";
		s += "The radius is " + R + " and the point is (" + X + ", " + Y + ").";
	}

	public String toString()
	{
		String s = "";
		s += "The radius is " + R + " and the point is (" + X + ", " + Y + ").";
		return s;
	}
}























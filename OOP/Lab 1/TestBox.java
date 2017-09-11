/*
Tyler Paulley
January 14th, 2014
TestBox.java
Lab Assignment #1
C.S. 131-01
*/

public class TestBox
{
		public static void main(String[] args)
		{
			Box box1 = new Box();
			System.out.println(box1);
			box1.setHeight(3);
			box1.setLength(2);
			box1.setWidth(3);
			System.out.println(box1);
			Box box2 = (box1);
			System.out.println(box2);
			Box box3 = new Box(2, 1, 3);
	}
}
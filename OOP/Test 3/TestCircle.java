public class TestCircle
{
	public static void main(String[] args)
	{
		Circle One = new Circle();
		Circle Two = new Circle(1, 2);
		Circle Three = new Circle(1, 1, 5);
		Circle copy = new Circle(Three);
		
		One.setPoint(2,2);
		One.setR(4);

		One.print();
		System.out.println(One);

		System.out.println();
		System.out.println("The radius should be 5: " + Three.getR());
		
		System.out.println("The point should be (1, 2): " + Two.getPoint());

		Three.makeCopy(Two);
		
		System.out.println();
		
		System.out.println("Should print out 1, 1, 5 after copy: " + Two.toString());
		
		System.out.println("Should print out 1, 1, 5 after copy constructor: " + Two);
		
		Circle C5 = One.getCopy();
		
		System.out.println("Should give 2, 2, 4: " + C5);

		System.out.println("Should give equal: " + Three.equals(copy));
		System.out.println("Should give not equal: " + Three.equals(One));
	}
}

		
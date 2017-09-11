
public class twoDimArrays
{
	public static void main(String[] args) 
	{
		double[][] sales = {{3.0, 4.6, 23.67},
				    {4.5, 456.0, 3.0},
				    {2.3, 556.4, 23.0}};
	
		double[][] decimals = new double[4][4];

		double[][] typedArray = new double[2][2];
		
		twoDimMethods.fillArray(typedArray);

		twoDimMethods.setAll(decimals, 5.6);
		
		twoDimMethods.setRow(decimals, 1, 3.4);
		
		twoDimMethods.setCol(decimals, 2, 4.5);

		twoDimMethods.setSingle(decimals, 0, 0, 1.2);

		double aver = twoDimMethods.average(decimals);
		
		System.out.println();

		System.out.println("Searching for 4.5 results in array:\n");
		boolean find4_5 = twoDimMethods.search(decimals, 4.5);
	
		System.out.println();

		System.out.println("The average of the array is: " + aver + ".");

		System.out.println("The first array is: \n");
		twoDimMethods.printArray(sales);

		System.out.println();
		
		System.out.println("The second array is: \n");
		twoDimMethods.printArray(decimals);

		System.out.println();
		
		twoDimMethods.toString(decimals);
	
		System.out.println();
		
		twoDimMethods.printArray(typedArray);
	}
}
	
		

		
		
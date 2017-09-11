public class initArray
{
	public static void main(String[] args)
	{
		int[][] sales = {{3, 1, 2}, 
				{56, 452, 14}, 
				{12, 3, 23}};
		
		System.out.printf("The array of integers is: \n");
		
		for(int row = 0; row < sales.length; row++)
		{	
			for (int col = 0; col < sales[row].length; col++)
				System.out.printf("%7d", sales[row][col]);
			
			System.out.println();
		}
	}
}
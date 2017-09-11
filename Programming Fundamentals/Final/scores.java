public class scores
{
	public static void main(String[] args)
	{
		int[][] Tyler = {{100, 81},
				{98, 85}};
		
		double average = TestScores.average(Tyler);
		
		double standardDev = TestScores.stdDev(Tyler);
	
		System.out.println("Tyler's average test score was " + average +
				   "\nand Tyler's standard deviation was " + standardDev);
	}
}
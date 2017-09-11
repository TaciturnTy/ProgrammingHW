public class TestScores
{
	public static double average(int[][] scores)
	{	
		int total = 0;
		int numElements = 0;
		double average = 0;

		for(int row = 0; row < scores.length; row++)
			for(int col = 0; col < scores[row].length; col++)
			{
				total += scores[row][col];
				numElements++;
			}
		average = (double) total / numElements;
		
		return average;
	}
		
	public static double stdDev(int[][] scores)
	{
		int numElements = 0;
		double average = 0;
		int total = 0;
		double totalDev = 0;
	
		for(int i = 0; i < scores.length; i++)
			for(int j = 0; j < scores[i].length; j++)
			{
				total += scores[i][j];
				numElements++;
			}
		average = (double) total / numElements;
	
		for(int i = 0; i < scores.length; i++)
			for(int j = 0; j < scores[i].length; j++)
				totalDev += Math.pow((double) scores[i][j] - average, 2);

		return Math.sqrt((double) totalDev / numElements);
	}
}



























		
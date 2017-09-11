import java.util.*;
import java.lang.Math.*;
public class Q4
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
	char grade;
	int score;
	
	System.out.print("Please enter your score 1 to 100: ");
		score = console.nextInt();

	switch(score/10)
		{
		case 10:
			grade = 'A';
			break;
		case 9:
			grade = 'B';
			break;
		case 8:
			grade = 'C';
			break;
		case 7:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
	System.out.print("Your grade was " + grade);
	}
}
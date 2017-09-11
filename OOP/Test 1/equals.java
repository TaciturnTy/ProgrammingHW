//method to check array equality, deep
public static boolean equals(int[] x, int[] y)
{
	if(x.length != y.length)
	return false;

	for(int i = 0; i < x.length; i++)
		if(x[i] != y[i])
			retrun false;
		return true;
	}
}
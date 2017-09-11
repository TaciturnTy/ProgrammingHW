//PRACTICE FOR PRINTING INTGERS OF A NUMBER AND ITS SUM


//SEGMENT TO PRINT DIGITS, ASSUMING VARIABLES HAVE BEEN INITIALIZED AND DECLARED

for(int i =0; i < ndigits; i++)
{
	System.out.print(number % (int) Math.pow(10, ndigits - i) + " ")
	number %= (int) Math.pow(10, ndigits - i);
}


//SEGMENT TO FIND THE NUMBER OF DIGITS ndigits

while(num > 0)
{
	num /= 10;
	ndigits++;
}


//TO FIND WHETHER OR NOT THE NUMBER IS NEGATIVE

boolean isNegative = false;

if(number < 0)
{
	isNegative = true;
	number = -number;
}


//SEGMENT TO PRINT THE SUM OF THE NUMBER'S DIGITS

while(number > 0)
{
	sum += number % 10;
	number = number / 10;
}




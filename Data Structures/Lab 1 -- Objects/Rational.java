/**
 * A class that describes the operations on a rational number.
 *
 * @author Tyler Paulley
 *
 * @version 7.0  ||  9/2/14
 *
 */

public class Rational
{
    private int numerator;
    private int denominator;

    /**
     * The default constructor for objects of class Rational.  Creates the rational number 1.
     */
    public Rational()
    {
		numerator = 1;
		denominator = 1;
    }


    /**
     * The alternate constructor for objects of class Rational.  Creates a rational number equivalent to n/d.
     * @param n The numerator of the rational number.
     * @param d The denominator of the rational number.
     */
    public Rational(int num, int den)
    {
        numerator = num;
        denominator = den;

        normalize();

        if(denominator == 0)
        	throw new ZeroDenominatorException("Exception Thrown: Denominator cannot be zero");
    }


    /**
     * Get the value of the Numerator
     *
     * @return The value of the numerator
     */
    public int getNumerator()
    {
        return numerator;
    }


    /**
     * Get the value of the Denominator
     *
     * @return The value of the denominator
     */
    public int getDenominator()
    {
        return denominator;
    }


    /**
     * Negate a rational number r
     *
     * @return A new rational number that is negation of this number -r
     */
    public Rational negate()
    {
		Rational negated = new Rational();

		negated.numerator = this.numerator * -1;
		negated.denominator = this.denominator;

        return negated;
    }


    /**
     * Invert a rational number r
     *
     * @return A new rational number that is 1/r.
     */
    public Rational invert()
    {
       	Rational reciprocal = new Rational();

		if(numerator == 0)
			throw new ZeroDenominatorException("Numerator would invert to make denominator zero.");

		else
		{
			reciprocal.numerator = this.denominator;
			reciprocal.denominator = this.numerator;
		}

		reciprocal.normalize();

        return reciprocal;
    }


    /**
     * Add two rational numbers
     *
     * @param other the second argument of the add
     *
     * @return A new rational number that is the sum of this and the other rational
     */
    public Rational add(Rational other)
    {
		Rational sum = new Rational();
		int otherNum = other.numerator;
		int otherDen = other.denominator;
		int thisNum = this.numerator;
		int thisDen = this.denominator;

		otherNum *= thisDen;
		otherDen *= thisDen;
		thisNum *= other.denominator;
		thisDen *= other.denominator;

		sum.numerator = otherNum + thisNum;
		sum.denominator = otherDen;

		sum.normalize();

		return sum;
    }


     /**
     * Subtract a rational number t from this one r
     *
     * @param other the second argument of subtract
     *
     * @return A new rational number that is r-t
     */
    public Rational subtract(Rational other)
    {
        return this.add(other.negate());
    }


    /**
     * Multiply two rational numbers
     *
     * @param other the second argument of multiply
     *
     * @return A new rational number that is the sum of this object and the other rational.
     */
    public Rational multiply(Rational other)
    {
        Rational product = new Rational();

        product.numerator = this.numerator * other.numerator;
        product.denominator = this.denominator * other.denominator;

        product.normalize();

        return product;
    }


     /**
     * Divide a this rational number r by another one t
     *
     * @param other the second argument of divide
     *
     * @return A new rational number that is r/t
     */
    public Rational divide(Rational other)
    {
        Rational quotient = new Rational();

        if(other.numerator == 0)
        	throw new ZeroDenominatorException("Cannot divide by a rational equalling zero.");

        quotient.numerator = this.numerator * other.denominator;
        quotient.denominator = this.denominator * other.numerator;

		quotient.normalize();

        return quotient;
    }


 	 /**
     * Put the rational number in normal form where the numerator
     * and the denominator share no common factors.  Guarantee that only the numerator
     * is negative.
     *
     */
    private void normalize()
    {
        int divideBy = gcd(this.numerator, this.denominator);
        this.numerator /= divideBy;
        this.denominator /= divideBy;

        if(((this.numerator < 0) && (this.denominator < 0)) || (!(this.numerator < 0) && (this.denominator < 0)))
        {
        	this.numerator *= -1;
       	    this.denominator *= -1;
		}
    }


     /**
     * Algorithm to compute the greatest common divisor of two positive integers
     *
     * @param a the first argument of gcd
     * @param b the second argument of gcd
     *
     * @return the gcd of the two arguments
     */
    private int gcd(int a, int b)
    {
   		if (b == 0)
     		return a;
   		else
     		return gcd(b, a % b);
	}
}

//BinaryOutputR.java


import java.util.Scanner;

public class BinaryOutputR {

	static Scanner console = new Scanner (System.in);

	public static void main (String[] args){

		int base ;

		int number ;

		System.out.println ("Please enter the base:");

		base = console.nextInt();

		System.out.println ("Please enter the number:");

		number = console.nextInt();

		binaryOutput(number,base);

		System.exit ( 0) ;

	}

	public static void binaryOutput (int number, int base){
		
		if ( number != 0 ){

					
			binaryOutput (number/base, base);

			System.out.print ( number % base);
		}
	
	}

}
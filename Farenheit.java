package assgn1;

import java.util.Scanner;

public class Farenheit {
	public static void main(String[] args) {
		System.out.println("Provide a temperature in Fahrenheit: ");
		Scanner input = new Scanner(System.in);
		double f = input.nextDouble();
		f = ((f-32)*5)/9;
		System.out.println("Corresponding temperature in Celsius is "+f);
		

		
	}
}

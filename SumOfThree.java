package assgn1;

import java.util.Scanner;

public class SumOfThree {
	public static void main(String[] args) {
		System.out.println("Provide a three digit number: ");
		Scanner input = new Scanner(System.in);
		int f = input.nextInt();
		int a = f%10;
		f= f/10;
		int b = f%10;
		f= f/10;
		int c = f%10;
		
		System.out.println("Sum of digits:" +(a+b+c));
		

		
	}
}

package assgn1;

import java.util.Scanner;


public class Area {
	public static void main(String[] args) {
		System.out.println("Provide radius: ");
		Scanner input = new Scanner(System.in);
		float f = input.nextFloat();
		float area= (float) (Math.PI * Math.pow(f, 2));
		System.out.println("Corresponding area is " +area);
		

		
	}
}


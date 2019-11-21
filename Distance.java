package assgn1;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Point x1: ");
		int x1 = input.nextInt();
		System.out.println("Point y1: ");
		int y1 = input.nextInt();
		System.out.println("Point x2: ");
		int x2 = input.nextInt();
		System.out.println("Point x2: ");
		int y2 = input.nextInt();
		
		
		
		float distance= (float) Math.pow((Math.pow(x1-x2, 2))+(Math.pow(y1-y2, 2)), 0.5);
		System.out.printf("Corresponding area is %.3f",distance);
				
	}
}


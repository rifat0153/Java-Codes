package Mi222ks_assign2;

import java.util.Scanner;

public class DangerousWork {
	public static void main(String[] args) {
		
		int earning = 0;
		Scanner input = new Scanner(System.in);		
		System.out.print("\nHow much would you like to earn? ");
		earning = input.nextInt();
		
		int days = 0;
		
		for(double i=0.01; i < earning ; i = i*2)
		{
			days += 1;
		}
		
		System.out.print("\nYou will have your money in " +days+" days");
	}
}

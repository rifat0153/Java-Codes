package Mi222ks_assign2;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		
		int largest = -99999, second_largest = -99999;
		
		System.out.print("Prodive 10 Integers: ");
		Scanner input = new Scanner(System.in);
		int n;
		for(int i=0 ; i<10; i++)
		{
			n = input.nextInt();
			if(n>largest)
			{
				second_largest = largest;
				largest = n;
			}
			if(n>second_largest && n<largest)
			{
				second_largest=n;
			}
		}

		System.out.println("The second largest is: "+ second_largest);
		
	}
}

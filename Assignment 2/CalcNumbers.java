package Mi222ks_assign2;

import java.util.Scanner;

public class CalcNumbers {
	public static void main(String[] args) {
		
		int sum = 0;
		int i;
		Scanner input = new Scanner(System.in);		
		
		while (true)
		{
			System.out.print("\nGive me a Number: ");
			i = input.nextInt();
			if(i == 0)
			{
				break;
			}
			
			sum = sum+i;
		}
		
		System.out.print("\nThe Sum is: "+sum);
	}
}

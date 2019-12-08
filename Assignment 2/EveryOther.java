package Mi222ks_assign2;

import java.util.Scanner;

public class EveryOther {
	public static void main(String[] args) {
		
		int low,high;
		Scanner input = new Scanner(System.in);
		
		System.out.println("First Number: ");
		low = input.nextInt();
		
		System.out.println("First Number: ");
		high = input.nextInt();
		
		for(int i=low ; i<=high ; i = i+2)
		{
			System.out.print(i+" ");
		}
	}
}
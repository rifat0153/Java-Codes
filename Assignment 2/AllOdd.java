package Mi222ks_assign2;

import java.util.Random;
import java.util.Scanner;

public class AllOdd {
	public static int []a = new int[10];
	public static void main(String[] args) {
		
		
		Random rand = new Random();
		int n;
		for(int i=0; i<10; i++)
		{
			n = rand.nextInt(100) + 1;
			a[i] = n;
		}
		
		System.out.print("Complete Array:  ");
		for(int i=0; i<10; i++)
		{
			
			System.out.print(a[i]+" ");
			
		}
		System.out.print("\nAll odd numbers: ");
		
		for(int i=0; i<10; i++)
		{
			if(a[i] % 2 != 0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}

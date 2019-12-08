package Mi222ks_assign2;

import java.util.Scanner;

public class SimpleTraingle {
	public static void main(String[] args) {
		
		int height = 0;
		Scanner input = new Scanner(System.in);		
		System.out.print("\nEnter a positive value: ");
		height = input.nextInt();
		
		if(height <=0)
		{
			System.out.println(height+" was not Valid ");
		}
		else
		{
			int blank_count = 0;
			
			for(int i= 0; i<height ; i++)
			{
				
				for(int j=0 ; j < blank_count ; j++)
				{
					System.out.print(" ");
				}
				
				for(int j =0 ; j < height-i ; j++)
				{
					System.out.print("*");
				}
				System.out.println("");
				
				blank_count += 1;
			}
		}
		
	}
}

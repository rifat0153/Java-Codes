package Mi222ks_assign2;

import java.util.Scanner;

public class Diamonds {
	public static void main(String[] args) {
		
		int height = 1;
		
		while(true)
		{
			Scanner input = new Scanner(System.in);		
			System.out.print("Enter a positive number: ");
			height = input.nextInt();
			
			if(height <=0)
			{
				System.out.println(height+" was not Valid ");
				break;
			}
			else
			{
				int blank_count = height - 1;
				
				for(int i= 1; i<= height ; i++)
				{
					
					for(int j=0 ; j < blank_count ; j++)
					{
						System.out.print(" ");
					}
					
					for(int j =0 ; j < (i*2)-1 ; j++)
					{
						System.out.print("*");
					}
					System.out.println("");
					
					blank_count -= 1;
				}
			}
			
			int inverse_height = height - 1;
			int b_count = 0;
			
			for(int i= 0; i< inverse_height ; i++)
			{
				
				for(int j=0 ; j <=b_count  ; j++)
				{
					System.out.print(" ");
				}
				
				for(int j=0 ; j < ((inverse_height - i)*2) - 1  ; j++)
				{
					System.out.print("*");
				}
				System.out.println("");
				
				b_count += 1;
			}
			
			
			
			
			
			
		}
	
	}
}

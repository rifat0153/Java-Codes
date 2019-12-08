package Mi222ks_assign2;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static int []l = new int[7];
	public static void main(String[] args) {
		
		
		Random rand = new Random();
		
		int lower_bound = 1;
		int upper_bound = 29;
		
		for(int i=0; i<7;i++)
		{
			
			int n = (rand.nextInt(upper_bound-lower_bound) + 1) + lower_bound;
			
			l[i] = n;
			
			lower_bound = n;
			upper_bound += 1;
			
		}
		
		for(int i=0; i<7; i++)
		{
			System.out.print(l[i]+" ");
		}
		
		
	}
}

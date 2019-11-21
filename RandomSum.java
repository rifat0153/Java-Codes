package assgn1;
import java.util.Random;
import java.util.Scanner;

public class RandomSum {
	public static void main(String[] args) {
		Random rand = new Random();

		// Obtain a number between [0 - 999].
		int n = rand.nextInt(1000);
		n += 1;  // (0-999) becomes (1-1000)
		int a = n;
		
		n = rand.nextInt(1000);
		n += 1; 
		int b = n;
		
		n = rand.nextInt(1000);
		n += 1; 
		int c = n;
		
		n = rand.nextInt(1000);
		n += 1; 
		int d = n;
		
		n = rand.nextInt(1000);
		n += 1; 
		int e = n;
		
		System.out.println("Five random numbers: "+a+" "+b+" "+c+" "+d+" "+e);
		
		System.out.println("Their sum is " +(a+b+c+d+e));
		

		
	}
}

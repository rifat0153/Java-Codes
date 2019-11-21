package assgn1;

import java.util.Scanner;

public class Numbers {
	public static int largest, middle, smallest;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("First number: ");
		int a = input.nextInt();
		
		System.out.println("Second number: ");
		int b = input.nextInt();
		
		System.out.println("Third number: ");
		int c = input.nextInt();

		
		if(a<b && a<c)
		{
			smallest = a;
		}
		if(b<a && b<c)
		{
			smallest = b;
		}

		if(c<a && c<b)
		{
			smallest = c;
		}
		
		
		if(a<c && a>b || a>c && a<b)
		{
			middle = a;
		}
		if(b<c && b>a || b>c && b<a)
		{
			middle = b;
		}

		if(c<a && c>b || c>a && c<b)
		{
			smallest = c;
		}
		
		
		if(a>b && a>c)
		{
			largest = a;
		}
		if(b<a && b<c)
		{
			largest = b;
		}

		if(c>a && c>b)
		{
			largest = c;
		}
		
		System.out.printf("Correct order: %d %d %d ",smallest, middle, largest);
		
		
		
		
	}
}

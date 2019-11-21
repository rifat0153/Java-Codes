package assgn1;

import java.util.Scanner;

public class programming {
	
	public static String smallest, middle, largest;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the first programming language? ");
		String n1 = input.nextLine();
		
		System.out.println("And the second? ");
		String n2 = input.nextLine();
		
		System.out.println("And the third? ");
		String n3 = input.nextLine();
		
		
		if((int)n1.charAt(0) < (int)n2.charAt(0)  && (int)n1.charAt(0) < (int)n3.charAt(0))
		{
			smallest = n1;
		}
		
		if((int)n2.charAt(0) < (int)n1.charAt(0)  && (int)n2.charAt(0) < (int)n3.charAt(0))
		{
			smallest = n2;
		}
		
		if((int)n3.charAt(0) < (int)n1.charAt(0)  && (int)n3.charAt(0) < (int)n2.charAt(0))
		{
			smallest = n3;
		}
		
		
		
		
		if((int)n1.charAt(0) < (int)n2.charAt(0)  && (int)n1.charAt(0) > (int)n3.charAt(0)  || (int)n1.charAt(0) > (int)n2.charAt(0)  && (int)n1.charAt(0) < (int)n3.charAt(0) )
		{
			middle = n1;
		}
		
		if((int)n2.charAt(0) < (int)n1.charAt(0)  && (int)n2.charAt(0) > (int)n3.charAt(0)  || (int)n2.charAt(0) > (int)n1.charAt(0)  && (int)n2.charAt(0) < (int)n3.charAt(0))
		{
			middle = n2;
		}
		
		if((int)n3.charAt(0) < (int)n1.charAt(0)  && (int)n3.charAt(0) > (int)n2.charAt(0)  || (int)n3.charAt(0) > (int)n1.charAt(0)  && (int)n3.charAt(0) < (int)n2.charAt(0))
		{
			middle = n3;
		}
		
		
		
		if((int)n1.charAt(0) > (int)n2.charAt(0)  && (int)n1.charAt(0) > (int)n3.charAt(0))
		{
			largest = n1;
		}
		
		if((int)n2.charAt(0) > (int)n1.charAt(0)  && (int)n2.charAt(0) > (int)n3.charAt(0))
		{
			largest = n2;
		}
		
		if((int)n3.charAt(0) > (int)n1.charAt(0)  && (int)n3.charAt(0) > (int)n2.charAt(0))
		{
			largest = n3;
		}
		
		
		System.out.printf("Alphabetic order is %s, %s and %s",smallest, middle, largest);
		

		
	}
}

package assgn1;

import java.util.Scanner;

public class DoctorWho {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;
		System.out.printf("What Year? ");
		year = input.nextInt();
		
		if(year>=1963 && year<=1988)
		{
			System.out.printf("That was the original series.");
		}
		else if(year>=1989 && year <=2004)
		{
			System.out.printf("That year it was a pause.");
		}
		else if(year>=2005 && year <=2020)
		{
			System.out.printf("That is the modern doctor.");
		}
		else
		{
			System.out.printf("No news on a doctor yet, but one can hope!");
		}
		
		
		
	}
}

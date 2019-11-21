package assgn1;

import java.util.Scanner;

public class Time {
	public static void main(String[] args) {
		System.out.println("Give a number of seconds: ");
		Scanner input = new Scanner(System.in);
		int f = input.nextInt();
		int hour,min,sec;
		hour = f/3600;
		min = (f-(hour*3600))/60;
		sec = f - (hour*3600)-(min*60);
		
		System.out.println("This corresponds to: "+hour+" hour, "+min+"minutes, "+sec+"seconds");
		

		
	}
}

package assgn1;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Temperature (C): ");
		double temp = input.nextDouble();
		
		System.out.println("Wind speed (m/s): ");
		double wind = input.nextDouble();
		
		System.out.println("TEmp  abs(C): "+Math.abs(temp));
		
		wind = wind*3.6;
		wind = wind*100;
		wind = Math.round(wind);
		wind = wind/100;
		
		
		double twc;
		
		twc = 13.12 + (0.6215*temp) - 11.37*Math.pow(wind, 0.16) +0.3965*temp*Math.pow(wind, 0.16);
		
		twc = twc*10;
		twc = Math.round(twc);
		twc = twc/10;
		
		System.out.println("Wind Chill Temperature (C): "+twc);
		
	}
}

package assgn1;

import java.util.Scanner;

public class Change {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Price: ");
		float price = input.nextFloat();
		System.out.println("Payment: ");
		float payment = input.nextFloat();
		
		int remaining;
		int coin = Math.round(payment-price);
		System.out.println("Change: "+(coin));
		
		if(coin % 1000 != coin)
		{
			coin = coin - 1000;
			System.out.println("1000 kr bills: 1");
		}
		else
		{
			System.out.println("1000 kr bills: 0");
		}
		
		if(coin % 500 != coin)
		{
			coin = coin - 500;
			System.out.println(" 500 kr bills: 1");
		}
		else
		{
			System.out.println(" 500 kr bills: 0");
		}
		
		if(coin % 200 != coin)
		{
			coin = coin - 200;
			System.out.println(" 200 kr bills: 1");
		}
		else
		{
			System.out.println(" 200 kr bills: 0");
		}
		
		if(coin % 100 != coin)
		{
			coin = coin - 100;
			System.out.println(" 100 kr bills: 1");
		}
		else
		{
			System.out.println(" 100 kr bills: 0");
		}
		
		if(coin % 50 != coin)
		{
			coin = coin - 50;
			System.out.println("  50 kr bills: 1");
		}
		else
		{
			System.out.println("  50 kr bills: 0");
		}
		
		if(coin % 20 != coin)
		{
			coin = coin - 20;
			System.out.println("  20 kr bills: 1");
		}
		else
		{
			System.out.println("  20 kr bills: 0");
		}
		
		if(coin % 10 != coin)
		{
			coin = coin - 10;
			System.out.println("  10 kr bills: 1");
		}
		else
		{
			System.out.println("  10 kr bills: 0");
		}
		
		if(coin % 5 != coin)
		{
			coin = coin - 5;
			System.out.println("   5 kr bills: 1");
		}
		else
		{
			System.out.println("   5 kr bills: 0");
		}
		
		if(coin % 2 != coin)
		{
			coin = coin - 2;
			System.out.println("   2 kr bills: 1");
		}
		else
		{
			System.out.println("   2 kr bills: 0");
		}
		
		if(coin != 0)
		{
			System.out.println("   1 kr bills: 1");
		}
		else
		{
			System.out.println("   1 kr bills: 0");
		}
		
	}
}

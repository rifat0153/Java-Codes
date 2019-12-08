package Mi222ks_assign2;

import java.util.Scanner;
import java.util.Random;

public class Histogram {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int num_zero=0;
		int num_one=0;
		int num_two=0;
		int num_three=0;
		int num_four=0;
		int num_five=0;
		int num_six=0;
		int num_seven=0;
		int num_eight=0;
		int num_nine=0;
		
		Scanner input = new Scanner(System.in);
		int n;
		
		for(int i=0; i<500; i++)
		{
			n = rand.nextInt(10); // return 0-9
			n += 1;  // makes (0-9) to (1-10)
			
			if(n==1) {
				num_one += 1;
			}
			if(n==2) {
				num_two += 1;
			}
			if(n==3) {
				num_three += 1;
			}
			if(n==4) {
				num_four += 1;
			}
			if(n==5) {
				num_five += 1;
			}
			if(n==6) {
				num_six += 1;
			}
			if(n==7) {
				num_seven += 1;
			}
			if(n==8) {
				num_eight += 1;
			}
			if(n==9) {
				num_nine += 1;
			}
				
		}
		
		
			System.out.print("One   "+num_one+": ");
			for(int j=0 ; j<num_one ; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			
			System.out.print("Two   "+num_two+": ");
			for(int j=0 ; j<num_two ; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			
			System.out.print("Three "+num_three+": ");
			for(int j=0 ; j<num_three ; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			
			System.out.print("Four  "+num_four+": ");
			for(int j=0 ; j<num_four ; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			
			System.out.print("Five  "+num_five+": ");
			for(int j=0 ; j<num_five ; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			
			System.out.print("Six   "+num_six+": ");
			for(int j=0 ; j<num_six ; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			
			System.out.print("Seven "+num_seven+": ");
			for(int j=0 ; j<num_seven ; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			
			System.out.print("Eight "+num_eight+": ");
			for(int j=0 ; j<num_eight ; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
			
			System.out.print("Nine  "+num_nine+": ");
			for(int j=0 ; j<num_nine ; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		
		
		
	}
}

package Mi222ks_assign2;
import java.util.Scanner;

public class PrimeNumber {

	
	void prime_checker(int n) {
		boolean found = true;
		
		if(n==1 || n==2) {
			System.out.println("This is a Prime Number");
			return;
		}
		else {
			
			for(int i=2; i<n-1; i++) {
				if(n%i==0) {
					found = false;
					break;
				}
			}
			
			if(found == true) {
				System.out.println("This is a Prime Number");
			}
			else {
				System.out.println("This is not a Prime Number");
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		PrimeNumber ob1 = new PrimeNumber();
		
		while(true) {
			System.out.print("Give me a Number: ");
			int n = input.nextInt();
			if(n<0) {
				System.out.println("GoodBye");
				break;
			}
			else {
				ob1.prime_checker(n);
			}
		}
	}
}

package Mi222ks_assign2;

import java.util.Scanner;

public class Palindrome {
	
	//Palindrome Checker
	void PalinChecker(String p) {
		
		Palindrome object = new Palindrome();
		
		String lower = object.space_remover(p);
		
		int size = lower.length() - 1;
		
		int count = 0;
		
		for(int i=0; i<size; i++)
		{
			if(lower.charAt(i) != lower.charAt(size-i))
			{
				break;
			}
			else
			{
				count += 1;
			}
		}
		
		if(size == count)
		{
			System.out.println("That was a Palindrome");
		}
		else
		{
			System.out.println("That wasn't a Palindrome");
		}
	}
	
	//Removes Spaces 
	String space_remover(String s) {
		String [] temp;
		String wospaces = " ";  //for initialization adding one space
		
		temp = s.split(" ");
		int tsize = temp.length;
		
		for(int i=0; i<tsize; i++) {
			wospaces = wospaces.concat(temp[i]);
		}
		
		wospaces = wospaces.strip(); //Removing the 1st space added during initialization
		wospaces = wospaces.toLowerCase();
		
		return wospaces;
	}
	
	
	public static void main(String[] args) {
		String s;
		Scanner input = new Scanner(System.in);
		
		Palindrome ob = new Palindrome();
		
		while(true)
		{
			s = input.nextLine();
			
			if(s.matches("stop")) {
				break;
			}
			else {
				ob.PalinChecker(s);
			}
			
			
		}
		
	

		
	}
}

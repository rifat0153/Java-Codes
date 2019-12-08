package Mi222ks_assign2;
import java.util.Scanner;

public class Password {
	static int sp_ch = 0;
	static int num = 0;
	static int upper = 0;
	
	
	boolean pass_checker(String s)
	{
		char[] ch = s.toCharArray();
		sp_ch = 0;
		num = 0;
		upper = 0;

		for(char c :ch)
		{
			if((int)c >= 65 && (int)c <= 90 )
			{
				upper += 1;
				
			}
			if((int)c >= 48 && (int)c <= 57 )
			{
				num += 1;
			}
			if((int)c >= 33 && (int)c <= 47 )
			{
				sp_ch += 1;
			}
			if((int)c >= 58 && (int)c <= 64 )
			{
				sp_ch += 1;
			}
			if((int)c >= 91 && (int)c <= 96 )
			{
				sp_ch += 1;
			}
			if((int)c >= 123 && (int)c <= 126)
			{
				sp_ch += 1;
			}
			if((int)c == 8364 || (int)c == 165)
			{
				sp_ch += 1;
			}
		}
		
		if(s.length()>=10 && sp_ch >= 2 && num >= 2 && upper >= 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//main Function
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String s ;
		
		Password ob = new Password();
		boolean found = false;
		
		while(found != true)
		{
			s = input.nextLine();
			if(ob.pass_checker(s) == true)
			{
				found = true;
			}
		}
		System.out.print("Password is Valid!");
	}
}

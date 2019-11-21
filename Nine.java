package assgn1;
import java.util.Random;
import java.util.Scanner;

public class Nine {
	
	public static int player_score, computer_score;
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		String Str = new String();
		System.out.printf("Ready to play? ");
		Str = input.nextLine();
		
		int n;
	
		if(Str.matches("y") == true || Str.matches("Y") == true )
		{
			n = rand.nextInt(6);
			n += 1;
			player_score = n;
			System.out.println("You rolled "+player_score);
		}
		
		
		System.out.printf("Would you like to roll again? (Y/N) ");
		Str = input.nextLine();
		
		if(Str.matches("y") == true || Str.matches("Y") == true )
		{
			n = rand.nextInt(6);
			n += 1;
			player_score =  player_score + n;
			System.out.printf("You rolled %d and in total you have %d \n",n,player_score);
		}
		
		n = rand.nextInt(6);
		n += 1;
		computer_score= n;
		System.out.printf("The computer rolled %d ",computer_score);
		
		if(computer_score <= 4)
		{
			n = rand.nextInt(6);
			n += 1;
			computer_score= computer_score + n;
			System.out.printf("The computer rolls again and gets %d in total %d \n",n,computer_score);
		}
		
		
		if( player_score >9 )
		{
			System.out.printf(" Player FAT");
		}
		if( computer_score >9 )
		{
			System.out.printf("Computer FAT");
		}
		
		if(player_score > computer_score && player_score <= 9)
		{
			System.out.printf("Player Won");
		}
		if(player_score < computer_score && computer_score <= 9)
		{
			System.out.printf("Computer Won");
		}
		if(player_score == computer_score && computer_score <=9 && player_score <=9)
		{
			System.out.printf("Draw");
		}
		
		
		
		
	}
}

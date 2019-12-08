package Mi222ks_assign2;
import java.util.Random;
import java.util.Scanner;


public class Ants {

	static int [][]a = new int[8][8];
	static int x,y = 0;
	static int c=0;
	static int step_count = 1;
	
	static int []sum = new int[10];
	static float total = 0;
	
	
	
	
	int sim()
	{
		Random rand = new Random();
		x=0;
		y=0;
		step_count = 1;
		c= 0;
		

		for(int ii=0;ii<8;ii++)
		{
			for(int j=0;j<8;j++)
			{
				a[ii][j]=0;
			}
			//System.out.print("\n");
		}
		
		
		a[x][y] = 1;      //Co-ordinates of Ant 
	
	

	
	while(step_count != 64)
	{
		c += 1;   //to count how many steps the ant took to cover the chess board
		int n = rand.nextInt(4) + 1;
		

		if(n==1) {
			if(x==0)
			{
				continue;
			}
			else
			{
				x -= 1;  // moving ant up
				
				if(a[x][y] ==0)
				{
					a[x][y] = 1;
					step_count += 1;
				}
			}
		}
		
		
		if(n==2) {
			if(x==7)
			{
				continue;
			}
			else
			{
				x += 1;  // moving ant down
				if(a[x][y] ==0)
				{
					a[x][y] = 1;
					step_count += 1;
					
				}
			}
		}
		
		
		if(n==3) {
			if(y==0)
			{
				continue;
			}
			else
			{
				y -= 1;  // moving ant left
				
				if(a[x][y] ==0)
				{
					a[x][y] = 1;
					step_count += 1;
				}
			}
		}
		
		
		if(n==4) {
			if(y==7)
			{
				continue;
			}
			else
			{
				y += 1;  // moving ant up
				
				if(a[x][y] ==0)
				{
					a[x][y] = 1;
					step_count += 1;
				}
			}
		}
		
	}
	
	
	return c;
	}
	
	

	
	public static void main(String[] args) {
		
		Ants ob = new Ants();
		
		for(int i=0;i<10;i++)
		{
			int v = ob.sim();
			sum[i] = v;
			System.out.println("Number of Steps in Simulation "+(i+1)+": "+v);
		}
		

		for(int i=0;i<10;i++)
		{
			total = total+sum[i];
		}
		
		System.out.print("Average amount of steps :"+(total/10));
		
	
		
		
	}
}

package Mi222ks_assign2;
import java.util.Scanner;



public class Bricks {
	
	static int width ,height;
	
	String [][] builder(int w, int h)
	{
		int row = h+2;
		int col = w+2;
		
		String s[][] = new String[row][col];
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				if(i==0 && j==0) {
					s[i][j] = "┌";
				}
				if(i==0 && j==col-1) {
					s[i][j] = "┐";
				}
				if(i==row-1 && j==0) {
					s[i][j] = "└";
				}
				if(i==row-1 && j==col-1) {
					s[i][j] = "┘";
				}
				
				if((j==0 || j==col-1) && (i != 0 && i!= row-1)) {
					s[i][j] = "|";
				}
				
				if(i==0 && (j!=0 && j!=col-1)) {
					s[i][j]= "─";
				}
				if(i==row-1 && (j!=0 && j!=col-1)) {
					s[i][j]= "─";
				}
				
				if((i!=0 && i!=row-1) && (j!=0 && j!=col-1)) {
					s[i][j]= "●";
				}

			}
		}

		return s;
	}
	
	
	
	void Print_array(String [][]n,int r,int c) {
		System.out.print("\n\n");
		for(int i=0; i<r+1;i++) {
			for(int j=0; j<c+1;j++) {
					System.out.print(n[i][j]+" ");
				}
			System.out.print("\n");
			}
		System.out.print("\n\n");
	}
	
	
	
	public static void main(String[] args) {

		Bricks ob = new Bricks();
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Width: ");
			width = input.nextInt();
			if(width == 0) {
				break;
			}
			System.out.println("Height: ");
			height = input.nextInt();
			
			String b[][] = new String[height+2][width+2];
			
			b = ob.builder(width, height);
			
			ob.Print_array(b, height+1, width+1);
		}	
		
		System.out.println("Goodbye");
		
	}
}

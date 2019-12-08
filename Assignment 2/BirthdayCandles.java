package Mi222ks_assign2;

public class BirthdayCandles {
	static int total_box = 0;
	static int box = 0;
	static int rem_can = 0;
	
	public static void main(String[] args) {
		
		int total_age = 100;
		
		for(int age=1; age<=total_age; age++)
		{
			box = 0;
			if(age>rem_can)
			{
				for(int j=0; j+rem_can<age; j=j+24)
				{
					box += 1;
				}
				total_box = total_box + box;;
				rem_can = (box*24)-age + rem_can;
				System.out.println("Before Birthday "+age+" ,buy "+box+" box(es)");
				System.out.println("Rem Candles: "+rem_can+" AGE: "+age);
				continue;
			}
			if(age< rem_can)
			{
				rem_can = rem_can - age;
				System.out.println("Before Birthday "+age+" , don't buy box(es)");
				System.out.println("Rem Candles: "+rem_can+" AGE: "+age);
				continue;
				
			}
			if(age == rem_can)
			{
				rem_can = rem_can - age;
				System.out.println("Before Birthday "+age+" , don't buy box(es)");
				System.out.println("Rem Candles: "+rem_can+" AGE: "+age);
				continue;
			}
			
			
			
		}
		
		System.out.println("Total number of boxes: "+ total_box +", Remaining candles: "+rem_can);
		
		
	}
}

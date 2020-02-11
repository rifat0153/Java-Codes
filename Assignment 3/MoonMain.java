package Mi222ks_assign3;

public class MoonMain {
	public static void main(String[]args) {
		Moon ob = new Moon("Ganymede",5262);
		
		System.out.println("Largest moon in the solar system is "+ob.getName()+" which is "+ob.getDiameter()+" km in diameter");
	}
}

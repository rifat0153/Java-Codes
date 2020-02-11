package Mi222ks_assign3;

public class MoonsMain {

	public static void main(String[] args) {
		Planet Mars = new Planet("MARS", 4, 2, 1.666, 1.382);
		
		Moon Phobos = new Moon("Phobos", 4000);
		Moon Deimos = new Moon("Deimos", 5000);
		
		Mars.addMoon(Phobos);
		Mars.addMoon(Deimos);

		Moon [] m = Mars.getMoons();

		System.out.println("Moons of Mars:");
		System.out.println("		"+m[0].getName());
		System.out.println("		"+m[1].getName());
		
	}

}

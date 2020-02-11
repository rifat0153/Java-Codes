package Mi222ks_assign3;

import Mi222ks_assign3.Planet;

public class MarsMain {
	public static void main(String [] args) {
		Planet Mars = new Planet("MARS", 4, 2, 1.666, 1.382);
		
		System.out.println(Mars.getName()+":");
		System.out.println("    Position:	"+Mars.getPositionFromSun());
		System.out.println("    Moons:      "+Mars.getNoOfMoons());
		System.out.println("    Aphelion:   "+Mars.getAphelion());
		System.out.println("    Perihelion: "+Mars.getPerihelion());
	}
}

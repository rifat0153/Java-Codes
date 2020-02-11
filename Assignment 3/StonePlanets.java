package Mi222ks_assign3;

public class StonePlanets {
	public static void main(String [] args) {
		Planet Mercury = new Planet("Mercury", 1, 0, 0.47, 0.31);
		Planet Venus = new Planet("Venus", 2, 0, 0.72, 0.72);
		Planet Earth = new Planet("Earth", 3, 1, 1.0, 0.99);
		Planet Mars = new Planet("MARS", 4, 2, 1.666, 1.382);
		
		Planet p[] = new Planet[4];
		p[0] = Mercury;
		p[1] = Venus;
		p[2] = Earth;
		p[3] = Mars;
		
		
		//Creating Moons
		Moon Phobos = new Moon("Phobos", 4000);
		Moon Deimos = new Moon("Deimos", 5000);
		Moon moon = new Moon("Moon", 3000);
		//Adding Moons to Planets
		Mars.addMoon(Phobos);
		Mars.addMoon(Deimos);
		Earth.addMoon(moon);
		
		for(int i =0; i<p.length; i++) {
			
			System.out.println("Planet Mercury has aphelion "+ p[i].getAphelion()+" perihelion "+ p[i].getPerihelion()+" and "+p[i].getNoOfMoons() +"moons.");
			
			Moon m[] = p[i].getMoons();
			int nom = p[i].getNoOfMoons();
			
			for(int j=0; j<nom; j++) {
				System.out.println("	"+m[j].getName());
			}
			
			
			
		}
		
		
	}
}

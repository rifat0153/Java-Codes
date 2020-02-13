package Mi222ks_assign3;

public class GameManager {

	public static void main(String[] args) {
		
		Weapon w1 = new Weapon("LightSaber", 4);
		Player p1 = new Player("Gurko", "Hero", 2, w1);
		Player p2 = new Player("Turjo", "Hero", 4, null);
		
		Fight f = new Fight(p1, p2, 50, 30);
		
		
		
		f.startFight(p1.getDice(), p2.getDice());
		
	}

}

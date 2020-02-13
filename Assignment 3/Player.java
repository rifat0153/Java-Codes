package Mi222ks_assign3;

public class Player {
	private String name;
	private String type;
	private int dice;
	private Weapon weapon; 
	
	
	public Player(String name, String type, int dice, Weapon weapon) {
		super();
		this.name = name;
		this.type = type;
		this.dice = dice;
		this.weapon = weapon;
	}

	
	
	
	
	
	
	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getDice() {
		return dice;
	}


	public void setDice(int dice) {
		this.dice = dice;
	}


	public Weapon getWeapon() {
		return weapon;
	}


	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}


	
}

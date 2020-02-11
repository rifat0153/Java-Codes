package Mi222ks_assign3;

public class Planet {
	private String name;
	private int positionFromSun;
	private int noOfMoons;
	private double aphelion;
	private double perihelion;
	private Moon []moons = new Moon[50];
	
	public Planet() {
		
	}
	
	public Planet(String name, int positionFromSun, int noOfMoons, double aphelion, double perihelion) {
		super();
		
		if(name == null) {
			this.name = "Unknown planet";
		}
		else {
			this.name = name;
		}
		
		if(positionFromSun >= 1 && positionFromSun <=9) {
			this.positionFromSun = positionFromSun;
		}
		else {
			this.positionFromSun = 0;
		}
		
		if(noOfMoons >= 0 && noOfMoons <= 100) {
			this.noOfMoons = noOfMoons;
		}
		else {
			this.noOfMoons = 0;
		}
		
		if(aphelion >= 0 && aphelion <=50) {
			this.aphelion = aphelion;
		}
		else {
			this.aphelion = 0;
		}	
		
		if(perihelion >= 0 && perihelion <= 30) {
			this.perihelion = perihelion;
		}
		else {
			this.perihelion = 0;
		}
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null) {
			this.name = "Unknown planet";
		}
		else {
			this.name = name;
		}
	}

	public int getPositionFromSun() {
		return positionFromSun;
	}

	public void setPositionFromSun(int positionFromSun) {
		if(positionFromSun >= 1 && positionFromSun <=9) {
			this.positionFromSun = positionFromSun;
		}
		else {
			this.positionFromSun = 0;
		}
	}

	public int getNoOfMoons() {
		return noOfMoons;
	}

	public void setNoOfMoons(int noOfMoons) {
		if(noOfMoons >= 0 && noOfMoons <= 100) {
			this.noOfMoons = noOfMoons;
		}
		else {
			this.noOfMoons = 0;
		}
	}

	public double getAphelion() {
		return aphelion;
	}

	public void setAphelion(double aphelion) {
		if(aphelion >= 0 && aphelion <=50) {
			this.aphelion = aphelion;
		}
		else {
			this.aphelion = 0;
		}	
	}

	public double getPerihelion() {
		return perihelion;
	}

	public void setPerihelion(double perihelion) {
		if(perihelion >= 0 && perihelion <= 30) {
			this.perihelion = perihelion;
		}
		else {
			this.perihelion = 0;
		}
	}
	
	//Function to ADD moons
	public void addMoon(Moon m) {
		int i = 0;

		while(moons[i] != null) {
			i++;	
		}

		moons[i] = m;                         // adding moon to planet
	}
	
	public Moon [] getMoons() {
		return moons;
	}
	
	
}

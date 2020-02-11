package Mi222ks_assign3;

public class Moon {
	private String name;
	int diameter;
	
	public Moon() {
		super();
	}

	public Moon(String name, int diameter) {
		super();

		if(name==null) {
			this.name = "Unknown moon";
		}
		else {
			this.name = name;
		}
		
		if(diameter >= 0 && diameter<= 10000 ) {
			this.diameter = diameter;
		}
		else {
			this.diameter = 0;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name==null) {
			this.name = "Unknown moon";
		}
		else {
			this.name = name;
		}
	}
	
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		if(diameter >= 0 && diameter<= 10000 ) {
			this.diameter = diameter;
		}
		else {
			this.diameter = 0;
		}
		
	}
}

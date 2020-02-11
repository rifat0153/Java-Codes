package Mi222ks_assign3;

public class DateFormat {
	private int d;
	private int m;
	private int y;
	private char f;
	private char p;
	
	

	
	public DateFormat() {
		super();
	}

	public DateFormat(int y, int m, int d, char p, char f) {
		super();
		this.d = d;
		this.m = m;
		this.y = y;
		this.f = f;
		this.p = p;
	}




	public String getDate(boolean fullyear) {
		
		if(d <0 || d>31 || m <0|| m>12 || y <1900 || y >2100) {
			return "Invalid Date";
		}
		
		
		String s = " ";

		String d1 = Integer.toString(d);
		String m1 = Integer.toString(m);
		String y11 = Integer.toString(y);
		String p1 = String.valueOf(p);
		
		String y1;
		
		if(fullyear) {
			y1 = y11;
		}
		else {
			y1 = y11.substring(2, 4);
		}
		
		
		if(f == 'b') {
			s = s.concat(y1);
			if(p != '!') {
				s = s.concat(p1);
			}
			if(m1.length()==1) {
				s = s.concat("0");
				s = s.concat(m1);
				if(p != '!') {
					s = s.concat(p1);
				}
			}
			else {
				s = s.concat(m1);
				if(p != '!') {
					if(p != '!') {
						s = s.concat(p1);
					}
				}
			}

			
			if(d1.length()==1) {
				s = s.concat("0");
				s = s.concat(d1);
			}
			else {
				s = s.concat(d1);
			}
		}
		
		
		if(f == 'm') {
			if(m1.length()==1) {
				s = s.concat("0");
				s = s.concat(m1);
				if(p != '!') {
					s = s.concat(p1);
				}
			}
			else {
				s = s.concat(m1);
				if(p != '!') {
					s = s.concat(p1);
				}
			}
			
			if(d1.length()==1) {
				s = s.concat("0");
				s = s.concat(d1);
				if(p != '!') {
					s = s.concat(p1);
				}
			}
			else {
				s = s.concat(d1);
				if(p != '!') {
					s = s.concat(p1);
				}
			}
			
			s = s.concat(y1);
		}
		
		
		if(f == 'l') {
		
			if(d1.length()==1) {
				s = s.concat("0");
				s = s.concat(d1);
				if(p != '!') {
					s = s.concat(p1);
				}
			}
			else {
				s = s.concat(d1);
				if(p != '!') {
					s = s.concat(p1);
				}
			}
			
			if(m1.length()==1) {
				s = s.concat("0");
				s = s.concat(m1);
				if(p != '!') {
					s = s.concat(p1);
				}
			}
			else {
				s = s.concat(m1);
				if(p != '!') {
					s = s.concat(p1);
				}
			}
			s = s.concat(y1);
		}
		
		
		s = s.strip();
		
		return s;
	}

	public int getD() {
		return d;
	}

	public void setDay(int d) {
		this.d = d;
	}

	public int getM() {
		return m;
	}

	public void setMonth(int m) {
		this.m = m;
	}

	public int getY() {
		return y;
	}

	public void setYear(int y) {
		this.y = y;
	}

	public char getF() {
		return f;
	}

	public void setFormat(char f) {
		this.f = f;
	}

	public char getP() {
		return p;
	}

	public void setPunctuation(char p) {
		this.p = p;
	}
	
	
	
	

	
}

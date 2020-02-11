package Mi222ks_assign3;

public class RefinedDateFormat {
	private int d;
	private int m;
	private int y;
	private char f;
	private char p;
	
	

	
	public RefinedDateFormat() {
		super();
	}

	//funtion to find leap year
	public boolean isLeapYear(int year) {
		boolean leap = false;
		
		if( (year%4 == 0) && (year%100 != 0)  ||  (year%400 == 0)   ) {
				leap = true;
			}
		return leap;
	}
	
	public RefinedDateFormat(int y, int m, int d, char p, char f) {
		super();
		
		boolean leap = this.isLeapYear(y);
		
		//Checking date for leap year
		if( (m==2) && leap) {
			if(d>29) {
				this.d = 0;
			}
			else {
				this.d = d;
			}
		}
		if((m==2) && (leap == false)) {
			if(d>28) {
				this.d = 0;
			}
			else {
				this.d = d;
			}
		}
		
		if( (m==1) || (m==3) || (m==5) || (m==7) || (m==8) || (m==10) || (m==12) ) {
			if(d>31) {
				this.d = 0;
			}
			else {
				this.d = d;
			}
		}

		if( (m==4) || (m==6) || (m==9) || (m==11) ) {
			if(d>30) {
				this.d = 0;
			}
			else {
				this.d = d;
			}
		}
		
		//Validity of Year
		if( y<1900 || y>2100) {
			this.y = 0;
		}
		else {
			this.y = y;
		}
		
		//Validity of month
		if( m<0 || m>12) {
			this.m = 0;
		}
		else {
			this.m = m;
		}
		
		
		if( d<0) {
			System.out.println("D is 0");
		}
		if( m<0) {
			System.out.println("M is 0");
		}
		if( y<0) {
			System.out.println("Y is 0");
		}	

		this.f = f;
		this.p = p;
	}


	public String getDate(boolean fullyear) {
		
		if(d==0 || m==0 || y==0) {
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
		if(d<0 || d>31) {
			this.d = 0;
		}
		else {
			this.d = d; 
		}	
	}

	public int getM() {
		return m;
	}

	public void setMonth(int m) {
		if(m<0 || m>12) {
			this.m = 0;
		}
		else {
			this.m = m; 
		}	
	}

	public int getY() {
		return y;
	}

	public void setYear(int y) {
		if(y<1900 || y>2100) {
			this.y = 0;
		}
		else {
			this.y = y; 
		}	
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

package Mi222ks_assign3;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
	
	public boolean isEqualTo(Point p) {
		int x1 = p.getX();
		int y1 = p.getY();
		
		if(x == x1 && y == y1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double distanceTo(Point p) {
		int x1 = p.getX();
		int y1 = p.getY();
		
		double d = Math.sqrt(Math.pow((x-x1), 2) + Math.pow((y-y1), 2));
		return d;
	}
	
	public void move(int x1, int y1) {
		x = x+x1;
		y = y+y1;
	}
	
	public void moveToXY(int x1, int y1) {
		x = x1;
		y = y1;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}

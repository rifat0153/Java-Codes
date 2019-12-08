package Mi222ks_assign2;
import java.util.Scanner;

public class DateFormat {

	
	String formatter(String d,String m,String y,String f) {
		
		
		String s = " ";

		if(f.charAt(0) == 'b') {
			s = s.concat(y);
			s = s.concat("/");
			if(m.length()==1) {
				s = s.concat("0");
				s = s.concat(m);
				s = s.concat("/");
			}
			else {
				s = s.concat(m);
				s = s.concat("/");
			}

			
			if(d.length()==1) {
				s = s.concat("0");
				s = s.concat(d);
			}
			else {
				s = s.concat(d);
			}
		}
		
		
		if(f.charAt(0) == 'm') {
			if(m.length()==1) {
				s = s.concat("0");
				s = s.concat(m);
				s = s.concat("/");
			}
			else {
				s = s.concat(m);
				s = s.concat("/");
			}
			
			if(d.length()==1) {
				s = s.concat("0");
				s = s.concat(d);
				s = s.concat("/");
			}
			else {
				s = s.concat(d);
				s = s.concat("/");
			}
			
			s = s.concat(y);
		}
		
		
		if(f.charAt(0) == 'l') {
		
			if(d.length()==1) {
				s = s.concat("0");
				s = s.concat(d);
				s = s.concat("/");
			}
			else {
				s = s.concat(d);
				s = s.concat("/");
			}
			
			if(m.length()==1) {
				s = s.concat("0");
				s = s.concat(m);
				s = s.concat("/");
			}
			else {
				s = s.concat(m);
				s = s.concat("/");
			}
			s = s.concat(y);
		}
		
		
		s = s.strip();
		
		return s;
	}
	
	public static void main(String[] args) {
		DateFormat ob = new DateFormat();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Year: ");
		String year = input.next();
		
		System.out.println("Enter a Month(number): ");
		String month = input.next();
		
		System.out.println("Enter a Day(number): ");
		String day = input.next();
		
		System.out.println("Enter a format (b/l/m): ");
		String f = input.next();
		
		
		String s = ob.formatter(day, month, year, f);
		
		System.out.println(s);
		
	}
}

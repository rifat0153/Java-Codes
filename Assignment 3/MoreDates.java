package Mi222ks_assign3;

public class MoreDates {

	public static void main(String[] args) {
		RefinedDateFormat date = new RefinedDateFormat(2010, 4, 31, '/', 'b');
		RefinedDateFormat date1 = new RefinedDateFormat(2016, 2, 29, '/', 'b');
		RefinedDateFormat date2 = new RefinedDateFormat(2015, 2, 29, '/', 'm');
		RefinedDateFormat date3 = new RefinedDateFormat(2014, 2, 29, '/', 'l');
		RefinedDateFormat date4 = new RefinedDateFormat(2020, 2, 29, '/', 'l');
		RefinedDateFormat date5 = new RefinedDateFormat(1900, 2, 29, '-', 'b');
		System.out.println(date.getDate(false));
		System.out.println(date1.getDate(true));
		System.out.println(date2.getDate(false));
		System.out.println(date3.getDate(true));
		System.out.println(date4.getDate(false));
		System.out.println(date5.getDate(true));
		
	}

}

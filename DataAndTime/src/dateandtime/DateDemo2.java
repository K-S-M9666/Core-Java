package dateandtime;

import java.util.GregorianCalendar;
import java.util.*;

public class DateDemo2 {

	public static void main(String[] args) {
		GregorianCalendar g=new GregorianCalendar();
		//System.out.println(g.isLeapYear(2020));
         //System.out.println(g.get(Calendar.DAY_OF_YEAR));
		g.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		TimeZone tz=g.getTimeZone();
		System.out.println(tz);
		//System.out.println(tz.getDisplayName());
		System.out.println(tz.getID());
	}

}

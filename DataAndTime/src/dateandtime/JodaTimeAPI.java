package dateandtime;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.*;

public class JodaTimeAPI {

	public static void main(String[] args) {
		Date d=new Date();
//		System.out.println(d);
		d.setHours(21);
		System.out.println(d);
		
		//LocalDate dt=LocalDate.ofEpochDay(1);
		LocalDate dt=LocalDate.parse("2022-08-07");
		LocalDate d1=dt.plusMonths(1);
		System.out.println(d1);
		
		LocalTime t=LocalTime.now();
		System.out.println(t);
		LocalTime t1=t.minusHours(2);
		System.out.println(t1);

		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
//		System.out.println(ldt.minusDays(1));
	}

}

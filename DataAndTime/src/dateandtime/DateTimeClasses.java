package dateandtime;
import java.time.Instant;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.*;

public class DateTimeClasses {

	public static void main(String[] args) {
//		ZonedDateTime zdt=ZonedDateTime.now();
//		System.out.println(zdt);
		
		OffsetDateTime odt=OffsetDateTime.now();
		System.out.println(odt);
		
		MonthDay md=MonthDay.now();
		System.out.println(md);
		
		Period p=Period.of(2, 2, 10);
		System.out.println(p.addTo(LocalDate.now()));
		

		Instant i=Instant.now();
		System.out.println(i);
	}

}

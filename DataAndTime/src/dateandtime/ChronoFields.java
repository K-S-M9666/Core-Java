package dateandtime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.*;

public class ChronoFields {

	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
		//DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/Mm/yyyy hh:mm:ss");
		System.out.println(ldt.get(ChronoField.AMPM_OF_DAY));
		System.out.println(ldt.get(ChronoField.YEAR));
	}

}

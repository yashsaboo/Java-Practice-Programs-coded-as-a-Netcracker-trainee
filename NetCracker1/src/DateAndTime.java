import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAndTime {


	public static void main(String[] args) {
		ZonedDateTime indTime = ZonedDateTime.now();
		ZonedDateTime usTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
	}

}

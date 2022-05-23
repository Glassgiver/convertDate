import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date curentDate = new Date (9999992299292L);
        System.out.println(convertDate(curentDate));
    }

    public static ZonedDateTime convertDate(Date neededDate){
        Date date = neededDate;
        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Asia/Almaty"));
        return zonedDateTime;
    }
}

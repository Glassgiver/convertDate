import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        convertDate();
    }

    public static void convertDate(){
        Date date = new Date();
        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Asia/Almaty"));
        System.out.println(zonedDateTime);
    }
}

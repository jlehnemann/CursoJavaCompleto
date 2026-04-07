package dateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("America/Sao_Paulo"));


        LocalDateTime dateTime01 = LocalDateTime.parse("2026-01-25T21:28:00");
        System.out.println(dateTime01);
        System.out.println(fmt1.format(dateTime01));

        Instant instantTime01 = Instant.parse("2025-01-26T00:34:00Z");
        Instant instantTime02 = Instant.parse("2025-03-26T00:34:00Z");

        System.out.println(fmt2.format(instantTime02));

        Duration duration1 = Duration.between(instantTime01, instantTime02);
        System.out.println(duration1.toDays());

        Instant instantTime03 = Instant.now();
        System.out.println(instantTime03);









    }
}

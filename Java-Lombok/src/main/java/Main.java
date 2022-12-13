import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {



        User user = User.builder()
                .name("elo")
                .lastName("ewe")
                .password("123")
                .creationDate(ZonedDateTime.now())
                .deletionDate(ZonedDateTime.now(ZoneId.of("Japan")))
                .build();

        System.out.println(user);


    }
}

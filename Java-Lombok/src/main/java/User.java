import lombok.*;

import java.time.ZonedDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User {

    private Long id;
    private String name;
    private String lastName;
    private String password;
    private ZonedDateTime creationDate;
    private boolean activated;
    private ZonedDateTime activationDate;
    private ZonedDateTime deletionDate;



}
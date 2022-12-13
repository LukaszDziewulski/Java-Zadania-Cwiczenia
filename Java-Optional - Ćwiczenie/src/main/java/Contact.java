import lombok.*;

@Data
@AllArgsConstructor
@ToString

public class Contact {
    private String firstName;
    private String lastName;
    private String telephone;
    private String email;

    String  getShortInfo() {
        return firstName + " " + lastName + " " + telephone;
    }
}

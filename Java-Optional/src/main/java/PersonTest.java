import java.util.Optional;

public class PersonTest {
    public static void main(String[] args) {
        PersonDatabase db = new PersonDatabase();
        db.add(new Person(1, "Jan", "Kowalski"));
        db.add(new Person(2, "Karol", "Zawadzki"));
        db.add(new Person(3, "Bartosz", "Abacki"));
        db.add(new Person(4, "Ania", "Walczak"));

        Optional<Person> personOpt1 = db.findById(2); // Karol Zawadzki
        Optional<Person> personOpt2 = db.findById(55); // null

        db.findById(3).ifPresentOrElse(
                PersonTest::printLastName,
                () -> System.out.println("Brak obiektu we wskazanym ID"));

        personOpt1.ifPresent(PersonTest::printLastName);
        personOpt2.ifPresentOrElse(
                PersonTest::printLastName,
                () -> System.out.println("Brak obiektu we wskazanym ID"));

        System.out.println(db.findLastNameById(1));







    }
    private static void printLastName(Person person) {
        System.out.println(person.getLastName());
    }
}

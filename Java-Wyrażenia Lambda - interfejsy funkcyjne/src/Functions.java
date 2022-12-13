import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Functions {
    public static void main(String[] args) {
        // funkcja przyjmuje String i zwraca String
        Function<String, String> func = text -> text.toLowerCase().trim();
        String original = "   WIELKI NAPIS   ";
        // wywołujemy funkcję przekazując jej original jako argument
        String lowerCaseTrim = func.apply(original);
        System.out.println(lowerCaseTrim);




        Consumer<String> print3Times = s -> {
            System.out.println(s);
            System.out.println(s);
            System.out.println(s);
        };

        print3Times.accept("abc");
        print3Times.accept("xxx");





        int personAge = 19;
        Predicate<Integer> checkIfAdult = age -> age >= 18;
        if (checkIfAdult.test(personAge)) {
            System.out.println("dorosły");
        }


        System.out.println();



        String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
        String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
        int[] ages = {22, 33, 44, 55};
        Random random = new Random();
        Supplier<Person> supplier = () -> {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            return new Person(firstName, lastName, age);
        };
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            people.add(supplier.get());
        }
        for (Person person : people) {
            System.out.println(person);
        }



    }
}
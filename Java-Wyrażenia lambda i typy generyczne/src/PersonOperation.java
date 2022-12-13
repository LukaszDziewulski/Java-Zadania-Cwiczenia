import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class PersonOperators {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan", "Kowalski", 42));
        people.add(new Person("Kasia", "Kruczkowska", 22));
        people.add(new Person("Piotr", "Adamiak", 15));
        people.add(new Person("Jan", "Zawadzki", 17));
        people.add(new Person("Krzysztof", "Wojtyniak", 16));
        people.add(new Person("Agnieszka", "Zagumna", 18));
        people.add(new Person("Basia", "Cyniczna", 28));

        System.out.println(">>> People");
        consumeList(people, p -> System.out.println(p));

        System.out.println(">>> People age+1");
        consumeList(people, p -> p.setAge(p.getAge() + 1));
        consumeList(people, p -> System.out.println(p));

        System.out.println(">>> Adults");
        List<Person> adults = filterByPredicate(people, p -> p.getAge() >= 18);
        consumeList(adults, p -> System.out.println(p));

        System.out.println(">>> Jan People");
        List<Person> janPeople = filterByPredicate(people, p -> "Jan".equals(p.getFirstName()));
        consumeList(janPeople, p -> System.out.println(p));

        System.out.println(">>> FirstNames");
        List<String> firstNames = convertList(people, person -> person.getFirstName());
        consumeList(firstNames, p -> System.out.println(p));
        System.out.println(">>> age");
        List<Integer> ages = convertList(people, person -> person.getAge());
        consumeList(ages, p -> System.out.println(p));

        System.out.println(">>> tworzenie nowego obiektu");
        String[] firstNames1 = {"Jan", "Karol", "Piotr", "Andrzej"};
        String[] lastNames1 = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
        int[] ages1 = {22, 33, 44, 55};
        Random random = new Random();
        List<Person> suppliers = generateRandomList(5, () -> {
            String firstName = firstNames1[random.nextInt(firstNames1.length)];
            String lastName = lastNames1[random.nextInt(lastNames1.length)];
            int age = ages1[random.nextInt(ages1.length)];
            return new Person(firstName, lastName, age);
        });
        consumeList(suppliers, p -> System.out.println(p));


    }

    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    private static <T> List<T> filterByPredicate(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t))
                result.add(t);
        }
        return result;
    }

    private static <T, R> List<R> convertList(List<T> list, Function<T, R> function) {
        List<R> resultList = new ArrayList<>();
        for (T t : list) {
            R result = function.apply(t);
            resultList.add(result);
        }
        return resultList;
    }

    private static <T> List<T> generateRandomList(int elements, Supplier<T> supplier) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            result.add(supplier.get());
        }
        return result;
    }
}
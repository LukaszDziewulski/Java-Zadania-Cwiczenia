import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );


//        courses.forEach(System.out::println);



        long streamSize = courses.count();
        System.out.println(streamSize);



//        courses.min(Comparator.comparingDouble(Course::getPrice))
//                .ifPresent(System.out::println);



//        boolean b = courses.anyMatch(course -> course.getPrice() < 100);
//        if (b)
//            System.out.println("Co najmniej jeden z kursów jest tańszy niż 100zł");



//        boolean b = courses.anyMatch(course -> course.getPrice() > 10);
//        if (b)
//            System.out.println("Wszystkie kursy są droższe od 10zł");



//        boolean b = courses.noneMatch(course -> course.getPrice() > 300);
//        if(b)
//            System.out.println("Żaden z kursów nie jest droższy od 300zł");

//        Course[] courses1 = courses.toArray(Course[]::new);
//        System.out.println(Arrays.toString(courses1));


//        List<Course> collect = courses.collect(Collectors.toList());
//        System.out.println(collect);


//        Collection <Course> collect = courses.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(collect);


//        Stream<String> names = Stream.of("Ania", "Kasia", "Basia");
//        String reduce = names.reduce("", (result, next) -> result + next + " ");
//        System.out.println(reduce);


//        Double reduce = courses.map(Course::getPrice).reduce(0.0, Double::sum);
//        System.out.println(reduce);

    }
}

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


//        List<Integer> collect = IntStream.rangeClosed(0, 10)
//                .boxed().toList();
//        System.out.println(collect);

        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 169, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(1L, "Java", 129, "Programowanie"),
                new Course(3L, "Tajniki Google", 399, "Marketing"),
                new Course(1L, "Java od podstaw", 98, "Programowanie")
        );


//        courses.distinct().forEach(System.out::println);


//        courses.filter(course -> course.getPrice() > 200)
//                .forEach(System.out::println);


//        Course[] cheapCourses = {
//                new Course(1L, "Java", 49, "Programowanie"),
//                new Course(2L, "Sztuka pisania", 79, "Rozwój osobisty"),
//        };
//        Course[] expensiveCourses = {
//                new Course(3L, "Tajniki Google", 299, "Marketing"),
//                new Course(4L, "Python od podstaw", 169, "Programowanie")
//        };
//
//
//        Stream.of(cheapCourses, expensiveCourses)
//                .flatMap(Arrays::stream)
//                .forEach(System.out::println);


//        List<Integer> collect = IntStream.iterate(0, n -> n + 1)
//                .limit(100)
//                .boxed()
//                .collect(Collectors.toList());
//        System.out.println(collect);


//        List<String> java = courses.map(Course::getName)
//                .filter(name -> name.toLowerCase().contains("java"))
//                .collect(Collectors.toList());
//        System.out.println(java);


//        courses.sorted(Comparator.comparingDouble(Course::getPrice))
//                .forEach(System.out::println);


//        List<String> java = courses
//                .filter(c -> c.getName().toLowerCase().contains("java"))
//                .peek(course -> System.out.println("filtered stream: " + course))
//                .map(Course::getName)
//                .peek(course -> System.out.println("filtered:  " + course))
//                .collect(Collectors.toList());
//
//        System.out.println(java);



        courses.sorted(Comparator.comparing(Course::getPrice))
                .skip(2)
                .forEach(System.out::println);


    }
}

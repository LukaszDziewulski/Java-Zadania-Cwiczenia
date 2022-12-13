package FizzBuzz;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//        int[] numbers = new int[100];
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = i + 1;
//        }
//
//        for (int number : numbers) {
//            if (number % 3 == 0) {
//                System.out.println(number + " Fizz");
//            }
//            if (number % 5 == 0) {
//                System.out.println(number + " Buzz");
//            }
//            if (number % 3 == 0 && number % 5 == 0) {
//                System.out.println(number + " FizzBuzz");
//            }
//        }

        IntStream.rangeClosed(0, 100)
                .forEach(number -> {
                    if (number % 3 == 0) {
                        System.out.println(number + " Fizz");
                    }
                    if (number % 5 == 0) {
                        System.out.println(number + " Buzz");
                    }
                    if (number % 3 == 0 && number % 5 == 0) {
                        System.out.println(number + " FizzBuzz");
                    }
                });


    }
}

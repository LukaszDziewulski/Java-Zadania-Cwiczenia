import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {


//        LocalDateTime now = LocalDateTime.now();
//        LocalDateTime of = LocalDateTime.of(2018, 12, 31, 12, 30, 45);// 31 grudnia 2018, 12:30:45
//        System.out.println(of);


        Scanner sc = new Scanner(System.in);
//        System.out.println("Tworzę nowe wydarzenie.");
//        System.out.println("Podaj datę w formacie dd-MM-yyyy");
//
//        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        String dateInput = sc.nextLine();
//        LocalDate createdDate = LocalDate.parse(dateInput, datePattern);
//        System.out.println("Wydarzenie utworzone na dzień " + createdDate);

        System.out.println("W celu włączenia stopera wciśnij enter");
        sc.nextLine();
        Instant i1 = Instant.now();
        System.out.println("W celu zatrzymania stopera wciśnij enter");
        sc.nextLine();
        System.out.println();
        Instant i2 = Instant.now();
        Duration duration = Duration.between(i1, i2);
        System.out.println("Zmierzony czas to : " + duration.getSeconds() + " sekund");
    }
}

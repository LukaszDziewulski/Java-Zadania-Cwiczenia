import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyApp {

    public static void main(String[] args) {
        final int dodajPracownika = 1;
        final int wyszukajInfo = 2;
        final int wyswietlInfo = 3;
        final int usunDane = 4;
        final int exit = 5;
        boolean exit1 = true;

        Scanner s = new Scanner(System.in);
        Company company = new Company();


        do {
            System.out.println("1 - dodaj pracowanika");
            System.out.println("2 - wyszukaj informacji o pracowniku");
            System.out.println("3 - wyświetl informacje o pracownikach");
            System.out.println("4 - usuń wszyskie dane");
            System.out.println("5 - wyjdź z programu");
            try {
                int opcja = s.nextInt();
                switch (opcja) {
                    case dodajPracownika -> company.addEmployee(s);
                    case wyszukajInfo -> company.searchEmployee(s);
                    case wyswietlInfo -> company.printInfo();
                    case usunDane -> company.clearData();
                    case exit -> exit1 = false;
                    default -> System.out.println("nie ma takiej opcji !!");

                }
            } catch (InputMismatchException e) {
                System.err.println("podano zły format danych !!!");
                s.nextLine();
            }
        } while (exit1);
    }
}

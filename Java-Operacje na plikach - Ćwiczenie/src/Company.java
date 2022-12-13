import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.Serializable;

public class Company implements Serializable{

    private Employee[] employees = new Employee[3];
    private final Scanner s = new Scanner(System.in);

    private void addPerson() {
        int numberOfEmployess = 0;
        for (int i = 0; i < employees.length; i++) {
            try {
                System.out.println("Podaj imię:");
                String firstName = s.nextLine();
                System.out.println("Podaj nazwisko:");
                String lastName = s.nextLine();
                System.out.println("Podaj wypłatę:");
                int salary = s.nextInt();

                employees[numberOfEmployess] = new Employee(firstName, lastName, salary);
                numberOfEmployess++;

            } catch (InputMismatchException e) {
                System.err.println("podano zły format danych");
                i--;

            } finally {
                s.nextLine();
            }

        }
    }

    private void saveDisc() {
        String fileName = "emoloyee.obj";

        try (
                var fs = new FileOutputStream(fileName, false);
                var os = new ObjectOutputStream(fs);
        ) {
            os.writeObject(employees);
            System.out.println("Zapisano obiekt do pliku");

        } catch (IOException e) {
            System.err.println("Bład zapisu pliku " + fileName);
            e.printStackTrace();
        }
    }

    private void readDisc() {
        String fileName = "emoloyee.obj";
        employees = null;

        try (
                var fis = new FileInputStream(fileName);
                var ois = new ObjectInputStream(fis);
        ) {
            employees = (Employee[]) ois.readObject();


        } catch (IOException | ClassNotFoundException e) {
            System.err.println("nie udało się zapisać pliku");
            e.printStackTrace();

        }
        if (employees != null) {
            System.out.println("wczytano dane o: ");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
            System.out.println();

        }
    }

    public void companyApp() {
        System.out.println("Witaj, wybierz jedną z poniższych opcji:");
        boolean exit = true;
        do {
            try {
                System.out.println("1 - Dodaj pracowników do firmy");
                System.out.println("2 - Zapisz dane pracowników na dysk");
                System.out.println("3 - Wczytaj i wyświetl dane z dysku");
                System.out.println("4 - Wyjście z programu");
                int opcja = s.nextInt();
                s.nextLine();

                switch (opcja) {
                    case 1 -> addPerson();
                    case 2 -> saveDisc();
                    case 3 -> readDisc();
                    case 4 -> exit = false;
                    default -> System.out.println("Wybierz poprawną opcję");
                }
            } catch (InputMismatchException e) {
                System.err.println("wprowadzono niepoprawny format danych");
                s.nextLine();
            }
        } while (exit);
    }
}




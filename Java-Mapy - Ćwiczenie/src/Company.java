import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Company {

    Map<String, Employee> employees = new HashMap<>();


    public void addEmployee(Scanner s) {
        s.nextLine();
        System.out.println("podaj imię:");
        String firstName = s.nextLine();
        System.out.println("podaj nazwisko:");
        String lastName = s.nextLine();
        System.out.println("podaj wypłatę");
        String key = firstName + " " + lastName;
        int salary = s.nextInt();
        employees.put(key, new Employee(firstName, lastName, salary));
        System.out.println();
    }

    public void printInfo() {
        Set<Map.Entry<String, Employee>> entries = employees.entrySet();
        if (entries.size() != 0) {
            for (Map.Entry<String, Employee> entry : entries) {
                System.out.println(entry);
            }
        } else {
            System.out.println("W bazie nie ma dodanych pracowników");
        }
        System.out.println();
    }

    public void searchEmployee(Scanner s) {
        s.nextLine();
        System.out.println("podaj imię oraz nazwisko szukanego pracownika:");
        String key = s.nextLine();
        Employee employee = employees.get(key);
        if (employee != null)
            System.out.println("Znaleziono pracownika :) " + employee);
        else {
            System.out.println("Nie ma takiej osoby w bazie :(");
        }
        System.out.println();
    }

    public void clearData (){
        employees.clear();
        System.out.println("Pomyślnie usunięto wszyskich pracowników z bazy");
        System.out.println();

    }

}

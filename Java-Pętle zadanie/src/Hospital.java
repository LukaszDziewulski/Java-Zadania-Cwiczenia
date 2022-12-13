import java.util.Scanner;

public class Hospital {

    private final int exit = 0;
    private final int addPatient = 1;
    private final int printPatient = 2;
    private final int maxPatientsNumber = 2;
    private Patient[] patients = new Patient[maxPatientsNumber];
    private int regPatiens = 0;
    private int liczba = 9999;


    private void addPatient(Patient patient) {
            patients[regPatiens] = patient;
            regPatiens++;
    }

    private void printPatients() {
        for (int i = 0; i < regPatiens; i++) {
            System.out.println("Pacjent nr: " + (i + 1));
            System.out.println("imie: " + patients[i].getFirstName());
            System.out.println("nazwisko: " + patients[i].getLastName());
            System.out.println("PESEL: " + patients[i].getPesel());
            System.out.println();
        }

    }

    public void systemOn(Scanner sc) {

        while (liczba != exit) {
            System.out.println("Wybierz jeda z opcji:");
            System.out.println("0 - wyjdz z programu");
            System.out.println("1 - dopisz pacjenta");
            System.out.println("2 - wyswietl liste zapisanych pacjentow");
            liczba = sc.nextInt();
            sc.nextLine();


            switch (liczba) {
                case exit -> {
                    System.out.println("zakonczenie programu");
                    System.exit(0);
                }
                case addPatient -> {
                    if (regPatiens < maxPatientsNumber) {
                        Patient patient = new Patient();
                        System.out.println("Imie: ");
                        patient.setFirstName(sc.nextLine());
                        System.out.println("Nazwisko: ");
                        patient.setLastName(sc.nextLine());
                        System.out.println("PESEL: ");
                        patient.setPesel(sc.nextInt());
                        addPatient(patient);
                    } else {
                        System.out.println("limit miejsc jest osiagniety !");
                        System.out.println();
                    }
                }
                case printPatient -> printPatients();
                default -> System.out.println("Podano zla opcje");
            }

        }
    }
}

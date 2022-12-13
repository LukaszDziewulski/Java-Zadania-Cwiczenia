import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private double add(double x, double y) {
        System.out.print("Wynik dzialania to: ");
        System.out.print(x + y);
        return x + y;
    }

    private double minus(double x, double y) {
        System.out.print("Wynik dzialania to: ");
        System.out.print(x - y);
        return x - y;
    }

    private double multiple(double x, double y) {
        System.out.print("Wynik dzialania to: ");
        System.out.print(x * y);
        return x * y;
    }

    private double divide(double x, double y) {
        System.out.print("Wynik dzialania to: ");
        System.out.print(x / y);
        return x / y;
    }

    private void calculate(double x, double y, String znak) throws UnknownOperatorException {
        switch (znak) {
            case "+" -> add(x, y);
            case "-" -> minus(x, y);
            case "*" -> multiple(x, y);
            case "/" -> {
                if (y == 0) {
                    throw new ArithmeticException("Nie dziel przez 0!!");
                }
                divide(x, y);
            }
            default -> throw new UnknownOperatorException("Wpisano zly znak dzialania!!");

        }

    }

    public void Cal(Scanner s) {
        boolean exit = true;
        do {
            try {
                System.out.println("Wpisz pierwsza liczbe:");
                double liczba1 = s.nextDouble();
                s.nextLine();
                System.out.println("Wpisz znak dzialania ( + ) ( - ) ( / ) ( * )");
                String znak = s.nextLine();
                System.out.println("Wpisz druga liczbe");
                double liczba2 = s.nextDouble();
                calculate(liczba1, liczba2, znak);
                exit = false;
            } catch (ArithmeticException e) {
                System.err.println("nie dziel przez 0!!");
            } catch (UnknownOperatorException e) {
                System.err.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.err.println("Podaj liczbę !!");
            }
        } while (exit);
    }
}


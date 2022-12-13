import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sw = 99999;


        final String MARGHERITA = "1";
        final String CAPRICIOSA = "2";
        final String PROSCIUTTO = "3";


        while (sw != 0) {
            System.out.println("Możliwe pizze do wyboru: ");
            System.out.println("nr 1: " + Pizza.MARGHERITA.toString());
            System.out.println("nr 2: " + Pizza.CAPRICIOSA.toString());
            System.out.println("nr 3: " + Pizza.PROSCIUTTO.toString());
            System.out.println();
            System.out.println("Wybierz nr pizzy: ");
            String pizzaT = sc.nextLine();
            switch (pizzaT) {
                case MARGHERITA -> {
                    System.out.println("Wybrałeś pizzę nr 1:");
                    System.out.println("nr 1: "  + Pizza.MARGHERITA.toString());
                    System.out.println("Zamównenie w realizacji :)");
                    sw = 0;
                }
                case CAPRICIOSA -> {
                    System.out.println("Wybrałeś pizzę nr 2:");
                    System.out.println("nr 2: "  + Pizza.CAPRICIOSA.toString());
                    System.out.println("Zamównenie w realizacji :)");
                    sw = 0;
                }
                case PROSCIUTTO -> {
                    System.out.println("Wybrałeś pizzę nr 3:");
                    System.out.println("nr 3: "  + Pizza.PROSCIUTTO.toString());
                    System.out.println("Zamównenie w realizacji :)");
                    sw = 0;
                }
                default -> System.out.println("Pizza o takim numerze nie istnieje!!");
            }
        }
    }
}
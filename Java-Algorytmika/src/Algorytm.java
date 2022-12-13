import java.util.Scanner;

public class Algorytm {

    private static int liczba = 0;
    private static final int MAX_NUMBER = 100;
    private static int numbers[] = new int[MAX_NUMBER];
    private static int numb = 0;
    private static int suma = 0;

    private static void ParzystaCzyNieparzysta (){
        if (suma % 2 == 0) {
            System.out.println("parzysta = " + suma);
            System.out.println();
            System.out.println("podaj kolejną liczbę");
        } else {
            System.out.println("nieparzysta = " + suma);
            System.out.println();
            System.out.println("podaj kolejną liczbę");
        }
    }


    public static void addLiczba(Scanner sc) {

        System.out.println("Podaj liczbę równą bądź mniejszą od 100");
        while ((liczba = sc.nextInt()) <= 100) {
            numbers[numb] = liczba;
            suma += numbers[numb];
            numb++;
            ParzystaCzyNieparzysta();
        }
        System.out.println("podano liczbę więszką od 100 !");
    }

}

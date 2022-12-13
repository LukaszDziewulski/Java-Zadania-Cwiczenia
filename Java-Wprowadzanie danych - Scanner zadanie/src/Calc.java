import java.util.Scanner;

class Calc {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Calculate calculate = new Calculate();

        System.out.println("Wpisz pierwsza liczbe:");
        double liczba1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Wpisz znak dzialania ( + ) ( - ) ( / ) ( * )");
        String znak = sc.nextLine();
        System.out.println("Wpisz druga liczbe");
        double liczba2 = sc.nextDouble();

        calculate.calculate(liczba1,liczba2,znak);




        sc.close();






    }


}

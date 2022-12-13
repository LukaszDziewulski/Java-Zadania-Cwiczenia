import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate {

    Scanner s = new Scanner(System.in);
    private void calRect() {
        double a;
        double b;
        System.out.println("Podaj wymiary prostokąta");
        System.out.println("bok a:");
        a = s.nextDouble();
        System.out.println("bok b:");
        b = s.nextDouble();
        Shape rectangle = new Rectangle(a, b);
        System.out.println("Pole prostokąta to: " + rectangle.calculateArea());
        System.out.println("Obwód prostokąta to: " + rectangle.calculatePerimeter());
    }

    private void calTria() {
        double a;
        double b;
        double c;
        double h;
        System.out.println("Podaj wymiary trójkąta");
        System.out.println("podstawa a:");
        a = s.nextDouble();
        System.out.println("bok b:");
        b = s.nextDouble();
        System.out.println("bok c:");
        c = s.nextDouble();
        System.out.println("wysokość h:");
        h = s.nextDouble();
        Shape triangle = new Triangle(a, b, c, h);
        System.out.println("Pole trójkąta to: " + triangle.calculateArea());
        System.out.println("Obwód trójkąta to: " + triangle.calculatePerimeter());
    }

    private void calCirc() {
        double r;
        System.out.println("Podaj promień koła:");
        r = s.nextDouble();
        Shape circle = new Circle(r);
        System.out.println("Pole koła to: " + circle.calculateArea());
        System.out.println("Obwód koła to: " + circle.calculatePerimeter());
    }

    public void calculate() {

        boolean ret;
        do {
            ret = true;
            int w;
            System.out.println("Witaj, wybierz kształt");
            System.out.println("1 - prostokąt");
            System.out.println("2 - trójkąt");
            System.out.println("3 - koło");
            System.out.println("4 - wyjście z programu");
            try {

            w = s.nextInt();
            switch (w) {
                case 1 -> calRect();
                case 2 -> calTria();
                case 3 -> calCirc();
                case 4 -> ret = false;
                default -> System.out.println("Wybrano nieistniejący kształt");
            }}catch (InputMismatchException e){
                System.err.println("wpisano zływ format danych, spróbuj ponownie!");
            }finally {
                s.nextLine();
            }
        } while (ret);
        s.close();
    }
}
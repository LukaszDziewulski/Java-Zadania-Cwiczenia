public class Calculate {

    private double add (double x, double y){
        System.out.print("Wynik dzialania to: ");
        System.out.print(x + y);
        return x + y;
    }
    private double minus (double x, double y) {
        System.out.print("Wynik dzialania to: ");
        System.out.print(x - y);
        return x - y;
    }
    private double multiple (double x, double y) {
        System.out.print("Wynik dzialania to: ");
        System.out.print(x * y);
        return x * y;
    }
    private double divide (double x, double y) {
        System.out.print("Wynik dzialania to: ");
        System.out.print(x / y);
        return x / y;
    }

    public double calculate (double x, double y, String znak){
        double result = 0;
        switch (znak){
            case "+" -> result = add(x,y);
            case "-" -> result = minus(x,y);
            case "*" -> result = multiple(x,y);
            case "/" -> result = divide(x,y);
            default -> System.out.println("Wpisano zly znak dzialania!!");

        }
    return result;
    }



}


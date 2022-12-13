public class Main {

    public static void main(String[] args) {
        Tire tire = new Tire(24, "michelin", "debica",
                "23213sa2", 17, 203);
        ExhaustPart exhaustPart = new ExhaustPart(44, "wyd",
                "ax21", "AXC45686", true);

        System.out.println(tire);
        System.out.println(exhaustPart);
    }
}

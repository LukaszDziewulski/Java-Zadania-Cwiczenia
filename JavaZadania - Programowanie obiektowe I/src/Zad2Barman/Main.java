package Zad2Barman;

public class Main {
    public static void main(String[] args) {

        Drink drink = Barman.createDrink("Sok ananasowy", 100
                , "Likier Malibu", 50
                , "Mleko kokosowe", 100);

        Barman.printDrink(drink);
    }
}

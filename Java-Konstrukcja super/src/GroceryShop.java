public class GroceryShop {

    public static void main(String[] args) {
        Apple apple = new Apple(500, "słodka");

        System.out.println(apple.getInfo());

        Fruit fruit = new Fruit(200, "smukła");

        System.out.println(fruit.getInfo());
    }
}

package Barmanv2;

import java.util.Scanner;

public class Barman {

    private static Scanner scanner = new Scanner(System.in);

    public static Drink createDrink(){
        System.out.println("Podaj ilość składników");
        int ingredientsNumber = scanner.nextInt();
        scanner.nextLine();
        Ingredient[] ingredients = new Ingredient[ingredientsNumber];
        for (int i = 0; i < ingredients.length; i++) {
            ingredients[i] = createIngredient();
        }
        return new Drink(ingredients);
    }

    private static Ingredient createIngredient() {
        System.out.println("Podaj nazwę składnika");
        String ingName = scanner.nextLine();
        System.out.println("Podaj ilość składnika");
        double ingAmount = scanner.nextDouble();
        scanner.nextLine();
        return new Ingredient(ingName, ingAmount);
    }

    public static void printDrink(Drink drink) {
        Ingredient[] ingredients = drink.getIngredients();
        System.out.printf("Drink składa się z %d składników:\n", ingredients.length);
        for (Ingredient ingredient : ingredients) {
            System.out.printf(" -%s (%.0f)\n", ingredient.getName(), ingredient.getAmount());
        }
    }
}

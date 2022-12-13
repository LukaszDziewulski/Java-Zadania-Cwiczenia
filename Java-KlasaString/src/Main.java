import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ileWyrazów;

        StringBuilder builder = new StringBuilder();


        System.out.println("Podaj iloś wprowadzanych wyrazów: ");
        ileWyrazów = sc.nextInt();
        sc.nextLine();
        String[] word = new String[ileWyrazów];


        for (int i = 0; i < word.length; i++) {
            System.out.println("podaj słowo");
            word[i] = sc.nextLine();
        }
        for (int i = 0; i < word.length; i++) {
            builder.append(word[i].charAt(word[i].length() - 1));

        }


        System.out.println("nowe słowo to: " + builder.toString());
        sc.close();
    }
}

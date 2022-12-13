public class Main {

    public static void main(String[] args) {


        PersonDatabase database = new PersonDatabase();


        database.add(new Person("AA", "AA", "AA"));
        database.add(new Person("BB", "BB", "BB"));
        database.add(new Person("CC", "CC", "CC"));
        database.add(new Person("DD", "DD", "DD"));


        System.out.println("Osoba w wyznaczonym miejscu tablicy to: " + database.get(2));

        System.out.println(database);


        database.remove(new Person("CC", "CC", "CC"));


        System.out.println(database);
        System.out.println("Osoba w wyznaczonym miejscu tablicy to: " + database.get(2));


    }
}

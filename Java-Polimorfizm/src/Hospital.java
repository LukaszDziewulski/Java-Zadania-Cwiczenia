public class Hospital {

    private static final int MAX_EMPLOYEES = 3;

    static Person[] persons = new Person[MAX_EMPLOYEES];
    static private int workers = 0;

    static public void add(Person person) {
        if (workers < MAX_EMPLOYEES) {
            persons[workers] = person;
            workers++;
        }
    }

    static public String getInfo() {
        System.out.println("Pracownicy szpitala");
        for (Person person : persons) {
            System.out.println(person.getInfo());

        }
        return null;
    }

}

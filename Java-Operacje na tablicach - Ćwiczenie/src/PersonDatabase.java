import java.util.Arrays;

public class PersonDatabase {

    private final int INITIAL_CAPACITY = 1;
    private Person[] persons = new Person[INITIAL_CAPACITY];
    private int emptyPlace = 1;


    public void add(Person p) {
        if (p == null)
            throw new NullPointerException("person cannot be null");

        for (int i = 0; i < emptyPlace; i++) {

            if (persons[i] == null) {
                persons[i] = new Person(p.getFirstName(), p.getLastName(), p.getPESEL());
                System.out.println("Dodano osobę do listy, liczba osob w tablicy: " + size());
            }
        }
        emptyPlace++;
        if (persons[persons.length - 1] != null) {
            persons = Arrays.copyOf(persons, persons.length * 2);
        }
    }

    public void remove(Person p) {
        if (p == null)
            throw new NullPointerException("person cannot be null");
        for (int i = 0; i < persons.length; i++) {

            if (persons[i].equals(p)) {
                for (int j = i; j < persons.length - 1; j++) {
                    persons[j] = persons[j + 1];
                }
                break;
            }
        }
        System.out.println("Usunięto osobę do listy, liczba osob w tablicy: " + size());
    }

    public Person get(int index) throws ArrayIndexOutOfBoundsException {
        if (index >= size() || index < 0)
            throw new ArrayIndexOutOfBoundsException("Index has to be positive and lower than " + emptyPlace);
        return persons[index];
    }

    public int size() {
        int liczbaElementów = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null) {
                liczbaElementów++;
            }
        }
        return liczbaElementów;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonDatabase size: ");
        sb.append(size());
        sb.append("\n");
        for (int i = 0; i < size(); i++) {
            sb.append(" > ");
            sb.append(persons[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}

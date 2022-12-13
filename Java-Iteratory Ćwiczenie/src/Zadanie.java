import java.util.*;

class Main {
    public static void main(String[] args)  {


        TreeMap<String, Person> stringPersonTreeMap = new TreeMap<>();
        stringPersonTreeMap.put("Glapa",new Person("Adam", "Glapa", 32));
        stringPersonTreeMap.put("Ciol",new Person("Zenon", "Ciol", 54));
        stringPersonTreeMap.put("Alaba",new Person("Grzes", "Alaba", 87));
        stringPersonTreeMap.put("Schraiber",new Person("Piotr", "Schraiber", 18));

        Collection<Person> values = stringPersonTreeMap.values();
        System.out.println(values);
        Iterator<Person> numIterator = values.iterator();
        while (numIterator.hasNext()) {
            Person name = numIterator.next();
            System.out.println(name);
            if (name.equals(new Person("Adam","Glapa", 32))) {
                numIterator.remove();
            }
        }
        System.out.println(stringPersonTreeMap);
        System.out.println(values);
    }

}

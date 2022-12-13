

public class SchoolTest {
    public static void main(String[] args) {
        School school = new School(3);
        try {
            school.add(new Student(1,"aaa","kkk"));
            school.add(new Student(2,"bbb","ccc"));
            school.add(new Student(3,"ccc","www"));
            school.add(new Student(3,"ccc","www"));

        } catch (NoMoreSpaceException e) {
            System.err.println("Nie można dodać tylu osób do szkoły");
            System.err.println(e.getMessage());
        }

        try {
            System.out.println("znaleziono:");
            System.out.println(school.find("aaa","kkk"));
            System.out.println(school.find("aa11a","kkk"));
            System.out.println(school.find("aa1231211a","kkk"));

        } catch (NoElementFoundException e) {
            System.err.println(e.getMessage());
        }



    }
}
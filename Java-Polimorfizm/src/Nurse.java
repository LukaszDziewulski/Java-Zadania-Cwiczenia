public class Nurse extends Person {
    private int overtime;

    public Nurse(String firstName, String lastName, int salary, int overtime) {
        super(firstName, lastName, salary);
        this.overtime = overtime;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public String getInfo() {
        return super.getInfo() + ", nadgodziny: " + getOvertime();
    }

}

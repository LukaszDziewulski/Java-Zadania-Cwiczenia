public class Doctor extends Person {

    private int bonus;

    public Doctor(String firstName, String lastName, int salary, int bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getInfo() {
        return super.getInfo() + ", bonus: " + getBonus();
    }

}

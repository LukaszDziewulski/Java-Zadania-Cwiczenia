public class ExhaustPart extends Part {
    private boolean ueStandard;

    public ExhaustPart(int id, String producer, String model, String seriaProduct, boolean ueStandard) {
        super(id, producer, model, seriaProduct);
        this.ueStandard = ueStandard;
    }

    public boolean isUeStandard() {
        return ueStandard;
    }

    public void setUeStandard(boolean ueStandard) {
        this.ueStandard = ueStandard;
    }

    @Override
    public String toString() {
        return "ExhaustPart{" +
                "ueStandard=" + ueStandard +
                ", id=" + getId() +
                ", producer='" + getProducer() + '\'' +
                ", model='" + getModel() + '\'' +
                ", seriaProduct='" + getSeriaProduct() + '\'' +
                '}';
    }
}

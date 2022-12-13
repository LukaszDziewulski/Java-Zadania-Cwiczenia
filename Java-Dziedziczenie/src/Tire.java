public class Tire extends Part {
    private int width;
    private int size;

    public Tire(int id, String producer, String model, String seriaProduct, int width, int size) {
        super(id, producer, model, seriaProduct);
        this.width = width;
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "id=" + getId() +
                ", producer='" + getProducer() + '\'' +
                ", model='" + getModel() + '\'' +
                ", seriaProduct='" + getSeriaProduct() + '\'' +
                ", width=" + width +
                ", size=" + size +
                '}';
    }
}

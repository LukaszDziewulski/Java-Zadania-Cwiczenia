public class Part {
    private int id;
    private String producer;
    private String model;
    private String seriaProduct;


    protected Part(int id, String producer, String model, String seriaProduct) {
        this.id = id;
        this.producer = producer;
        this.model = model;
        this.seriaProduct = seriaProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeriaProduct() {
        return seriaProduct;
    }

    public void setSeriaProduct(String seriaProduct) {
        this.seriaProduct = seriaProduct;
    }

    @Override
    public String toString() {
        return "Part{" +
                "id=" + id +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", seriaProduct='" + seriaProduct + '\'' +
                '}';
    }
}

public class CarTest {

    public static void main(String[] args) throws InterruptedException{

        Car car = new Car();
        car.refuel(40);
        car.go();

        Car.Engine all = new Car.Engine("all");
    }
}

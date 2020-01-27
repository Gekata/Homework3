package main;

public class Travel {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        car.setSpeed(69);
        car.setTime(25.15);
        car.shutDown();
        System.out.println("This car  traveled "
                + car.getDistance()
                + " km in space");
    }
}


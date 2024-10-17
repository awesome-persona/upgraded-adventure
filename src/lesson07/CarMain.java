package lesson07;

public class CarMain {

    public static void main(String[] args) {
        Car car1 = new Car("Black", 1.2, 4,
                "Sedan", false, "Niva", 1990);
        Car car2 = new Car("White", 1.6, 4,
                "SUV", false, "Lada", 2005);
        Car car3 = new Car("Pink", 2.0, 6,
                "Liftback", false, "Icarus", 2020);
        Car car4 = new Car("Red", 1.6, 8,
                "Bus", true, "BMW", 1983);
        Car car5 = new Car("Blue", 3.0, 2,
                "Cabriolet", true, "Kawasaki", 2017);

        Car[] cars = {car1, car2, car3, car4, car5};

        for (Car car : cars) {
            System.out.println(car);
        }

        Car theOldestCar = cars[0];
        for (int i = 0; i < cars.length; i++) {
            if (theOldestCar.getDate() > cars[i].getDate()) {
                theOldestCar = cars[i];
            }
        }

        System.out.println("The Oldest Car is " + theOldestCar);


        for (int i = 0; i < cars.length; i++) {
            cars[i].tryIt();
        }

        System.out.println("Sold cars");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].isSold()) {
                System.out.println(cars[i]);
            }
        }
    }
}

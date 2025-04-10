class Vehicle {
    void run() {
        System.out.println("Vehicle is running.");
    }
}

class Car extends Vehicle {
    void carType() {
        System.out.println("This is a car.");
    }
}

class Bike extends Vehicle {
    void bikeType() {
        System.out.println("This is a bike.");
    }

    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        c.run();
        c.carType();

        b.run();
        b.bikeType();
    }
}

// Define an interface
interface Vehicle1 {
    void start();
}

// Class implementing the interface
class Car implements Vehicle1 {
    public void start() {
        System.out.println("Car is starting with key ignition.");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
    }
}

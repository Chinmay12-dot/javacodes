public class Car {
    // Fields
    String brand;
    int year;

    // Constructor
    public Car(String b, int y) {
        brand = b;
        year = y;
    }

    // Method to display info
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    // Main method
    public static void main(String[] args) {
        // Object initialized using constructor
        Car car1 = new Car("Toyota", 2022);
        Car car2 = new Car("Honda", 2023);

        car1.displayInfo();
        car2.displayInfo();
    }
}

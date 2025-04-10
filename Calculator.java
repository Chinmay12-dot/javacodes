public class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Main method
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add 2 ints: " + calc.add(10, 20));
        System.out.println("Add 3 ints: " + calc.add(5, 15, 25));
        System.out.println("Add 2 doubles: " + calc.add(3.5, 4.5));
    }
}

public class FinallyExample {
    public static void main(String[] args) {
        try {
            // Block of code that may throw an exception
            int a = 10, b = 0;
            int result = a / b;  // Division by zero (ArithmeticException)
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        } finally {
            // This block will execute regardless of exception
            System.out.println("Finally block executed!");
        }

        System.out.println("Program continues after finally block.");
    }
}

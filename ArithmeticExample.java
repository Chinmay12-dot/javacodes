public class ArithmeticExample {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b;  // division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        }
    }
}

public class NumberFormatExample {
    public static void main(String[] args) {
        try {
            String str = "abc";
            int num = Integer.parseInt(str);  // invalid conversion
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormat Exception caught: " + e.getMessage());
        }
    }
}

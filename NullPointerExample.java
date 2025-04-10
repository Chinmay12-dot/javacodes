public class NullPointerExample {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length());  // calling method on null
        } catch (NullPointerException e) {
            System.out.println("NullPointer Exception caught: " + e.getMessage());
        }
    }
}

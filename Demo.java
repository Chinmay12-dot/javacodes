// First interface
interface Printable {
    void print();
}

// Second interface
interface Showable {
    void show();
}

// Class implementing both interfaces
class Demo implements Printable, Showable {
    public void print() {
        System.out.println("Printing something...");
    }

    public void show() {
        System.out.println("Showing something...");
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.print();
        obj.show();
    }
}

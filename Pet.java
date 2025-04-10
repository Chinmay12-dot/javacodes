class Pet {
    void sound() {
        System.out.println("Pet makes a sound");
    }
}

class Cat extends Pet {
    // Overriding the method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }

    public static void main(String[] args) {
        Animal a = new Cat();  // Polymorphism
        a.sound(); // Calls overridden method
    }
}

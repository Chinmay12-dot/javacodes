class Grandparent {
    void displayGrandparent() {
        System.out.println("I am the grandparent.");
    }
}

class Parent extends Grandparent {
    void displayParent() {
        System.out.println("I am the parent.");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("I am the child.");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.displayGrandparent();
        obj.displayParent();
        obj.displayChild();
    }
}

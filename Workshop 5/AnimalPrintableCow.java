interface Animal {
    void eat();
    void walk();
}

interface Printable {
    void display();
}

public class AnimalPrintableCow implements Animal, Printable {
    public void eat() {
        System.out.println("Cow eats grass");
    }

    public void walk() {
        System.out.println("Cow walks on 4 legs");
    }

    public void display() {
        System.out.println("This is a Cow");
    }

    public static void main(String[] args) {
        AnimalPrintableCow c = new AnimalPrintableCow();
        c.eat();
        c.walk();
        c.display();
    }
}
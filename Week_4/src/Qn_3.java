class Animal3 {
    String name;

    Animal3(String name) {
        this.name = name;
    }
}

class Dog3 extends Animal3 {
    Dog3(String name) {
        super(name);
    }

    void display() {
        System.out.println("Dog Name: " + name);
    }
}

public class Qn_3 {
    public static void main(String[] args) {
        Dog3 d = new Dog3("Bruno");
        d.display();
    }
}
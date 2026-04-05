class Parent {
    private int a = 10;
    protected int b = 20;
    public int c = 30;

    void showPrivate() {
        System.out.println("Private: " + a);
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Protected: " + b);
        System.out.println("Public: " + c);
    }
}

public class Qn_5 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.showPrivate();
    }
}
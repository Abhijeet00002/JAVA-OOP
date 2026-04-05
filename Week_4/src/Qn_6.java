final class FinalClass {
    void show() {
        System.out.println("Final class method");
    }
}

class Parent6 {
    final void display() {
        System.out.println("Final method");
    }
}

class Child6 extends Parent6 {
}

public class Qn_6 {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();
    }
}
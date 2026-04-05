class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }
}

public class Qn_7 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 8));
        System.out.println(calc.add(10, 15, 20));
        System.out.println(calc.add(3.5, 2.7));
        System.out.println(calc.add(1.1, 2.2, 3.3));
    }
}
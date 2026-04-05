class Person {
    protected String address;
}

class Employee extends Person {
    String department;

    void setData(String addr, String dept) {
        address = addr;
        department = dept;
    }

    void display() {
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
    }
}

public class Qn_4 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setData("Kathmandu", "IT");
        e.display();
    }
}
import java.util.Scanner;

public class Qn_8 {

    static Scanner sc = new Scanner(System.in);

    static boolean validName(String name) {
        return name.length() > 4;
    }

    static boolean validMobile(String m) {
        return m.matches("0\\d{9}");
    }

    static boolean validPassword(String p) {
        return p.matches("[A-Za-z]+[@&]\\d+");
    }

    static boolean validDOB(String dob) {
        return dob.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    static boolean validAge(String dob) {
        int year = Integer.parseInt(dob.substring(6));
        return (2026 - year) >= 21;
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("1. Sign up");
            System.out.println("2. Quit");

            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 2) {
                System.out.println("Thank you for using the Application.");
                break;
            }

            while (true) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                if (!validName(name)) continue;

                System.out.print("Mobile: ");
                String m = sc.nextLine();
                if (!validMobile(m)) continue;

                System.out.print("Password: ");
                String p = sc.nextLine();
                if (!validPassword(p)) continue;

                System.out.print("Confirm: ");
                String c = sc.nextLine();
                if (!p.equals(c)) continue;

                System.out.print("DOB: ");
                String dob = sc.nextLine();
                if (!validDOB(dob)) continue;

                if (!validAge(dob)) continue;

                System.out.println("Signup Successful!");
                break;
            }
        }
    }
}
import java.awt.*;
import javax.swing.*;
class LoginFrame extends JFrame {

    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;

    LoginFrame() {

        setTitle("Login Form");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(3, 2, 10, 10));

        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");

        add(userLabel);
        add(usernameField);

        add(passLabel);
        add(passwordField);

        add(loginButton);
        add(new JLabel());

        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("admin") && password.equals("admin")) {
                JOptionPane.showMessageDialog(
                        null,
                        "Login Successful"
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Invalid Username or Password"
                );
            }
        });

        setVisible(true);
    }
}

public class Q1 {

    public static void main(String[] args) {

        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

class UserInputFrame extends JFrame {

    JTextField firstNameField, lastNameField, addressField, contactField, semesterField;
    JButton submitButton;

    UserInputFrame() {
        setTitle("User Input Form");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel("First Name:"));
        firstNameField = new JTextField();
        add(firstNameField);

        add(new JLabel("Last Name:"));
        lastNameField = new JTextField();
        add(lastNameField);

        add(new JLabel("Address:"));
        addressField = new JTextField();
        add(addressField);

        add(new JLabel("Contact Number:"));
        contactField = new JTextField();
        add(contactField);

        add(new JLabel("Semester:"));
        semesterField = new JTextField();
        add(semesterField);

        submitButton = new JButton("Submit");
        add(submitButton);
        add(new JLabel());

        submitButton.addActionListener(e -> {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String address = addressField.getText();
            String contact = contactField.getText();
            String semester = semesterField.getText();

            if (firstName.isEmpty() || lastName.isEmpty() || address.isEmpty() || contact.isEmpty() || semester.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields are required!");
                return;
            }

            try (FileWriter writer = new FileWriter("users.csv", true)) {
                writer.append(firstName).append(",")
                      .append(lastName).append(",")
                      .append(address).append(",")
                      .append(contact).append(",")
                      .append(semester).append("\n");
                JOptionPane.showMessageDialog(this, "Data saved to CSV successfully!");
                firstNameField.setText("");
                lastNameField.setText("");
                addressField.setText("");
                contactField.setText("");
                semesterField.setText("");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error writing to file: " + ex.getMessage());
            }
        });

        setVisible(true);
    }
}

public class Q3 {
    public static void main(String[] args) {
        new UserInputFrame();
    }
}

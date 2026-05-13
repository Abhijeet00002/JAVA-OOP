import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q4 extends JFrame {

    public Q4() {
        setTitle("CSV to JTable");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] columns = {"First Name", "Last Name", "Address", "Contact Number", "Semester"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        try (BufferedReader br = new BufferedReader(new FileReader("users.csv"))) {
            br.readLine(); // skip header
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] parts = line.split(",");
                int n = parts.length;
                String firstName = parts[0].trim();
                String lastName = parts[1].trim();
                StringBuilder address = new StringBuilder(parts[2].trim());
                for (int i = 3; i < n - 2; i++) {
                    address.append(",").append(parts[i].trim());
                }
                String contact = parts[n - 2].trim();
                String semester = parts[n - 1].trim();
                model.addRow(new Object[]{firstName, lastName, address.toString(), contact, semester});
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading CSV: " + e.getMessage());
        }

        JTable table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q4();
    }
}

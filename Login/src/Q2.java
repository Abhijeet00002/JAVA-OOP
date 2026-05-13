import javax.swing.*;
import java.awt.*;

public class Q2 extends JFrame {

    public Q2() {
        setTitle("BorderLayout Demo");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));

        JPanel north = new JPanel();
        north.setBackground(Color.RED);
        north.add(new JLabel("North"));
        add(north, BorderLayout.NORTH);

        JPanel south = new JPanel();
        south.setBackground(Color.GREEN);
        south.add(new JLabel("South"));
        add(south, BorderLayout.SOUTH);

        JPanel east = new JPanel();
        east.setBackground(Color.BLUE);
        east.add(new JLabel("East"));
        add(east, BorderLayout.EAST);

        JPanel west = new JPanel();
        west.setBackground(Color.YELLOW);
        west.add(new JLabel("West"));
        add(west, BorderLayout.WEST);

        JPanel center = new JPanel();
        center.setBackground(Color.ORANGE);
        center.add(new JLabel("Center"));
        add(center, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q2();
    }
}

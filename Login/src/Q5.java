import javax.swing.*;
import java.awt.*;

public class Q5 extends JFrame {

    CardLayout cardLayout;
    JPanel cardPanel;

    public Q5() {
        setTitle("CardLayout Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        JPanel card1 = new JPanel();
        card1.setBackground(Color.RED);
        card1.add(new JLabel("This is Card 1 (Red)", SwingConstants.CENTER));

        JPanel card2 = new JPanel();
        card2.setBackground(Color.GREEN);
        card2.add(new JLabel("This is Card 2 (Green)", SwingConstants.CENTER));

        JPanel card3 = new JPanel();
        card3.setBackground(Color.BLUE);
        card3.add(new JLabel("This is Card 3 (Blue)", SwingConstants.CENTER));

        cardPanel.add(card1, "Card1");
        cardPanel.add(card2, "Card2");
        cardPanel.add(card3, "Card3");

        JPanel buttonPanel = new JPanel();
        JButton btn1 = new JButton("Card 1");
        JButton btn2 = new JButton("Card 2");
        JButton btn3 = new JButton("Card 3");

        btn1.addActionListener(e -> cardLayout.show(cardPanel, "Card1"));
        btn2.addActionListener(e -> cardLayout.show(cardPanel, "Card2"));
        btn3.addActionListener(e -> cardLayout.show(cardPanel, "Card3"));

        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        buttonPanel.add(btn3);

        add(cardPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q5();
    }
}

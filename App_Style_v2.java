import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App_Style_v2 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new App_Style_v2().createAndShowGUI();
        });
    }

    public void createAndShowGUI() {

        JFrame frame = new JFrame("Simple CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);


        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);


        JPanel firstPanel = new JPanel();
        firstPanel.setBackground(Color.CYAN);
        JButton nextButton = new JButton("Go to Second Card");

        firstPanel.add(nextButton);


        JPanel secondPanel = new JPanel();
        secondPanel.setBackground(Color.YELLOW);
        JButton backButton = new JButton("Back to First Card");

        secondPanel.add(backButton);


        cardPanel.add(firstPanel, "First");
        cardPanel.add(secondPanel, "Second");


        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Second");
            }
        });


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "First");
            }
        });

        
        frame.add(cardPanel);
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App_Style_v3 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new App_Style_v3().createAndShowGUI();
        });
    }

    public void createAndShowGUI() {

        JFrame frame = new JFrame("버스 어플리케이션");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(760, 520);


        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);


        JPanel firstPanel = new JPanel();
        JTextField text1 = new JTextField(10);
        JButton search1 = new JButton("찾기");

        firstPanel.add(text1);
        firstPanel.add(search1);

        search1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Second");
            }
        });

        JPanel secondPanel = new JPanel();
        secondPanel.setLayout(new BorderLayout());
        JMenuBar menuBar = new JMenuBar();

        JMenu Bus = new JMenu("버스 시간 보기");
        JMenu SchoolMap = new JMenu("버스 지도 보기");
        menuBar.add(Bus);
        menuBar.add(SchoolMap);
        secondPanel.add(menuBar, BorderLayout.NORTH);


        JPanel thirdPanel = new JPanel();


        JPanel fourthPanel = new JPanel();



        cardPanel.add(firstPanel, "First");
        cardPanel.add(secondPanel, "Second");
        cardPanel.add(thirdPanel, "Third");
        cardPanel.add(fourthPanel, "Fourth");





        frame.add(cardPanel);
        frame.setVisible(true);
    }
}

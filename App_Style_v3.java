import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class App_Style_v3 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new App_Style_v3().createAndShowGUI();
        });
    }

    public void createAndShowGUI() {

        JFrame frame = new JFrame("버스 어플리케이션");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(770, 530);

        HashMap<Integer, ArrayList<Integer>> timeSchedule = new HashMap<>();


        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        //1번 패널
        JPanel firstPanel = new JPanel();
        JTextField text1 = new JTextField(10);
        JButton search1 = new JButton("찾기");

        firstPanel.add(text1);
        firstPanel.add(search1);

        search1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try(BufferedReader reader = new BufferedReader(new FileReader(text1.getText()))){
                    String line = reader.readLine();
                    if(line != null) {
                        System.err.println("CSV파일이 비어 있습니다.");
                        return;
                    }
                    while((line = reader.readLine()) != null) {
                        StringTokenizer token = new StringTokenizer(line, ",");

                        int time = Integer.parseInt(token.nextToken().trim());

                        ArrayList<Integer> intervals = new ArrayList<>();
                        while(token.hasMoreTokens()) {
                            intervals.add(Integer.parseInt(token.nextToken().trim()));
                        }

                        timeSchedule.put(time, intervals);
                    }

                } catch (IOException ex) {
                    System.out.println("오류발생!!!!!");
                    ex.printStackTrace();
                }

                cardLayout.show(cardPanel, "Second");

            }
        });

        //2번 패널
        JPanel secondPanel = new JPanel();
        secondPanel.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu watch = new JMenu("시간 및 지도 보기");
        JMenuItem item1 = new JMenuItem("버스 전체 시간표");
        JMenuItem itme2 = new JMenuItem("버스 지도");
        watch.add(item1);
        watch.add(itme2);

        item1.addActionListener(e -> cardLayout.show(cardPanel, "Third"));
        itme2.addActionListener(e -> cardLayout.show(cardPanel, "Fourth"));


        menuBar.add(watch);
        secondPanel.add(menuBar, BorderLayout.NORTH);

        JPanel borderPanel = new JPanel();
        JTextField text2 = new JTextField(10);
        JButton search2 = new JButton("시간 조회");
        borderPanel.add(text2);
        borderPanel.add(search2);
        secondPanel.add(borderPanel, BorderLayout.CENTER);


        //3번 패널
        JPanel thirdPanel = new JPanel(new BorderLayout());
        JPanel northpanel = new JPanel();

        JPanel centerpanel = new JPanel(new GridLayout(2, 1));
        JLabel BusTitle = new JLabel("버스 시간표");
        JPanel BusCell = new JPanel(new GridLayout(10, 2));




        //4번 패널
        JPanel fourthPanel = new JPanel(new BorderLayout());

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setLayout(null);

        ImageIcon schoolmap = new ImageIcon("bucket/schoolMap.jpg");
        JLabel schoolLabel = new JLabel(schoolmap);
        schoolLabel.setBounds(0, 0, 760, 520);
        layeredPane.add(schoolLabel, Integer.valueOf(0));

        JButton out2 = new JButton("이전 화면");

        out2.addActionListener(e -> cardLayout.show(cardPanel, "Second"));
        out2.setBackground(Color.GREEN);
        out2.setBounds(700, 10, 100, 30);

        layeredPane.add(out2, Integer.valueOf(1));

        fourthPanel.add(layeredPane);





        cardPanel.add(firstPanel, "First");
        cardPanel.add(secondPanel, "Second");
        cardPanel.add(thirdPanel, "Third");
        cardPanel.add(fourthPanel, "Fourth");





        frame.add(cardPanel);
        frame.setVisible(true);
    }
}

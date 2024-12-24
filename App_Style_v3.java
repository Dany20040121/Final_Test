import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
        frame.setResizable(false);
        frame.setLocation(450, 200);

        HashMap<Integer, ArrayList<Integer>> timeSchedule = new HashMap<>();


        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        //1번 패널
        JPanel firstPanel = new JPanel();

        JTextField title = new JTextField();
        title.setText("여기에 csv파일 주소를 정확히 적어주세요. ^^");
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        Font font = new Font("Italic", Font.BOLD, 20);
        title.setFont(font);
        title.setEditable(false);
        firstPanel.add(title);

        JTextField text1 = new JTextField(50);
        JButton search1 = new JButton("찾기");
        firstPanel.add(text1);
        firstPanel.add(search1);

        search1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(text1.getText().isEmpty()){
                    text1.setText("주소를 써주세요!!!");
                }
                else{
                    try (BufferedReader reader = new BufferedReader(new FileReader(text1.getText()))) {
                        String line = reader.readLine();
                        if (line == null) {
                            System.err.println("CSV 파일이 비어 있습니다.");
                            return;
                        }

                        while ((line = reader.readLine()) != null) {
                            StringTokenizer token = new StringTokenizer(line, ",");

                            int time = Integer.parseInt(token.nextToken().trim());

                            ArrayList<Integer> intervals = new ArrayList<>();
                            while (token.hasMoreTokens()) {
                                intervals.add(Integer.parseInt(token.nextToken().trim()));
                            }

                            timeSchedule.put(time, intervals);
                        }
                    } catch (IOException ex) {
                        System.out.println("오류발생!!!!");
                        ex.printStackTrace();
                    }
                    cardLayout.show(cardPanel, "Second");
                }
            }
        });

        //2번 패널
        JPanel secondPanel = new JPanel(new BorderLayout());

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

        // 시간 알아보기 창
        JPanel borderPanel = new JPanel();
        JPanel newpanel = new JPanel(new GridLayout(0, 1));
        JLabel title2 = new JLabel("교내 셔틀버스는 학기 중에만 운영하며, 학교버스는 학교행사 지원 시 운행이 불가하오니 참고바랍니다.");
        JLabel title3 = new JLabel("무정차 안내 : 08시 ~ 09시 30분까지는 중문, 대학문화관은 정차하지 않습니다.");
        JLabel title4 = new JLabel("(참고 : 셔틀버스 만차 시 무정차 합니다. 만차 신호는 경적 2번 \"빵\" \"빵\"입니다.)");
        Font font2 = new Font("Italic", Font.BOLD, 15);
        title2.setFont(font2);
        title3.setFont(font2);
        title4.setFont(font2);
        title2.setForeground(Color.RED);
        title3.setForeground(Color.RED);

        JTextField text2 = new JTextField(10);
        text2.setFont(new Font("Italic", Font.BOLD, 15));
        text2.setHorizontalAlignment(SwingConstants.CENTER);
        JButton search2 = new JButton("시간 조회");
        JTextArea textarea = new JTextArea(15, 60);
        textarea.setEditable(false);

        search2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textarea.setText("");
                String inputTimeStr = text2.getText();

                String[] timeParts = inputTimeStr.split(":");
                int inputHour = Integer.parseInt(timeParts[0]);
                int inputMinute = Integer.parseInt(timeParts[1]);

                int inputTimeInMinutes = inputHour * 60 + inputMinute;


                int closestTimeInMinutes = -1;
                int minDifference = Integer.MAX_VALUE;  //  두시간간의 차이 중 가장 작은 차이 저장

                for (Integer time : timeSchedule.keySet()) {
                    ArrayList<Integer> intervals = timeSchedule.get(time);
                    for (Integer interval : intervals) {
                        int busTimeInMinutes = time * 60 + interval; // 버스 출발 시간 (분 단위)

                        int difference = busTimeInMinutes - inputTimeInMinutes;

                        if (difference >= 0 && difference < minDifference) {
                            minDifference = difference;
                            closestTimeInMinutes = busTimeInMinutes;
                        }
                    }
                }

                // 결과 출력
                if (closestTimeInMinutes != -1) {
                    int closestHour = closestTimeInMinutes / 60;
                    int closestMinute = closestTimeInMinutes % 60;

                    textarea.setText("가장 가까운 버스 출발 시간은 " + closestHour + ":" + String.format("%02d", closestMinute) + "입니다.\n" +
                            "버스는 " + minDifference + "분 후에 출발합니다.");

                } else {
                    textarea.setText("입력하신 시간 이후에는 더 이상 출발하는 버스가 없습니다.");
                }
            }
        });

        newpanel.add(title2);
        newpanel.add(title3);
        newpanel.add(title4);
        newpanel.add(text2);
        newpanel.add(search2);
        borderPanel.add(newpanel);
        borderPanel.add(textarea);
        secondPanel.add(borderPanel, BorderLayout.CENTER);


        //3번 패널
        JPanel thirdPanel = new JPanel(new BorderLayout());
        JPanel northpanel = new JPanel();
        JButton out = new JButton("이전 화면");
        out.addActionListener(e -> cardLayout.show(cardPanel, "Second"));
        northpanel.add(out);

        JPanel centerpanel = new JPanel(new GridLayout(2, 1));
        JLabel BusTitle = new JLabel("버스 시간표");

        JPanel BusCell = new JPanel(new GridLayout(0, 2));
        BusCell.add(new JLabel("8시"));
        BusCell.add(new JLabel("10분, 20분, 30분, 40분, 50분"));
        BusCell.add(new JLabel("9시"));
        BusCell.add(new JLabel("0분, 10분, 20분, 30분, 40분, 50분"));
        BusCell.add(new JLabel("10시"));
        BusCell.add(new JLabel("0분, 10분, 30분, 50분"));
        BusCell.add(new JLabel("11시"));
        BusCell.add(new JLabel("10분, 20분, 40분"));
        BusCell.add(new JLabel("12시"));
        BusCell.add(new JLabel("20분, 50분"));
        BusCell.add(new JLabel("13시"));
        BusCell.add(new JLabel("0분, 20분, 40분"));
        BusCell.add(new JLabel("14시"));
        BusCell.add(new JLabel("20분, 40분"));
        BusCell.add(new JLabel("15시"));
        BusCell.add(new JLabel("20분, 40분"));
        BusCell.add(new JLabel("16시"));
        BusCell.add(new JLabel("20분, 40분"));
        BusCell.add(new JLabel("17시"));
        BusCell.add(new JLabel("20분, 40분"));


        centerpanel.add(BusTitle);
        centerpanel.add(BusCell);
        thirdPanel.add(northpanel, BorderLayout.NORTH);
        thirdPanel.add(centerpanel, BorderLayout.CENTER);




        //4번 패널
        JPanel fourthPanel = new JPanel(new BorderLayout());

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setLayout(null);

        ImageIcon schoolmap = new ImageIcon("bucket/schoolMap.jpg");
        JLabel schoolLabel = new JLabel(schoolmap);
        schoolLabel.setBounds(0, 0, 760, 530);
        layeredPane.add(schoolLabel, Integer.valueOf(0));

        JButton out2 = new JButton("이전 화면");
        JButton place0 = new JButton("");
        place0.setBackground(Color.RED);
        JButton place1 = new JButton("");
        place1.setBackground(Color.RED);
        JButton place2 = new JButton("");
        place2.setBackground(Color.RED);
        JButton place3 = new JButton("");
        place3.setBackground(Color.RED);
        JButton place4 = new JButton("");
        place4.setBackground(Color.RED);
        JButton place5 = new JButton("");
        place5.setBackground(Color.RED);

        place0.setBounds(210, 470, 20, 20); //정문
        place1.setBounds(348, 405, 20, 20); //중문
        place2.setBounds(450, 293, 20, 20); //보건대
        place3.setBounds(320, 230, 20, 20); //학생회관
        place4.setBounds(253, 145, 20, 20); //예술대
        place5.setBounds(140, 185, 20, 20); //생활관


        out2.addActionListener(e -> cardLayout.show(cardPanel, "Second"));
        out2.setBackground(Color.GREEN);
        out2.setBounds(650, 5, 100, 30);

        layeredPane.add(out2, Integer.valueOf(1));
        layeredPane.add(place0, Integer.valueOf(1));
        layeredPane.add(place1, Integer.valueOf(1));
        layeredPane.add(place2, Integer.valueOf(1));
        layeredPane.add(place3, Integer.valueOf(1));
        layeredPane.add(place4, Integer.valueOf(1));
        layeredPane.add(place5, Integer.valueOf(1));


        fourthPanel.add(layeredPane);


        cardPanel.add(firstPanel, "First");
        cardPanel.add(secondPanel, "Second");
        cardPanel.add(thirdPanel, "Third");
        cardPanel.add(fourthPanel, "Fourth");


        frame.add(cardPanel);
        frame.setVisible(true);
    }
}

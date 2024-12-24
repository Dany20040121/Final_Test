import javax.swing.*;
import java.awt.*;

public class imgTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image with Buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // 레이어드 패널 생성
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setLayout(null);

        ImageIcon imageIcon = new ImageIcon("bucket/schoolMap.jpg"); // 이미지 경로
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(0, 0, 600, 400); // 이미지 크기를 프레임에 맞춤
        layeredPane.add(imageLabel, Integer.valueOf(0)); // 레이어 0에 추가

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        button1.setBounds(50, 50, 100, 40); // x=50, y=50
        button2.setBounds(200, 50, 100, 40); // x=200, y=50

        layeredPane.add(button1, Integer.valueOf(1)); // 레이어 1에 추가
        layeredPane.add(button2, Integer.valueOf(1)); // 레이어 1에 추가

        frame.add(layeredPane);
        frame.setVisible(true);
    }
}

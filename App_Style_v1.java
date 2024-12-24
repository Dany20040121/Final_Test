import javax.swing.*;

public class App_Style_v1 extends JFrame {
    public App_Style_v1() {
        ImageIcon icon = new ImageIcon("bucket/schoolMap.jpg");
        add(new JLabel(icon));
        setVisible(true);
        setSize(760, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new App_Style_v1();
    }
}

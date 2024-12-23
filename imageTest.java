import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class imageTest extends JFrame implements ActionListener {
    JLabel label;
    public imageTest() {
        setTitle("콤보박스");
        setSize(400, 300);
        String[]animals = {"dog", "cat", "bird"};
        JComboBox<String> animalList = new JComboBox<String>(animals);
        animalList.setSelectedIndex(0);
        animalList.addActionListener(this);

        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        changePicture(animals[animalList.getSelectedIndex()]);
        add(animalList, BorderLayout.NORTH);
        add(label, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox<String> cb = ( JComboBox<String> ) e.getSource();
        String name = (String) cb.getSelectedItem();
        changePicture(name);

    }

    protected void changePicture(String name) {
        ImageIcon icon = new ImageIcon("images/" + name + ".png");
        label.setIcon(icon);
        if(icon != null)
            label.setText(null);
        else
            label.setText("이미지가 발견되지 않았습니다.");
    }

    public static void main(String[] args) {
        new imageTest();
    }



}

import javax.swing.*;
import java.awt.*;
public class GUILabel {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setTitle("Test GUI and Label");
        window.setSize(1600,1000);
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel();
        label1.setText("Java label");
        JLabel label2 = new JLabel();
        label2.setText("Image label");
        ImageIcon img = new ImageIcon("0D070CCA-9A97-45A7-86F9-26171AB25334_1_105_c.jpeg");
        label2.setIcon(img);
        label2.setIconTextGap(100);
        panel.add(label1);
        panel.add(label2);
        panel.setLayout(new FlowLayout (FlowLayout.LEADING,20,20));
        window.add(panel);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
    }
    
}
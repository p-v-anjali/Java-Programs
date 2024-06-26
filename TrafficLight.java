import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLight extends JFrame implements ActionListener {
    private JRadioButton redButton, yellowButton, greenButton;
    private ButtonGroup buttonGroup;
    private JPanel lightPanel1, lightPanel2, lightPanel3;

    public TrafficLight() {
        setTitle("Traffic Light");
        setSize(1000, 1500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(yellowButton);
        buttonGroup.add(greenButton);

        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        lightPanel1 = new JPanel();
        lightPanel1.setBackground(Color.GRAY);

        lightPanel2 = new JPanel();
        lightPanel2.setBackground(Color.GRAY);

        lightPanel3 = new JPanel();
        lightPanel3.setBackground(Color.GRAY);

        add(redButton);
        add(lightPanel1);
        add(yellowButton);
        add(lightPanel2);
        add(greenButton);
        add(lightPanel3);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            lightPanel1.setBackground(Color.RED);
            lightPanel2.setBackground(Color.black);
            lightPanel3.setBackground(Color.black);

        } else if (e.getSource() == yellowButton) {
            lightPanel1.setBackground(Color.black);
            lightPanel2.setBackground(Color.YELLOW);
            lightPanel3.setBackground(Color.black);
        } else if (e.getSource() == greenButton) {
            lightPanel1.setBackground(Color.black);
            lightPanel2.setBackground(Color.black);
            lightPanel3.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new TrafficLight();
    }
}

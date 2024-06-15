import javax.swing.*;
import java.awt.event.*;

class CalculatorDemo implements ActionListener {
    JFrame f;
    JTextField t; 
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bAdd, bSub, bMul, bDiv, bEqual, bClear;
    double a = 0, b = 0, result = 0;
    int operator = 0;

    CalculatorDemo() {
        f = new JFrame("Calculator");
        t = new JTextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");

        bAdd = new JButton("+");
        bSub = new JButton("-");
        bMul = new JButton("*");
        bDiv = new JButton("/");
        bEqual = new JButton("=");
        bClear = new JButton("Clear");

        t.setBounds(30, 40, 280, 30); 

        b1.setBounds(40, 100, 50, 40);
        b2.setBounds(110, 100, 50, 40);
        b3.setBounds(180, 100, 50, 40); 
        bAdd.setBounds(250, 100, 50, 40);

        b4.setBounds(40, 160, 50, 40);
        b5.setBounds(110, 160, 50, 40);
        b6.setBounds(180, 160, 50, 40);
        bSub.setBounds(250, 160, 50, 40);

        b7.setBounds(40, 220, 50, 40);
        b8.setBounds(110, 220, 50, 40);
        b9.setBounds(180, 220, 50, 40);
        bDiv.setBounds(250, 220, 50, 40);

        b0.setBounds(40, 280, 50, 40);
        bClear.setBounds(110, 280, 50, 40);
        bEqual.setBounds(180, 280, 50, 40);
        bMul.setBounds(250, 280, 50, 40);

        f.add(t);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bAdd);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bSub);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bDiv);
        f.add(b0);
        f.add(bClear);
        f.add(bEqual);
        f.add(bMul);
        
        f.setSize(350, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bMul.addActionListener(this);
        bDiv.addActionListener(this);
        bClear.addActionListener(this);
        bEqual.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            t.setText(t.getText().concat("1"));
        } 
        else if (e.getSource() == b2) {
            t.setText(t.getText().concat("2"));
        } 
        else if (e.getSource() == b3) {
            t.setText(t.getText().concat("3"));
        }
         else if (e.getSource() == b4) {
            t.setText(t.getText().concat("4"));
        }
         else if (e.getSource() == b5) {
            t.setText(t.getText().concat("5"));
        } 
        else if (e.getSource() == b6) {
            t.setText(t.getText().concat("6"));
        } 
        else if (e.getSource() == b7) {
            t.setText(t.getText().concat("7"));
        } 
        else if (e.getSource() == b8) {
            t.setText(t.getText().concat("8"));
        } 
        else if (e.getSource() == b9) {
            t.setText(t.getText().concat("9"));
        } 
        else if (e.getSource() == b0) {
            t.setText(t.getText().concat("0"));

        } else if (e.getSource() == bAdd) {
            a = Double.parseDouble(t.getText()); 
            operator = 1;
            t.setText("");
        } 
        else if (e.getSource() == bSub) {
            a = Double.parseDouble(t.getText());
            operator = 2;
            t.setText("");
        } 
        else if (e.getSource() == bMul) {
            a = Double.parseDouble(t.getText());
            operator = 3;
            t.setText("");
        } 
        else if (e.getSource() == bDiv) {
            a = Double.parseDouble(t.getText());
            operator = 4;
            t.setText("");
        } 
        else if (e.getSource() == bClear) {
            t.setText("");
        } 
        else if (e.getSource() == bEqual) {
            b = Double.parseDouble(t.getText());
            switch (operator) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a * b;
                    break;
                case 4:
                    result = a / b;
                    break;
                default:
                    result = 0;
            }
            t.setText(Double.toString(result));
            operator = 0;
            a = 0;
            b = 0;
            result = 0;
        }

    }

    public static void main(String[] args) {
        CalculatorDemo c = new CalculatorDemo();
    }
}


package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcForm extends JFrame{
    private JTextField inputTextField;
    private JButton butt0, butt1, butt2, butt3, butt4, butt5, butt6, butt7, butt8, butt9; //buttons 1 - 9
    private JButton add, subtract, divide, multiply, modulus, decimalPt, clearAll, equal, backspace; //buttons for simple math fxns
    private JPanel panel;

    public CalcForm() {
        butt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String display = inputTextField.getText() + butt1.getText();
                inputTextField.setText(display);
            }
        });

        butt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String display = inputTextField.getText() + butt2.getText();
                inputTextField.setText(display);
            }
        });

        butt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String display = inputTextField.getText() + butt3.getText();
                inputTextField.setText(display);
            }
        });

        butt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String display = inputTextField.getText() + butt4.getText();
                inputTextField.setText(display);
            }
        });

        butt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String display = inputTextField.getText() + butt5.getText();
                inputTextField.setText(display);
            }
        });

        butt6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String display = inputTextField.getText() + butt6.getText();
                inputTextField.setText(display);
            }
        });

        butt7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String display = inputTextField.getText() + butt7.getText();
                inputTextField.setText(display);
            }
        });

        butt8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String display = inputTextField.getText() + butt8.getText();
                inputTextField.setText(display);
            }
        });

        butt9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String display = inputTextField.getText() + butt9.getText();
                inputTextField.setText(display);
            }
        });

        butt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String display = inputTextField.getText() + butt0.getText();
                inputTextField.setText(display);
            }
        });
    }
}

package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcForm extends JFrame{
    private double firstNum;
    private double secondNum;
    private double result;
    private String currOp;

    private JTextField inputTextField;
    private JButton butt0, butt1, butt2, butt3, butt4, butt5, butt6, butt7, butt8, butt9; //buttons 1 - 9
    private JButton add, subtract, divide, multiply, modulus, decimalPt, clearAll, equal, backspace; //buttons for simple math fxns
    private JPanel mainPanel;

    public CalcForm() {
        //actions for number buttons
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

        //action for clear button
        clearAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputTextField.setText("");
            }
        });

        //action for math operation buttons
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum = Double.parseDouble(inputTextField.getText());
                inputTextField.setText("");
                currOp = "+";
            }
        });

        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum = Double.parseDouble(inputTextField.getText());
                inputTextField.setText("");
                currOp = "-";
            }
        });

        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum = Double.parseDouble(inputTextField.getText());
                inputTextField.setText("");
                currOp = "*";
            }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum = Double.parseDouble(inputTextField.getText());
                inputTextField.setText("");
                currOp = "/";
            }
        });

        modulus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum = Double.parseDouble(inputTextField.getText());
                inputTextField.setText("");
                currOp = "%";
            }
        });

        //action to add a decimal point
        decimalPt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String display = inputTextField.getText() + decimalPt.getText();
                inputTextField.setText(display);
            }
        });


        //action for the equal button
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondNum = Double.parseDouble(inputTextField.getText());
                switch (currOp) {
                    case "+":
                        result = firstNum + secondNum;
                        break;
                    case "-":
                        result = firstNum - secondNum;
                        break;
                    case "*":
                        result = firstNum*secondNum;
                        break;
                    case "/":
                        result = firstNum/secondNum;
                        break;
                    case "%":
                        result = firstNum%secondNum;
                        break;
                }
                inputTextField.setText(String.format("%.0f", result));
            }
        });

        backspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputTextField.getText().length() != 0) {
                    String display = inputTextField.getText();
                    inputTextField.setText(display.substring(0, display.length() - 1));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Calculator");
        mainFrame.setContentPane(new CalcForm().mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

}

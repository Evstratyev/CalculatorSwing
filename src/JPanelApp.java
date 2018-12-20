import javax.swing.*;
import java.awt.*;

public class JPanelApp extends JPanel {
    private JTextField outputTextField;
    private double value1 = 0;
    private double value2 = 0;
    private String op = "";
    private MathOperations mathOperations = new MathOperations();

    public JPanelApp() {
        try {

            JButton button0 = new JButton("0");
            JButton button1 = new JButton("1");
            JButton button2 = new JButton("2");
            JButton button3 = new JButton("3");
            JButton button4 = new JButton("4");
            JButton button5 = new JButton("5");
            JButton button6 = new JButton("6");
            JButton button7 = new JButton("7");
            JButton button8 = new JButton("8");
            JButton button9 = new JButton("9");
            JButton buttonPoint = new JButton(".");
            JButton buttonEqual = new JButton("=");
            JButton buttonPlus = new JButton("+");
            JButton buttonMinus = new JButton("-");
            JButton buttonMultiplication = new JButton("*");
            JButton buttonDivision = new JButton("/");
            JButton buttonClearAll = new JButton("AC");
            JButton buttonRoot = new JButton("√");
            JButton buttonPercent = new JButton("%");
            JButton buttonClear = new JButton("←");

            BorderLayout bl = new BorderLayout();
            setLayout(bl);

            outputTextField = new JTextField(1);
            add("North", outputTextField);
            outputTextField.setPreferredSize(new Dimension(0, 40));
            outputTextField.setFont(new Font("SansSerif", Font.BOLD, 22));

            JPanel p1 = new JPanel();
            GridLayout gl = new GridLayout(5, 3);
            p1.setLayout(gl);

            p1.add(buttonClearAll);
            p1.add(buttonRoot);
            p1.add(buttonPercent);

            p1.add(button7);
            p1.add(button8);
            p1.add(button9);

            p1.add(button4);
            p1.add(button5);
            p1.add(button6);

            p1.add(button1);
            p1.add(button2);
            p1.add(button3);

            p1.add(button0);
            p1.add(buttonPoint);
            p1.add(buttonClear);

            JPanel p2 = new JPanel();
            GridLayout gl2 = new GridLayout(5, 1);
            p2.setLayout(gl2);
            p2.setPreferredSize(new Dimension(60, 400));

            p2.add(buttonPlus);
            p2.add(buttonMinus);
            p2.add(buttonMultiplication);
            p2.add(buttonDivision);
            p2.add(buttonEqual);
            buttonEqual.setBackground(Color.ORANGE);
            buttonPlus.setBackground(Color.PINK);
            buttonMinus.setBackground(Color.PINK);
            buttonMultiplication.setBackground(Color.PINK);
            buttonDivision.setBackground(Color.PINK);

            add("Center", p1);
            add("East", p2);

            button0.addActionListener(arg1 -> {
                outputTextField.setText(outputTextField.getText() + 0);
                if (value1 == 0) {
                    value1 = Double.valueOf(outputTextField.getText());
                } else {
                    value2 = Double.valueOf(outputTextField.getText());
                }
            });

            button1.addActionListener(arg1 -> {
                outputTextField.setText(outputTextField.getText() + 1);
                if (value1 == 0) {
                    value1 = Double.valueOf(outputTextField.getText());
                } else {
                    value2 = Double.valueOf(outputTextField.getText());
                }
            });

            button2.addActionListener(arg1 -> {
                outputTextField.setText(outputTextField.getText() + 2);
                if (value1 == 0) {
                    value1 = Double.valueOf(outputTextField.getText());
                } else {
                    value2 = Double.valueOf(outputTextField.getText());
                }
            });

            button3.addActionListener(arg1 -> {
                outputTextField.setText(outputTextField.getText() + 3);
                if (value1 == 0) {
                    value1 = Double.valueOf(outputTextField.getText());
                } else {
                    value2 = Double.valueOf(outputTextField.getText());
                }
            });

            button4.addActionListener(arg1 -> {
                outputTextField.setText(outputTextField.getText() + 4);
                if (value1 == 0) {
                    value1 = Double.valueOf(outputTextField.getText());
                } else {
                    value2 = Double.valueOf(outputTextField.getText());
                }
            });

            button5.addActionListener(arg1 -> {
                outputTextField.setText(outputTextField.getText() + 5);
                if (value1 == 0) {
                    value1 = Double.valueOf(outputTextField.getText());
                } else {
                    value2 = Double.valueOf(outputTextField.getText());
                }
            });

            button6.addActionListener(arg1 -> {
                outputTextField.setText(outputTextField.getText() + 6);
                if (value1 == 0) {
                    value1 = Double.valueOf(outputTextField.getText());
                } else {
                    value2 = Double.valueOf(outputTextField.getText());
                }
            });

            button7.addActionListener(arg1 -> {
                outputTextField.setText(outputTextField.getText() + 7);
                if (value1 == 0) {
                    value1 = Double.valueOf(outputTextField.getText());
                } else {
                    value2 = Double.valueOf(outputTextField.getText());
                }
            });

            button8.addActionListener(arg1 -> {
                outputTextField.setText(outputTextField.getText() + 8);
                if (value1 == 0) {
                    value1 = Double.valueOf(outputTextField.getText());
                } else {
                    value2 = Double.valueOf(outputTextField.getText());
                }
            });

            button9.addActionListener(arg1 -> {
                outputTextField.setText(outputTextField.getText() + 9);
                if (value1 == 0) {
                    value1 = Double.valueOf(outputTextField.getText());
                } else {
                    value2 = Double.valueOf(outputTextField.getText());
                }
            });

            buttonPoint.addActionListener(arg1 -> {
                String s = outputTextField.getText();

                if (!s.contains(".")){
                    if (!outputTextField.getText().equals("")){
                        outputTextField.setText(outputTextField.getText() + ".");
                    }
                }
            });

            buttonPlus.addActionListener(arg1 -> {
                value1 = Double.valueOf(outputTextField.getText());
                outputTextField.setText("");
                op = "+";
            });

            buttonMinus.addActionListener(arg1 -> {
                value1 = Double.valueOf(outputTextField.getText());
                outputTextField.setText("");
                op = "-";
            });

            buttonMultiplication.addActionListener(arg1 -> {
                value1 = Double.valueOf(outputTextField.getText());
                outputTextField.setText("");
                op = "*";
            });

            buttonDivision.addActionListener(arg1 -> {
                value1 = Double.valueOf(outputTextField.getText());
                outputTextField.setText("");
                op = "/";
            });

            buttonClearAll.addActionListener(arg1 -> {
                outputTextField.setText("");
                value1 = 0;
                value2 = 0;
            });

            buttonClear.addActionListener(arg1 -> {
                String s = outputTextField.getText();
                if (s.length() > 0) {
                    s = s.substring(0, s.length() - 1);
                    outputTextField.setText(s);
                }
            });

            buttonPercent.addActionListener(arg1 -> {
                outputTextField.setText(String.valueOf(
                        mathOperations.percent(
                                Double.valueOf(outputTextField.getText()))));
            });

            buttonEqual.addActionListener(arg0 -> {
                double num = value1;
                double num1 = value2;
                String strOp = op;

                String strRes = String.valueOf(mathOperations.calculate(num, strOp, num1));
                outputTextField.setText(strRes);

            });

            buttonRoot.addActionListener(arg1 -> {
                outputTextField.setText(String.valueOf(
                        mathOperations.root(
                                Double.valueOf(outputTextField.getText()))));
            });

        } catch (ArithmeticException exception) {
            //System.out.println("Can not divide by zero ");
        }
    }
}

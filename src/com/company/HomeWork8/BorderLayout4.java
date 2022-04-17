package com.company.HomeWork8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BorderLayout4 extends JFrame {

    private int counter = 0;


    public BorderLayout4() {
        setTitle("CounterApp window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 250, 120);

        Font font = new Font("Arial", Font.BOLD, 30);

        JLabel counterView = new JLabel(String.valueOf(counter));
        counterView.setHorizontalAlignment(SwingConstants.CENTER);
        counterView.setFont(font);
        add(counterView, BorderLayout.CENTER);

        JButton incrementButton = new JButton(">");
        add(incrementButton, BorderLayout.LINE_END);
        JButton decrementButton = new JButton("<");
        add(decrementButton, BorderLayout.LINE_START);

        JButton incrementButton1 = new JButton("+10");
        add(incrementButton1, BorderLayout.NORTH);
        JButton decrementButton1 = new JButton("-10");
        add(decrementButton1, BorderLayout.SOUTH);

        setLayout(new FlowLayout());
        JButton zero = new JButton();
        for (int i = 1; i <= 1; i++) add(zero = new JButton("Обнуление"));

        JButton finalZero = zero;
        ActionListener actionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == incrementButton) {
                    counter++;
                } if (e.getSource() == decrementButton) {
                    counter--;
                }
                if (e.getSource() == incrementButton1){
                    counter = counter + 10;
                }
                if (e.getSource() == decrementButton1){
                    counter = counter - 10;
                }
                if (e.getSource() == finalZero){
                    counter = 0;
                }
                refreshCounterView(counterView);
            }
        };

        decrementButton.addActionListener(actionListener);
        incrementButton.addActionListener(actionListener);
        decrementButton1.addActionListener(actionListener);
        incrementButton1.addActionListener(actionListener);
        finalZero.addActionListener(actionListener);


        setVisible(true);
    }

    private void refreshCounterView(JLabel counterView) {
        counterView.setText(String.valueOf(counter));
    }

    public static void main(String[] args) {
        new BorderLayout4();
    }
}
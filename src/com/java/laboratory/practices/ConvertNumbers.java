package com.java.laboratory.practices;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertNumbers {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Number Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputField = new JTextField(10);
        JButton processButton = new JButton("Process");

        processButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputValue = inputField.getText();
                if (!inputValue.isEmpty()) {
                    try {
                        int convertedInputToInt = Integer.parseInt(inputValue);
                        System.out.println("Input was: " + inputValue);
                        System.out.println("Binary: " + Integer.toBinaryString(convertedInputToInt));
                        System.out.println("Octal: " + Integer.toOctalString(convertedInputToInt));
                        System.out.println("Hexadecimal: " + Integer.toHexString(convertedInputToInt));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Error occurred. Please enter a valid number.",
                                "Exception thrown", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(inputField);
        frame.getContentPane().add(processButton);

        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}

package com.basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameBuilt extends JFrame {

    private JTextArea textArea;
    private JButton btn1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;


    public FrameBuilt() {
        super("Hello World");

        setLayout(new BorderLayout());

        textArea = new JTextArea();
        btn1 = new JButton("Click Me");
        textField1 = new JTextField("EAST");
        textField2 = new JTextField("WEST");
        textField3 = new JTextField("NORTH");

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Hello\n");
            }
        });

        add(textArea, BorderLayout.CENTER);
        add(btn1, BorderLayout.SOUTH);
        add(textField1, BorderLayout.EAST);
        add(textField2, BorderLayout.WEST);
        add(textField3, BorderLayout.NORTH);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

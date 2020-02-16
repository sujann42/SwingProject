package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameComponents extends JFrame {

    private JButton btn;
    private TextPanel textPanel;
    private ClickButton eastButton;
    private Toolbar toolbar;

    public FrameComponents() {
        super("Hello World");
        setLayout(new BorderLayout());

        toolbar = new Toolbar();
        btn = new JButton("Click Me");
        textPanel = new TextPanel();
        eastButton = new ClickButton();

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //call the method that should get executed on the click of the button.
                textPanel.appendText("This si the appended text\n");
            }
        });
        eastButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.appendText("Appended from the east side button.\n");
            }
        });

        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        add(eastButton, BorderLayout.EAST);


        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

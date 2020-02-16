package components;

import javax.swing.*;
import java.awt.*;

public class Toolbar extends JPanel {

    private JButton helloButton;
    private JButton byeButton;

    public Toolbar() {
        helloButton = new JButton("Hello");
        byeButton = new JButton("Good Bye");

        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(helloButton);
        add(byeButton);

    }
}

package components;

import javax.swing.*;
import java.awt.*;

public class ClickButton extends JButton {

    private JLabel label;

    public ClickButton(){
        label = new JLabel("East side button");
        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
    }

}

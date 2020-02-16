package components;

import javax.swing.*;
import java.awt.*;

//Toolbar class extends JPanel class
public class Toolbar extends JPanel {

    private JButton helloButton;
    private JButton byeButton;

    public Toolbar() {
        //creating buttons
        helloButton = new JButton("Hello");
        byeButton = new JButton("Good Bye");

        //creating a layout => [FLOWLAYOUT container]
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        //adding all the buttons to the container.
        add(helloButton);
        add(byeButton);

    }
}

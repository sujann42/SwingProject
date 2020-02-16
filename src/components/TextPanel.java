package components;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {

    private JTextArea textArea;

    public TextPanel() {
        textArea = new JTextArea();
        setLayout(new BorderLayout());

        /*This will provide text area to the frame.*/
        //add(textArea, BorderLayout.CENTER);

        /*This will provide a scroll pane to the text area.*/
        add(new JScrollPane(textArea), BorderLayout.CENTER);

    }

    public void appendText(String text) {
        textArea.append(text);

    }
}

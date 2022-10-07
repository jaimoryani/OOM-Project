package Project;

import javax.swing.*;
import java.awt.*;
public class threeDPanel extends JPanel {
    JButton rc=new JButton("Rotate Clockwise");
    JButton rac=new JButton("Rotate AntiClockwise");
    JButton change=new JButton("Change Color");
    threeDPanel(){
        setLayout(new FlowLayout());
        this.add(rc);
        this.add(rac);
        this.add(change);
    }
}

package Project;

import javax.swing.*;
import java.awt.*;

public class twoDPanel extends JPanel {
    JButton rc=new JButton("Rotate Clockwise");
    JButton rac=new JButton("Rotate AntiClockwise");
    JButton change=new JButton("Change Color");
    twoDPanel(){
        setLayout(new FlowLayout());
        this.add(rc);
        this.add(rac);
        this.add(change);
    }

}

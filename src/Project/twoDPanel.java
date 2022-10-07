package Project;

import javax.swing.*;
import java.awt.*;

public class twoDPanel extends JPanel {
    JButton rc=new JButton("Rotate Clockwise");
    JButton rac=new JButton("Rotate AntiClockwise");
    JButton change=new JButton("Change Color");
    final ShapeList2D shape2= new ShapeList2D();
    twoDPanel(){
        setLayout(new FlowLayout());
        this.add(rc);
        this.add(rac);
        this.add(change);
    }

}

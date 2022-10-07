package Project;

import javax.swing.*;
import java.awt.*;
public class threeDPanel extends JPanel {
    int index;
    JButton rc=new JButton("Rotate Clockwise");
    JButton rac=new JButton("Rotate AntiClockwise");
    JButton change=new JButton("Change Color");
    threeDPanel(){
        setLayout(new FlowLayout());
        this.add(rc);
        this.add(rac);
        this.add(change);
    }
    public void getShapeIndex(int index){
        this.index = index;
    }
}

package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class twoDPanel extends JPanel {
    int index;
    JButton rc=new JButton("Rotate Clockwise");
    JButton rac=new JButton("Rotate AntiClockwise");
    JButton change=new JButton("Change Color");
    final ShapeList2D shape2= new ShapeList2D();
    twoDPanel(){
        setLayout(new FlowLayout());
        rc.addActionListener(new EventHandler2D());
        rac.addActionListener(new EventHandler2D());
        change.addActionListener(new EventHandler2D());
        this.add(rc);
        this.add(rac);
        this.add(change);
    }
    public void getShapeIndex(int index){
        this.index=index;
    }
    public void paint(Graphics g){

    }
}
class EventHandler2D implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

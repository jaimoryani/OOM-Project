package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

public class twoDPanel extends JPanel {
    int index;
    JButton rc=new JButton("Rotate Clockwise");
    JButton rac=new JButton("Rotate AntiClockwise");
    JButton change=new JButton("Change Color");
    final Shape2D shape2= new Shape2D();
    double angle;
    void adder(){
        rc.addActionListener(new EventHandler2D());
        rac.addActionListener(new EventHandler2D());
        change.addActionListener(new EventHandler2D());
        this.add(rc);
        this.add(rac);
        this.add(change);

    }
    twoDPanel(int index){
        setLayout(new FlowLayout());
        this.index=index;
        this.repaint();
    }
    public void paint(Graphics g){
        Graphics2D g1 = (Graphics2D)g;
        AffineTransform trans = new AffineTransform();
        trans.rotate(angle,250,250);
        g1.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
        Shape rotatedShape =null;
        shape2.circle = new Ellipse2D.Double(100.0d,100.0d,100,100.0d);
        shape2.ellipse = new Ellipse2D.Double(100.0d,100.0d,100.0d,50.0d);
        shape2.square = new Rectangle(300,300,100,100);
        shape2.rectangle = new Rectangle(300,300,100,50);
        shape2.triangle = new Polygon(new int[] {400,500,500},new int[] {250,225,275},3);
        rotatedShape=trans.createTransformedShape(shape2.circle);
        g1.fill(rotatedShape);

    }
}
class EventHandler2D implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

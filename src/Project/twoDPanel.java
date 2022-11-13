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
    Color color=new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
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
    }
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g1 = (Graphics2D)g;
        AffineTransform trans = new AffineTransform();
        g1.setColor(color);
        Shape rotatedShape;
        java.awt.Rectangle temp=this.getBounds();
        int h=temp.height;
        int w=temp.width;
        trans.rotate(angle,(float)h/2,(float)w/2);
        shape2.circle = new Ellipse2D.Double(h/4.0,w/4.0,100.0d,100.0d);
        shape2.ellipse = new Ellipse2D.Double(h/4.0,w/4.0,100.0d,50.0d);
        shape2.square = new Rectangle(h/4,w/4,100,100);
        shape2.rectangle = new Rectangle(h/4,w/4,100,50);
        shape2.triangle = new Polygon(new int[] {350,450,450},new int[] {200,175,225},3);
        shape2.t1 = new Polygon(new int[] { 525, 575, 550 }, new int[] { 225, 225, 175 }, 3);
        shape2.t2 = new Polygon(new int[] { 575, 575, 625 }, new int[] { 225, 275, 250 }, 3);
        shape2.t3 = new Polygon(new int[] { 575, 525, 550 }, new int[] { 275, 275, 325 }, 3);
        shape2.t4 = new Polygon(new int[] { 525, 525, 475 }, new int[] { 275, 225, 250 }, 3);
        shape2.rect = new Rectangle(525, 225, 50, 50);
        if(index == 0) {
            int R = (int)(Math.random()*256);
            int G = (int)(Math.random()*256);
            int B= (int)(Math.random()*256);
            Color color = new Color(R, G, B);
            g1.setColor(color);
            rotatedShape = trans.createTransformedShape(shape2.square);
            g1.fill(rotatedShape);
        }

        if(index == 1) {
            Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
            g1.setColor(color);
            rotatedShape = trans.createTransformedShape(shape2.rectangle);
            g1.fill(rotatedShape);
        }

        if(index == 2) {
            Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
            g1.setColor(color);
            rotatedShape = trans.createTransformedShape(shape2.circle);
            g1.fill(rotatedShape);
        }

        if(index == 3) {
            Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
            g1.setColor(color);
            rotatedShape = trans.createTransformedShape(shape2.triangle);
            g1.fill(rotatedShape);
        }

        if(index == 4) {
            Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
            g1.setColor(color);
            rotatedShape = trans.createTransformedShape(shape2.ellipse);
            g1.fill(rotatedShape);
        }


        if(index == 5) {
            rotatedShape = trans.createTransformedShape(shape2.t1);
            Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
            g1.setColor(color);
            g1.fill(rotatedShape);

            rotatedShape = trans.createTransformedShape(shape2.t2);
            g1.setColor(color);
            g1.fill(rotatedShape);

            rotatedShape = trans.createTransformedShape(shape2.t3);
            g1.setColor(color);
            g1.fill(rotatedShape);

            rotatedShape = trans.createTransformedShape(shape2.t4);
            g1.setColor(color);
            g1.fill(rotatedShape);

            rotatedShape = trans.createTransformedShape(shape2.rect);
            g1.setColor(color);
            g1.fill(rotatedShape);
        }
    }

    class EventHandler2D implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
                if (e.getSource() == rc) {
                    color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
                    angle += 0.1;
                }

                if (e.getSource() == rac) {
                    color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
                    angle -= 0.1;
                }
                if (e.getSource() == change) {
                    color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
                }
                repaint();
        }
    }
}


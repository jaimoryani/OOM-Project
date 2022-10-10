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
    Color color=Color.RED,color1,color2;
    int button_pressed,color_button_pressed;
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
        Shape rotatedShape;
        shape2.circle = new Ellipse2D.Double(100.0d,100.0d,100,100.0d);
        shape2.ellipse = new Ellipse2D.Double(100.0d,100.0d,100.0d,50.0d);
        shape2.square = new Rectangle(300,300,100,100);
        shape2.rectangle = new Rectangle(300,300,100,50);
        shape2.triangle = new Polygon(new int[] {400,500,500},new int[] {250,225,275},3);
        shape2.t1 = new Polygon(new int[] { 425, 475, 450 }, new int[] { 275, 275, 225 }, 3);
        shape2.t2 = new Polygon(new int[] { 475, 475, 525 }, new int[] { 275, 325, 300 }, 3);
        shape2.t3 = new Polygon(new int[] { 475, 425, 450 }, new int[] { 325, 325, 375 }, 3);
        shape2.t4 = new Polygon(new int[] { 425, 425, 375 }, new int[] { 325, 275, 300 }, 3);
        shape2.rect = new Rectangle(425, 275, 50, 50);
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
            rotatedShape = trans.createTransformedShape(shape2.ellipse);
            g1.fill(rotatedShape);
        }

        if(index == 2) {
            Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
            g1.setColor(color);
            rotatedShape = trans.createTransformedShape(shape2.triangle);
            g1.fill(rotatedShape);
        }

        if(index == 3) {
            Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
            g1.setColor(color);
            rotatedShape = trans.createTransformedShape(shape2.rectangle);
            g1.fill(rotatedShape);
        }

        if(index == 4) {
            Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
            g1.setColor(color);
            rotatedShape = trans.createTransformedShape(shape2.circle);
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
            if(e.getSource() == rc) {
                color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
                angle += 0.1;
                button_pressed++;
            }

            if(e.getSource() == rac) {
                color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
                angle -= 0.1;
                button_pressed++;
            }
            if(e.getSource() == change) {
                color_button_pressed++;

                if(color_button_pressed % 2 == 0) {
                    color1 = Color.cyan;
                    color2 = Color.green;
                }
                if(color_button_pressed % 2 != 0) {
                    color1 = Color.red;
                    color2 = Color.magenta;
                }
            }
            //setLayout(null);
            repaint();
        }
    }
}


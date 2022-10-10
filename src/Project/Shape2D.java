package Project;
import java.awt.Shape;
import java.awt.Polygon;
import java.awt.Rectangle;

public class Shape2D {
    String name;
    final int dimension=2;
    Shape rectangle , circle, square, triangle, ellipse, star;
    Polygon t1,t2,t3,t4;
    Rectangle rect;
    Shape2D(){}
    Shape2D(String name){
        this.name=name;
    }
}

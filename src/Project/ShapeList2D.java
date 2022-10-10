package Project;

import java.util.Vector;

public class ShapeList2D {
    Vector<Shape2D> shape2DS = new Vector<>();
    Shape2D square;
    Shape2D rectangle;
    Shape2D circle;
    Shape2D triangle;
    Shape2D ellipse;
    Shape2D star;

    ShapeList2D(){
        square = new Shape2D("Square");
        rectangle = new Shape2D("Rectangle");
        circle = new Shape2D("Circle");
        triangle = new Shape2D("Triangle");
        ellipse = new Shape2D("Ellipse");
        star = new Shape2D("Star");
        shape2DS.add(square);
        shape2DS.add(rectangle);
        shape2DS.add(circle);
        shape2DS.add(triangle);
        shape2DS.add(ellipse);
        shape2DS.add(star);

    }
}

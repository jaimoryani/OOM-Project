package Project;

import java.util.Vector;

public class ShapeList3D {
    Vector<Shape3D> shape3DS = new Vector<>();
    Shape3D cube;
    Shape3D sphere;
    Shape3D cylinder;

    ShapeList3D(){
        cube = new Shape3D("Cube");
        sphere = new Shape3D("Sphere");
        cylinder = new Shape3D("Cylinder");
        shape3DS.add(cube);
        shape3DS.add(sphere);
        shape3DS.add(cylinder);

    }

}

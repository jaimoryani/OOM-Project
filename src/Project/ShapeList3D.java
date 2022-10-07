package Project;

import java.util.Vector;

public class ShapeList3D {
    Vector<Shape3D> shape3DS = new Vector<>();
    Shape3D cube;
    Shape3D sphere;
    Shape3D cylinder;
    Shape3D cone;

    ShapeList3D(){
        cube = new Shape3D("Cube");
        sphere = new Shape3D("Sphere");
        cylinder = new Shape3D("Cylinder");
        cone = new Shape3D("Cone");
        shape3DS.add(cube);
        shape3DS.add(sphere);
        shape3DS.add(cylinder);
        shape3DS.add(cone);

    }

}

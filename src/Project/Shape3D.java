package Project;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;

public class Shape3D {
    String name;
    final int dimension=3;
    Sphere sphere;
    Box cube;
    Cylinder cylinder;
    Shape3D(){}
    Shape3D(String name){
        this.name=name;
    }
}

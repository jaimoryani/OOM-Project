package Project;
import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.geometry.Cone;
import com.sun.j3d.utils.geometry.Cylinder;
import com.sun.j3d.utils.geometry.Sphere;

public class Shape3D {
    String name;
    final int dimension=3;
    Sphere sphere;
    ColorCube cube;
    Cylinder cylinder;
    Cone cone;
    Shape3D(String name){
        this.name=name;
    }
}

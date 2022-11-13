package Project;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Point3D;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.scene.Camera;
import javafx.scene.control.Button;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import java.awt.*;


public class threeDPanel extends JFXPanel {
    int index;
    Rotate rot1,rot2;
    Button rc=new Button("Rotate Clockwise");
    Button rac=new Button("Rotate AntiClockwise");
    Button change=new Button("Change Color");
    final Shape3D shape3=new Shape3D();
    double angle=0;

    threeDPanel(int index){
        shape3.sphere=new Sphere(50);
        shape3.cube=new Box(100,100,100);
        shape3.cylinder=new Cylinder(50,80);
        shape3.sphere.setVisible(false);
        shape3.cube.setVisible(false);
        shape3.cylinder.setVisible(false);
        setLayout(new FlowLayout());
        this.index=index;
        switch (index) {
            case 0 -> shape3.cube.setVisible(true);
            case 1 -> shape3.sphere.setVisible(true);
            case 2 -> shape3.cylinder.setVisible(true);
        }
    }
    void opt(){
        Platform.runLater(new Runnable(){
            @Override
            public void run() {
                BorderPane x=new BorderPane();
                HBox group=new HBox();
                group.getChildren().add(rc);
                group.getChildren().add(rac);
                group.getChildren().add(change);
                group.setSpacing(8);
                group.setAlignment(Pos.TOP_CENTER);
                x.setTop(group);
                StackPane stack=new StackPane(shape3.cube,shape3.sphere,shape3.cylinder);
                stack.setTranslateY(200);
                stack.setTranslateX(200);
                x.getChildren().add(stack);
                Scene scene=new Scene(x,800,800);
                setScene(scene);
                Camera camera=new PerspectiveCamera();
                scene.setCamera(camera);
                Rotate rota=new Rotate(angle);
                rota.setPivotX(stack.getTranslateX()+10);
                rota.setPivotY(stack.getTranslateY()-20);
                rota.setAngle(1);
                rot1=rota;
                rota=new Rotate(angle);
                rota.setPivotX(stack.getTranslateX()+10);
                rota.setPivotY(stack.getTranslateY()-20);
                rota.setAngle(-1);
                rot2=rota;
                rc.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent e) {
                        Rotate temp1=new Rotate(1,new Point3D(1,1,1));
                        Rotate temp=rot1;
                        stack.getTransforms().add(temp);
                        temp1.setPivotX(stack.getTranslateX());
                        temp1.setPivotY(stack.getTranslateY());
                        temp1.setPivotZ(stack.getTranslateZ());
                        stack.getTransforms().add(temp1);
                        shape3.sphere.setMaterial(new PhongMaterial(new Color(1.0,(Math.random()),Math.random(),(Math.random()))));
                        shape3.cylinder.setMaterial(new PhongMaterial(new Color(1.0,(Math.random()),Math.random(),(Math.random()))));
                        shape3.cube.setMaterial(new PhongMaterial(new Color(1.0,(Math.random()),Math.random(),(Math.random()))));
                    }
                });
                rac.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent e) {
                        Rotate temp1=new Rotate(-1,new Point3D(1,1,1));
                        Rotate temp=rot2;
                        stack.getTransforms().add(temp);
                        temp1.setPivotX(stack.getTranslateX());
                        temp1.setPivotY(stack.getTranslateY());
                        temp1.setPivotZ(stack.getTranslateZ());
                        stack.getTransforms().add(temp1);
                        shape3.sphere.setMaterial(new PhongMaterial(new Color(1.0,(Math.random()),Math.random(),(Math.random()))));
                        shape3.cylinder.setMaterial(new PhongMaterial(new Color(1.0,(Math.random()),Math.random(),(Math.random()))));
                        shape3.cube.setMaterial(new PhongMaterial(new Color(1.0,(Math.random()),Math.random(),(Math.random()))));
                    }
                });
                change.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent e) {
                        shape3.sphere.setMaterial(new PhongMaterial(new Color(1.0,(Math.random()),Math.random(),(Math.random()))));
                        shape3.cylinder.setMaterial(new PhongMaterial(new Color(1.0,(Math.random()),Math.random(),(Math.random()))));
                        shape3.cube.setMaterial(new PhongMaterial(new Color(1.0,(Math.random()),Math.random(),(Math.random()))));
                    }
                });
            }
        });
    }
}

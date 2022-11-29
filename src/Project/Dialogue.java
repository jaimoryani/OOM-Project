package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.CheckboxGroup;

public class Dialogue {
    void entrance(String s) {
        JOptionPane.showMessageDialog(null, s, "Welcome to World of Shapes", JOptionPane.INFORMATION_MESSAGE);
    }
    String getName(){
        return JOptionPane.showInputDialog(null,"Enter your name","NAME",JOptionPane.QUESTION_MESSAGE);
    }
    int confirm(String naam){
        return JOptionPane.showConfirmDialog(null,"Hello "+naam+",would you like to try World of Shapes ?" ,"Confirmation",JOptionPane.YES_NO_OPTION);
    }
    int ChooseDimension(Object obj){
        Object[] cbg= ((Dimension)obj).cbg;
        return JOptionPane.showConfirmDialog(null,cbg,"Choose the Dimensions" ,JOptionPane.OK_CANCEL_OPTION);
    }
    int ShapeSelect2D(String[] options) {
        return JOptionPane.showOptionDialog(null,"Select a 2D shape", "Shapes", 0, JOptionPane.QUESTION_MESSAGE, null, options, 0);
    }
    int ShapeSelect3D(String[] options) {
        return JOptionPane.showOptionDialog(null,"Select a 3D shape", "Shapes", 0, JOptionPane.QUESTION_MESSAGE, null, options, 0);
    }

}

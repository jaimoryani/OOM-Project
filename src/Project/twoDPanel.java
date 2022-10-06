package Project;

import javax.swing.*;
import java.awt.*;

public class twoDPanel extends JPanel {
    twoDPanel(){
        setLayout(new FlowLayout());
        JButton j1=new JButton(),j2=new JButton(),j3=new JButton();
        add(j1);
        add(j2);
        add(j3);
    }

}

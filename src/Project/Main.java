package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    Dialogue d;
    JTabbedPane tb1;
    twoDPanel D2;
    threeDPanel D3;
    MyFrame(){
        super("ScaleIt");
        d=new Dialogue();
        d.entrance("Hello");
        Container c=getContentPane();
        tb1=new JTabbedPane();
        D2=new twoDPanel();
        D3=new threeDPanel();
        tb1.addTab("2D",D2);
        tb1.addTab("3D",D3);
        D2.setOpaque(true);
        D3.setOpaque(true);
        c.add(tb1);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
public class Main {
    public static void main(String[] args) {
        MyFrame f= new MyFrame();
        f.setSize(800,800);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        String name=f.d.getName();
        if(name.isBlank()){
            System.exit(0);
        }
        else{
            if(f.d.confirm(name)!=JOptionPane.YES_OPTION)System.exit(0);
            Dimension dimens=new Dimension();
            if(f.d.ChooseDimension(dimens)!=JOptionPane.OK_OPTION)System.exit(0);
            boolean x=dimens.j1.isSelected(),y=dimens.j2.isSelected();
            if(!x&&!y)System.exit(0);
            if(!x)f.tb1.remove(f.D2);
            if(!y)f.tb1.remove(f.D3);
            ShapeList2D lis2D=new ShapeList2D();
            String[] opts_2D=new String[lis2D.shape2DS.size()];
            for(int i=0;i<lis2D.shape2DS.size();i++){
                opts_2D[i]=lis2D.shape2DS.get(i).name;
            }
            ShapeList3D lis3D = new ShapeList3D();
            String[] opts_3D = new String[lis3D.shape3DS.size()];
            for(int i=0;i<lis3D.shape3DS.size();i++){
                opts_3D[i]=lis3D.shape3DS.get(i).name;
            }
            int index2D=-1,index3D=-1;
            if(x){
                index2D=f.d.ShapeSelect2D(opts_2D);
            }
            if(y){
                index3D=f.d.ShapeSelect3D(opts_3D);
            }
        }
        f.setVisible(true);
    }
}
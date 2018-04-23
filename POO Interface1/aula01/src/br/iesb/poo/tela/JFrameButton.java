package br.iesb.poo.tela;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class JFrameButton {
    JFrame f;
    JFrameButton(){
    f = new JFrame();
    
    JButton b1 = new JButton("North");
    JButton b2 = new JButton("South");
    JButton b3 = new JButton("East");
    JButton b4 = new JButton("West");
    JButton b5 = new JButton("Center");
    
    f.add(b1,BorderLayout.NORTH);
    f.add(b2,BorderLayout.SOUTH);
    f.add(b3,BorderLayout.EAST);
    f.add(b4,BorderLayout.WEST);
    f.add(b5,BorderLayout.CENTER);
    
    f.setSize(300,300);
    f.setVisible(true);
    
    }
    public static void main(String[] args) {
        new JFrameButton();
    }
}

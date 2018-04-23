package br.iesb.poo.tela;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MultiPanels implements ActionListener{
    
    JFrame tela;
    JPanel painel01;
    JPanel painel02;
    JButton butao01;
    JButton butao02;
    JButton butao03;
    
    public MultiPanels(){
    
    tela = new JFrame();
    tela.setSize(800,600);
    painel01 = new JPanel();
    painel02 = new JPanel();
    painel01.setLayout(new FlowLayout());
    painel02.setBackground(Color.GRAY);
    
    butao01 = new JButton("Blue");
    butao01.addActionListener(this);
    
    butao02 = new JButton("Yellow");
    butao02.addActionListener(this);
    
    butao03 = new JButton("Red");
    butao03.addActionListener(this);
    
    
    painel01.add(butao01);
    painel01.add(butao02);
    painel01.add(butao03);
    
    tela.setLayout(new BorderLayout());
    tela.add(painel01, BorderLayout.NORTH);
    tela.add(painel02, BorderLayout.CENTER);
    tela.setVisible(true);
    
}
    public static void main(String[] args) {
        new MultiPanels();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == butao01){
            painel02.setBackground(Color.blue);
        }
        if(e.getSource() == butao02){
            painel02.setBackground(Color.yellow);
        }
        if(e.getSource() == butao03){
            painel02.setBackground(Color.red);
        }
    }
}

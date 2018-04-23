package br.iesb.poo.tela;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exercicio2 implements ActionListener{
    
   JFrame tela;
   JPanel painel01;
   JPanel painel02;
   JButton botao01;
   JButton botao02;
   JButton botao03;
   JButton botao04;
   JButton botao05;
   JLabel label;
   ImageIcon jd01;
       
   
    public Exercicio2() {
        tela = new JFrame();
        tela.setSize(800,600);
        painel01 = new JPanel();
        painel01.setLayout(new FlowLayout());
        painel02 = new JPanel();
        painel02.setBackground(Color.GRAY);
        
        
        botao01 = new JButton("Carro 1");
        botao01.addActionListener(this);
        
        botao02 = new JButton("Carro 2");
        botao02.addActionListener(this);
        
        botao03 = new JButton("Carro 3");
        botao03.addActionListener(this);
        
        botao04 = new JButton("Carro 4");
        botao04.addActionListener(this);
        
        botao05 = new JButton("Carro 5");
        botao05.addActionListener(this);
        
        painel01.add(botao01);
        painel01.add(botao02);
        painel01.add(botao03);
        painel01.add(botao04);
        painel01.add(botao05);
        
        tela.setLayout(new BorderLayout());
        tela.add(painel01, BorderLayout.NORTH);
        tela.add(painel02, BorderLayout.CENTER);
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   public static void main(String arg[]){
       new Exercicio2();
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()== botao01){
            painel02.setBackground(Color.blue);
        }
        if(e.getSource()== botao02){
            painel02.setBackground(Color.yellow);
        }
        if(e.getSource()== botao03){
            painel02.setBackground(Color.red);
        }
    }
    
}

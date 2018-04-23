package br.iesb.poo.tela;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio1{
    
    JFrame tela;
    JTextField campo1;
    JTextField campo2;
    JButton copiar;
    JButton inverter;
    JPanel painel01;
    String texto1;
    
    public Exercicio1(){
    
    tela = new JFrame("Tela01");
    tela.setSize(600,300);
    painel01 = new JPanel(new FlowLayout());
    campo1 = new JTextField(50);
    campo2 = new JTextField(50);
    copiar = new JButton("Copiar");
    inverter = new JButton("Inveter");
    
    painel01.add(campo1);
    painel01.add(copiar);
    painel01.add(inverter);
    painel01.add(campo2);
    
    copiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                texto1 = new String (campo1.getText());
                campo2.setText(String.valueOf(texto1));
                
            }
        });
    
    inverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                texto1 = new String (campo1.getText());
                StringBuilder texto2 = new StringBuilder();
                texto2.append(texto1);
                texto2 = texto2.reverse();
                campo2.setText(String.valueOf(texto2));
            }
        });
    
    tela.add(painel01);
    tela.setVisible(true);
    }
    public static void main(String[] args) {
        new Exercicio1();
    }
    
    
}
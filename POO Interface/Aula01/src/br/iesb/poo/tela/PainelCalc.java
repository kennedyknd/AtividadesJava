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
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelCalc{
    
    JFrame tela;
    JLabel peso;
    JLabel altura;
    JTextField resultado;
    JTextField campo1;
    JTextField campo2;
    JButton calc;
    JPanel painel01;
    float altura1, imc, peso1;
    
    
    public PainelCalc(){
    
    tela = new JFrame("IMC");
    tela.setSize(400,300);
    peso = new JLabel("Peso");
    altura = new JLabel("Altura");
    calc = new JButton("Calcular");
    painel01 = new JPanel(new FlowLayout());
    campo1 = new JTextField(10);
    campo2 = new JTextField(10);
    resultado = new JTextField(15);
    
    altura.setLayout(new BorderLayout(2,1));
    
    painel01.add(peso);
    painel01.add(campo1);
    painel01.add(altura);
    painel01.add(campo2);
    painel01.add(calc);
    painel01.add(resultado);
    
    tela.add(painel01);
    tela.setVisible(true);
}
    public static void main(String[] args) {
        new PainelCalc();
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == calc){
            
        }
    }
}
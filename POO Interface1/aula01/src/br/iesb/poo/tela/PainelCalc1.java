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

public class PainelCalc1{
    
    JFrame tela;
    JLabel peso;
    JLabel altura;
    JTextField resultado;
    JTextField campo1;
    JTextField campo2;
    JButton calc;
    JPanel painel01;
    double altura1, peso1;
    double imc;
    
    
    public PainelCalc1(){
    
    tela = new JFrame("IMC");
    tela.setSize(600,300);
    peso = new JLabel("Peso");
    altura = new JLabel("Altura");
    calc = new JButton("Calcular");
    painel01 = new JPanel(new FlowLayout());
    campo1 = new JTextField(10);
    campo2 = new JTextField(10);
    resultado = new JTextField(30);
    
    altura.setLayout(new BorderLayout(2,1));
    
    painel01.add(peso);
    painel01.add(campo1);
    painel01.add(altura);
    painel01.add(campo2);
    painel01.add(calc);
    painel01.add(resultado);
    
    calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                peso1 = new Double (campo1.getText());
                altura1 = new Double (campo2.getText());
                
                imc = peso1 / ( altura1 * altura1 );
                
                resultado.setText(String.valueOf(imc));
            }
        });
    
    tela.add(painel01);
    tela.setVisible(true);
    }
    public static void main(String[] args) {
        new PainelCalc1();
    }
    
    
}
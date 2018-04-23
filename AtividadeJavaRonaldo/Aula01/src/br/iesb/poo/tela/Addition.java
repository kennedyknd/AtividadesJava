package br.iesb.poo.tela;

import javax.swing.JOptionPane;

public class Addition{
   public static void main(String args[]){
        String firstNumber = JOptionPane.showInputDialog("Entre com primeiro valor");
        String secondNumber = JOptionPane.showInputDialog("Entre com segundo valor");
   
        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);
        int soma = num1+num2;
        
       JOptionPane.showMessageDialog(null, "A soma é "+ soma );
    }
}
package br.iesb.poo.tela;

import javax.swing.JOptionPane;

public class Aula02 {

    public static void main(String[] args) {
       String idadeString = JOptionPane.showInputDialog("Digite o ano que nasceu?"); 
       int idade = -1, result = -1;
       idade = Integer.parseInt(idadeString);
       result = 2018 - idade;
       JOptionPane.showMessageDialog(null, "Resuldado da Idade: " + result);
       
    }
    
  
}

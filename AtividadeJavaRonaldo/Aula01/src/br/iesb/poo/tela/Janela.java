package br.iesb.poo.tela;

import javax.swing.JFrame;


public class Janela extends JFrame{
    JFrame tela;
    
    public Janela(){
    tela = new JFrame("Janela");
    tela.setSize(200,300);
    tela.setVisible(true);
    }
    public static void main(String[] args) {
        new Janela();
    }
}
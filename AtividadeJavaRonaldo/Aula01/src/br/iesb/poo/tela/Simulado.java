package br.iesb.poo.tela;

import javax.swing.JFrame;


public class Simulado extends JFrame {
    JFrame tela;
    
    public Simulado(){
    tela = new JFrame("Janela");
    tela.setSize(200,300);
    tela.setVisible(true);
    }
    public static void main(String[] args) {
        new Janela();
    }
}
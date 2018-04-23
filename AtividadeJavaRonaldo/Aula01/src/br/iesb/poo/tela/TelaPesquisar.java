package br.iesb.poo.tela;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class TelaPesquisar {
    JFrame tela;
    JPanel painel;
    JLabel nome;
    JButton enviar;
    JTextField campo;
    
    TelaPesquisar(){
    tela = new JFrame("Tela pesquisar");
    tela.setSize(300,100);
    painel = new JPanel();
    
    nome = new JLabel("Nome ");
    campo = new JTextField(15);
    enviar = new JButton("Enviar");
    
    painel.add(nome);
    painel.add(campo);
    painel.add(enviar);
    
    painel.setLayout(new FlowLayout());
    tela.add(painel);
    tela.setVisible(true);
    }
    public static void main(String[] args) {
        new TelaPesquisar();
    }
}
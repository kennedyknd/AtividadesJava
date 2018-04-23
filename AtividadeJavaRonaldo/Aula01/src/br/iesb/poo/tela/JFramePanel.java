package br.iesb.poo.tela;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFramePanel {

    JFrame tela = new JFrame("Exemplo de paineis");
    JPanel painel01 = new JPanel();
    JPanel painel02 = new JPanel();
    JPanel painel03 = new JPanel();

    public JFramePanel() {
        tela.setSize(600, 400);
        painel01.setBackground(Color.yellow);
        painel02.setBackground(Color.blue);
        painel03.setBackground(Color.red);

        painel01.setSize(100, 100);
        painel02.setSize(100, 100);
        painel03.setSize(100, 100);

        tela.add(painel01, BorderLayout.NORTH);
        tela.add(painel02, BorderLayout.CENTER);
        tela.add(painel03, BorderLayout.SOUTH);

        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFramePanel aula03 = new JFramePanel();
    }
}

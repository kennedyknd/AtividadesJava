package br.iesb.poo.tela;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tela01 {

    JFrame tela = new JFrame();
    JTextField input = new JTextField();
    JButton b = new JButton("Enviar");

    public Tela01(int x, int y) {
        tela.setTitle("Minha Tela");
        tela.setVisible(true);
        tela.getContentPane().setBackground(Color.RED);
        tela.setSize(x, y);
        tela.getContentPane().add(input, "North");
        tela.getContentPane().add(b, "Center");
    }

    public static void main(String args[]) {
        new Tela01(400, 600);
        String idadeString = JOptionPane.showInputDialog("Digite o Ano que nasceu?");
    }
}

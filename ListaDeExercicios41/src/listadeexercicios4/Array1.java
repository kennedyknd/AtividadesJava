/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercicios4;

import java.util.Scanner;

/**
 *
 * @author Kennedy
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] valor = new int[100];
        int pos = 0;
        Scanner leia = new Scanner(System.in);
        for (int x = 0; x < valor.length; x++) {
            valor[x] = x + 1;
        }
        for (int x = 0; x < valor.length; x++) {
            System.out.println("Posição: " + x + " Valor: " + valor[x]);
        }

        System.out.println("------------------------------\nQual o número da posição: ");
        pos = leia.nextInt();
        System.out.println("O valor é : " + valor[pos]);
    }
}

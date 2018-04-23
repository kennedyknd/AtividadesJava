/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5;

import java.util.Scanner;

/**
 *
 * @author 17114290011
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int[] valor = new int[10];
        
        for ( int x = 0; x < valor.length; x++ ){
            System.out.println("Insira o " + (x+1) + "ª valor");
            valor[x] = leia.nextInt();
        }
        
        for ( int x = 0; x < valor.length; x++ ){
            System.out.println("Valor " + (x+1) + " * 10 = " + (valor[x] * 10));
        }
        
    }
    
}

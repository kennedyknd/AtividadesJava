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
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int[] valor = new int[80];
        int menorNum = 0, posicao = 0;
        
        for ( int x = 0; x < valor.length; x++ ){
            System.out.println("Insira o " + (x+1) + "ª valor");
            valor[x] = leia.nextInt();
        }
        
        for ( int x = 0; x < valor.length; x++ ){
            System.out.println("Valor digitado na posição " + x + " = " + valor[x]);
            
            if( x == 0 ) {
		menorNum = valor[x];
                posicao = x;
            }
            if ( valor[x] < menorNum ){
                menorNum = valor[x];
                posicao = x;
            }
            
        }
        
        System.out.println("\nO menor elemento de N é = " + menorNum + " e a sua posição é " + posicao);
        
    }
    
}

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
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int[] valor = new int[100];
        
        for ( int x = 0; x < valor.length; x++ ){
            System.out.println("Insira o " + (x+1) + "ª valor");
            valor[x] = leia.nextInt();
        }
        
        for ( int x = 0; x < valor.length; x++ ){
            System.out.println("Valor digitado na posição " + x + " = " + valor[x]);
        }
        
        for ( int x = 0; x < valor.length; x++ ){
            if ( valor[x] == 0 )
                valor[x] = 1;
        }
        
        System.out.println("\n\nCaso o usuário digitou o valor 0, esse valor foi substituido por 1\n\n");
        
        for ( int x = 0; x < valor.length; x++ ){
            System.out.println("Valor digitado na posição " + x + " = " + valor[x]);
        }
        
    }
    
}

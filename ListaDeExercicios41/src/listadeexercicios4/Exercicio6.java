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
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int contador = 0, valor;
        
        Scanner leia = new Scanner(System.in);
        
        for ( int x = 1; x <= 10; x++ ){
            
            System.out.println("Digite o " + x + "ª valor: ");
            valor = leia.nextInt();
            if ( valor < 0 )
                contador++;
        }
        
        System.out.println("Foram digitados " + contador + " valores negativos.");
        
    }
    
}

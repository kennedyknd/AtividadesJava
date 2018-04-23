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
public class Exercicioo16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double soma = 0, media;
        int numero, maiorNum = 0, menorNum = 0;
        
        Scanner leia = new Scanner(System.in);
        
        for ( int x = 1; x <= 30; x++ ){
            System.out.println("\nInsira o " + x + "ª numero");
            numero = leia.nextInt();
            
            soma += numero;
            
            if( x == 1 ) {
		maiorNum = numero;
		menorNum = numero;
            }
            if( numero > maiorNum ) {
		maiorNum = numero;
            }
            if( numero < menorNum ) {
                menorNum = numero;
            }
            
        }
        
            media = soma / 30;
        
            System.out.print("Maior numero digitado: " + maiorNum );
            System.out.print("\nMenor numero digitado: " + menorNum );
            System.out.print("\nMédia dos valores digitados: " + media + "\n");
            
    }
    
}

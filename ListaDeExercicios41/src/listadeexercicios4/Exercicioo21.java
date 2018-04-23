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
public class Exercicioo21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        double numero, maiorNum = 0, menorNum = 0;
        
        System.out.println("Insira 100 números");
        
        for ( int x = 1; x <= 100; x++ ){
            
            System.out.println("\nInsira o " + x + "ª número: ");
            numero = leia.nextDouble();
            
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
        
        System.out.print("Maior numero digitado: " + maiorNum );
        System.out.print("\nMenor numero digitado: " + menorNum );
    }
    
}

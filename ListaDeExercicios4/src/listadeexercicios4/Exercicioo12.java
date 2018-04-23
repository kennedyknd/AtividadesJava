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
public class Exercicioo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double numero;
        
        Scanner leia = new Scanner(System.in);
        
        for ( int x = 1; x <= 30; x++ ){
             
            do {
                System.out.println("Digite o " + x + "ª número: ");
                numero = leia.nextDouble();
                if ( numero < 0 )
                    System.out.println("Número inválido, digite um número positivo!");
            } while ( numero < 0 );
                
            numero = numero * 2;
            System.out.println("O dobro do número digitado é " + numero);
         }
        
    }
    
}

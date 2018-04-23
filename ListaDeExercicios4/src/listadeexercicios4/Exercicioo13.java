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
public class Exercicioo13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double numero, soma = 0;
        
        Scanner leia = new Scanner(System.in);
        
        for ( int x = 1; x <= 10; x++ ){
             
            System.out.println("Digite o " + x + "ª número. ");
            numero = leia.nextDouble();
            if ( numero < 40 )
                soma += numero;
        }
        
        System.out.println("A soma dos números menos que 40 é: " + soma);
        
    }
    
}

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
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int quantidade;
        
        Scanner leia = new Scanner(System.in);
        do {
            System.out.println("Digite um valor: ");
            quantidade = leia.nextInt();
            if ( quantidade <= 0 )
                System.out.println("Digite um valor maior que 0!!");
        } while ( quantidade <= 0 );
        
        for ( int x = 1; x <= quantidade; x++ ){
            System.out.println("Numero: " + x);
        }
        
    }
    
}

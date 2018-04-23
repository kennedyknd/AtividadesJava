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
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int quantidade;
        double soma = 0, numero;
        
        Scanner leia = new Scanner(System.in);
        do {
            System.out.println("Quantos números serão digitados?");
            quantidade = leia.nextInt();
            if ( quantidade <= 0 )
                System.out.println("Digite um número maior que 0!!");
        } while ( quantidade <= 0 );
        
        for ( int x = 1; x <= quantidade; x++ ){
            System.out.println("Insira o " + x + "ª numero");
            numero = leia.nextInt();
            soma += numero;    
        }
        
        System.out.println("A média dos números digitados é " + soma/quantidade);
        
    }
    
}

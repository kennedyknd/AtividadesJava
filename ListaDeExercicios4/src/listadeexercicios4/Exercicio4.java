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
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double soma = 0, numero;
        
        Scanner leia = new Scanner(System.in);
        
        for ( int x = 1; x <= 10; x++ ){
            System.out.println("Insira o " + x + "ª numero");
            numero = leia.nextInt();
            soma += numero;    
        }
        
        System.out.println("A soma dos números digitados é: " + soma);
        
    }
    
}

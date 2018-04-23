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
public class Exercicioo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int quantidade;
        double numero;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Quantos números serão lidos?");
        quantidade = leia.nextInt();
        
        for ( int x = 1; x <= quantidade; x++ ){
             System.out.println("Digite o " + x + "ª número: ");
             numero = leia.nextDouble();
             numero = numero * 3;
             System.out.println("O triplo do número digitado é " + numero);
        }
        
    }
    
}

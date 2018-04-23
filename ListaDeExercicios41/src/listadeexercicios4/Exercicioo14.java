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
public class Exercicioo14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double valor, soma = 0;
        int numeroTotal;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Número total de mercadorias em estoque: ");
        numeroTotal = leia.nextInt();
        
        for ( int x = 1; x <= numeroTotal; x++ ){
            System.out.println("Valor da mercadoria " + x);
            valor = leia.nextDouble();
            soma += valor;
        }
        
        System.out.println("Valor total em estoque: " + soma);
        System.out.println("Média de valor das mercadorias: " + soma/numeroTotal);
        
    }
    
}

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
public class Exercicioo22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        double numero, soma = 0, media, codigo, maiorNum = 0, menorNum = 0;
        int quantidadeProdutos = 15;
        
        System.out.println("Insira o código e preço de 15 produtos");
        
        for ( int x = 1; x <= quantidadeProdutos; x++ ){
            
            System.out.println("\nInsira o código do " + x + "ª produto: ");
            numero = leia.nextDouble();
            System.out.println("Insira o preço do " + x + "ª produto: ");
            numero = leia.nextDouble();
            
            soma += numero;
            
            if( x == 1 )
                maiorNum = numero;
                
            if( numero > maiorNum )
                maiorNum = numero;
           
        }
        
        media = soma / quantidadeProdutos;
        
        System.out.print("Maior preço lido: " + maiorNum + " R$");
        System.out.print("\nMédia dos preços dos produtos: " + media + " R$");
    }
    
}

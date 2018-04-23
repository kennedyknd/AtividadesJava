/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio3;

import java.util.Scanner;

/**
 *
 * @author Kennedy
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double soma = 0, media;
        int numero, maiorNum = 0, menorNum = 0, x = 1;
        
        Scanner leia = new Scanner(System.in);
                
        System.out.println("Por favor, insira números positivos!");
        System.out.println("Caso queira encerrar o programa, digite um número negativo!");
        
        while ( x == x ) {
        
            System.out.println("\nInsira o " + x + "ª numero");
            numero = leia.nextInt();
            if ( numero < 0 ) { 
                System.exit(0);
            }
            
            soma = soma + numero;
            
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
            
            media = soma / x;
        
            System.out.print("Maior numero digitado: " + maiorNum );
            System.out.print("\nMenor numero digitado: " + menorNum );
            System.out.print("\nMédia dos valores digitados: " + media + "\n");
            
            x++;
	}
        

    }

}

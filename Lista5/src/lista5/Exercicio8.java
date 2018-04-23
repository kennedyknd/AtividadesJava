/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5;

import java.util.Scanner;

/**
 *
 * @author 17114290011
 */
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int quantidade, maiorNum = 0, menorNum = 0, posicaoMaior = 0, posicaoMenor = 0;
        
        System.out.println("Quantas posições terão o array?");
        quantidade = leia.nextInt();
        
        int[] valor = new int [quantidade];
        
        System.out.println("Insira valores inteiros");
        
        for ( int x = 0; x < quantidade; x++){
            System.out.println("Insira o " + (x+1) + "ª valor.");
            valor[x] = leia.nextInt();
            
            if( x == 0 ) {
		maiorNum = valor[x];
		menorNum = valor[x];
                posicaoMaior = x;
                posicaoMenor = x;
            }
            if( valor[x] > maiorNum ) {
		maiorNum = valor[x];
                posicaoMaior = x;
            }
            if( valor[x] < menorNum ) {
                menorNum = valor[x];
                posicaoMenor = x;
            }   
        }
        
        System.out.println("O maior valor digitado foi " + maiorNum + " e sua posição é " + posicaoMaior);
        System.out.println("O menor valor digitado foi " + menorNum + " e sua posição é " + posicaoMenor);
        
    }
    
}

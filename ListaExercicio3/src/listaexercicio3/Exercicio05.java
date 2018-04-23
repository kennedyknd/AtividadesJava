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
public class Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double soma = 0, media, somaTotal = 0;
        int quantidade = 0, numero, menorNum = 1000;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite números inteiros positivos\nDigite -1 para parar!");
        
        do {
            numero = leia.nextInt();
            
            if ( numero > 100 && numero < 1000 ) {
                if ( numero < menorNum )
                    menorNum = numero;
                
                soma += numero;
                quantidade++;
                
            }
            
            somaTotal += numero;
            
        } while ( numero > 0 );
        
        media = soma/quantidade;
        
        if ( menorNum == 1000 )
            System.out.println("Não houve número entre 100 e 1000 digitado!");
        else {
            System.out.println("O menor valor dentre os maiores que 100 e menores que 1000; " + menorNum);
            System.out.println("A média dos valores dentre os maiores que 100 e menores que 100: " + media);
            System.out.println("A soma dos valores dentre os maiores que 100 e menores que 1000; " + soma);
        }
            
        System.out.println("A soma de todos os valores lidos: " + somaTotal);
        
    }

}

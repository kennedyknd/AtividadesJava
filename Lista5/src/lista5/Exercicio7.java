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
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int[] valor = new int[15];
        double soma = 0, count = 0;
        
        System.out.println("Insira valores inteiros");
        for ( int x = 0; x < valor.length; x++ ){
            System.out.println("Insira o " + (x+1) + "ª valor");
            valor[x] = leia.nextInt();    
        }
        
        System.out.println("Os valores pares digitados foram ");
        
        for ( int x = 0; x < valor.length; x++ ){
            if( valor[x] % 2 == 0){
                System.out.print(valor[x] + ", ");
                soma += valor[x];
                count++;
            }
        }
        
        System.out.println("\nA média dos valores pares é " + (soma/count));
        
    }
    
}

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
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double n1, n2;
        
        System.out.println("Insira o valor 1");
        Scanner leia = new Scanner(System.in);  
        n1 = leia.nextDouble();
        
        do {
            System.out.println("Insira o valor 2"); 
            n2 = leia.nextDouble();
            if ( n2 == 0 ) System.out.println("Valor inválido");
        } while ( n2 == 0 );
        
        System.out.println("A divisão dos números foi " + ( n1 / n2 ));
        
        
    }
    
}

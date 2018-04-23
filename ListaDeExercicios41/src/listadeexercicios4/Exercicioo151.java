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
public class Exercicioo151 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int intervalo1, intervalo2, soma = 0, auxiliar;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um número qualquer");
        intervalo1 = leia.nextInt();
        System.out.println("Digite outro número qualquer");
        intervalo2 = leia.nextInt();
        
        if ( intervalo1 > intervalo2 ){
            auxiliar = intervalo1;
            intervalo1 = intervalo2;
            intervalo2 = auxiliar;
        }    
        
        System.out.println("Os números ímpares do intervalo de " + intervalo1 + " a " + intervalo2 + " são: \n");
        
        for (int x = (intervalo1+1); x < intervalo2; x++) {
            
            if ((x % 2) == 1) {
                
                System.out.print(x + ", ");
                
                soma += x;
            }
        }
        
        System.out.println("\n\nA soma dos números ímpares do intervalo de " + intervalo1 + " a " + intervalo2 + " é: " + soma);
        
    }    
        
}
    


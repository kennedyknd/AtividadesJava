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
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int contador = 0, contador2 = 0, valor;
        
        Scanner leia = new Scanner(System.in);
        
        for ( int x = 1; x <= 10; x++ ){
            
            System.out.println("Digite o " + x + "ª valor: ");
            valor = leia.nextInt();
            if ( valor >= 10 && valor <= 20 )
                contador++;
            else
                contador2++;
        }
        
        System.out.println("Foram digitados " + contador + " valores no intervalo entre 10 e 20");
        System.out.println("Foram digitados " + contador2 + " valores fora do intervalo");
        
    }
    
}

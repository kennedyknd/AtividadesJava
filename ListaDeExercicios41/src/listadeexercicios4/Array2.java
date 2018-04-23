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
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] valor = new int[10];
        Scanner leia = new Scanner(System.in);
        for ( int x = 0; x < 10; x++ ){
            System.out.println("Insira um valor");
            valor[x] = leia.nextInt();  
            
        }
        
            
        
    }
}

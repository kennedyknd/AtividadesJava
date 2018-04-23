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
public class Exercicioo19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("TABUADA DE 1 A 10\n-------------------");
        
        for ( int x = 1; x <= 10; x++ ){
            System.out.println("\nTABUADA DE " + x + "\n-------------------");
            for ( int y = 1; y <= 10; y++ ){
                System.out.println( x + " x " + y + " = " + (x*y));
                  
            }
           
        }
            
    }
    
}

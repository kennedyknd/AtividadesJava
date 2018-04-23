/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author 17114290011
 */
public class Exercicios1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Letra a)\n--------------");
        
        int a;
        int b;
        
        a = 10;
        b = 20;
        
        System.out.println("B = " + b);
        
        b = 5;
        
        System.out.println("A = " + a + ", B = " + b);
        
        System.out.println("\n\nLetra b)\n--------------");
        
        a = 30;
        b = 20;
        int c;
        
        c = a + b;
        
        System.out.println("C = " + c);
        
        b = 10;
        
        System.out.println("B = " + b + ", C = " + c);
        
        c = a + b;
        
        System.out.println("A = " + a + ", B = " + b + ", C = " + c); 
        
        System.out.println("\n\nLetra c)\n--------------");
        
        a = 10;
        b = 20;
        c = a;
        b = c;
        a = b;
        
        System.out.println("A = " + a + ", B = " + b + ", C = " + c); 
        
        System.out.println("\n\nLetra d)\n--------------");
        
        a = 10;
        b = a + 1;
        a = b + 1;
        b = a + 1;
        
        System.out.println("A = " + a);
        
        a = b + 1;
        
        System.out.println("A = " + a + ", B = " + b);
        
        System.out.println("\n\nLetra e)\n--------------");
        
        a = 10;
        b = 5;
        c = a + b;
        b = 20;
        a = 10;
        
        System.out.println("A = " + a + ", B = " + b + ", C = " + c); 
        
        System.out.println("\n\nLetra f)\n--------------");
        
        int x;
        int y;
        int z;
        x = 1;
        y = 2;
        z = y - x;
        
        System.out.println("Z = " + z);
        
        x = 5;
        y = x + z;
        
        System.out.println("X = " + x + ", Y = " + y + ", Z = " + z); 
        
      
        
    }
    
}

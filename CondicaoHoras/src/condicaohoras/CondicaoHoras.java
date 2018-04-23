/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicaohoras;

import java.util.Scanner;

/**
 *
 * @author 17114290011
 */
public class CondicaoHoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner leia = new Scanner(System.in);
         
         System.out.println ("Insira o horario");  

         int horario=leia.nextInt();
       
       if ( horario <= 5){
           System.out.println("Vá dormir!!!!!");
       }  else if ( horario <= 11) {
           System.out.println("Bom dia!");
       }  else if ( horario <= 18 ){
           System.out.println("Boa tarde!");
       }  else  {
           System.out.println("Boa noite!");
       }
               
        
        
        
        
        
        
        
    }
    
}

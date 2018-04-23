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
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int[] valor = new int[6];
        int[] jogo = new int[6];
        int count = 0;
        
        System.out.println("Insira o gabarito da megasena");
            
        for ( int x = 0; x < valor.length; x++ ){
            System.out.println("Insira o " + (x+1) + "ª número");
            valor[x] = leia.nextInt();
        }
        
        System.out.println("Insira seu jogo");
            
        for ( int x = 0; x < jogo.length; x++ ){
            System.out.println("Insira o " + (x+1) + "ª número");
            jogo[x] = leia.nextInt();
        }
        
        for ( int x = 0; x < 6; x++ ){
            for ( int y = 0; y < 6; y++ ){
                if ( valor[x] == jogo[y] )
                    count++;
            }
        }
        
        System.out.println("O Jogador acertou " + count + " números");
        
        if ( count == 6 )
            System.out.println("GANHADOR, PARABENS");
        
    }
    
}

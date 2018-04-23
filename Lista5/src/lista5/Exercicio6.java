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
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int x, y, k, acertos, maiorNum = 0, menorNum = 6, quantidade;
        String maisAcertos = "A", menosAcertos = "B";
        int[] valor = new int[6];
        int[] jogo = new int[6];

        for ( x = 0; x < valor.length; x++ ) {
            System.out.println("Digite o " + (x+1) + "ª número do gabarito");
            valor[x] = leia.nextInt();
        }
        
        System.out.println("\nQuantos jogadores?");
        quantidade = leia.nextInt();
        String[] nome = new String[quantidade];

        for ( k = 0; k < quantidade; k++ ) {
            System.out.println("\nDigite o nome do " + (k+1) + "ª jogador");
            nome[k] = leia.next();
            
            System.out.println("Digite os números do jogo do jogador " + nome[k]);
            
            for ( x = 0; x < jogo.length; x++ ) {
                System.out.println("Digite o " + (x+1) + "ª número");
                jogo[x] = leia.nextInt();
            }
            
            acertos = 0;
            
            for ( x = 0; x < 6; x++ ) {
                for ( y = 0; y < 6; y++ ) {
                    if ( jogo[x] == valor[y] )
                        acertos++;
                }
            }
            
            if ( acertos > maiorNum ) {
                maisAcertos = nome[k];
                maiorNum = acertos;
            } 
            if ( acertos < menorNum ){
                menosAcertos = nome[k];
                menorNum = acertos;
            }
        }
        System.out.println("\nO jogador " + maisAcertos + " acertou " + maiorNum + " números e foi quem mais acertou");
        System.out.println("O jogador " + menosAcertos + " acertou " + menorNum + " números e foi quem menos acertou");
    }
}
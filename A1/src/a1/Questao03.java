/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1;

import java.util.Scanner;

/**
 *
 * @author 17114290011
 */
public class Questao03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        String nomeEleitor, novoEleitor;
        double votoEleitor, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;
        // count1 = joão, count2 = maria, count3 = total, count4 = brancos, count5 = nulos
        
        do {
            Scanner leiaEleitor = new Scanner(System.in);
            System.out.println("Digite o nome do eleitor");
            nomeEleitor = leiaEleitor.nextLine();
            do {
                System.out.println("Digite o número correspondente ao seu voto");
                System.out.println("Para quem será o voto:\n" + "1 - João das Couves\n" + "2 - Maria das Neves\n" + "0 - Branco\n" + "-1 - Nulo");
                votoEleitor = leia.nextInt();
                if ( votoEleitor < -1 || votoEleitor > 2)
                    System.out.println("Voto inválido!");
                else if ( votoEleitor == 1)
                    count1++;
                else if ( votoEleitor == 2)
                    count2++;
                else if ( votoEleitor == 0)
                    count4++;
                else if ( votoEleitor == -1)
                    count5++;
                
                count3++;
                
            } while ( votoEleitor < -1 || votoEleitor > 2);
            
            do {
                System.out.println("Computar próximo Eleitor? (Digite 0 para NÃO ou 1 para SIM)");
                novoEleitor = leiaEleitor.nextLine();
                if ( !"0".equals(novoEleitor) && !"1".equals(novoEleitor) )
                    System.out.println("Número inválido");
            } while ( !"0".equals(novoEleitor) && !"1".equals(novoEleitor) );
                
        } while ( "1".equals(novoEleitor));
        
        if ( count1 > count2 ) {
            System.out.println("O presidente eleito foi: João das Couves");
            System.out.println("O presidente eleito teve " + count1 + " votos");
        }
        else if ( count2 > count1 ) { 
            System.out.println("O presidente eleito foi: Maria das Neves");
            System.out.println("O presidente eleito teve " + count2 + " votos");
        }
        else { System.out.println("Houve um empate entre os candidatos");
        }
        
        System.out.println("Foram computados " + count3 + " votos:" );
        System.out.println(count1 + " votos para João das Couves " + ((count1/count3)*100) + "%");
        System.out.println(count2 + " votos para Maria das Neves " + ((count2/count3)*100) + "%");
        System.out.println(count4 + " votos brancos " + ((count4/count3)*100) + "%");
        System.out.println(count5 + " votos nulos " + ((count5/count3)*100) + "%");
        
    }
    
}

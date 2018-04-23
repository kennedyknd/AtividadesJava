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
public class Questao02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int matricula, quantidadeLivros, diasAtraso, matriculaMaior = 0;
        double valorMulta, valorPagar = 0, maiorPagar = 0;
        String refazer;
        
        System.out.println("Informe o valor da multa por dia de atraso: ");
        valorMulta = leia.nextDouble();
            
        do {
            Scanner leiarefazer = new Scanner(System.in);
            System.out.println("Informe sua matricula: ");
            matricula = leia.nextInt();

            System.out.println("Informe a quantidade de livros a serem devolvidos: ");
            quantidadeLivros = leia.nextInt();

            for ( int x = 0; x < quantidadeLivros; x++ ){
                System.out.println("Insira a quantidade de dias em atraso do " + ( x + 1)+ "ª livro");
                diasAtraso = leia.nextInt();
                valorPagar += diasAtraso * valorMulta;
                
                if( valorPagar > maiorPagar ) {
		maiorPagar = valorPagar;
                matriculaMaior = matricula;
                }
                    
            }

            System.out.println("O valor da multa a ser pago pelo aluno de matrícula ( " + matricula + " ) será de " + valorPagar + " R$");
            
            System.out.println("\nDeseja receber livros de outro aluno? (Digite 1 para SIM ou qualquer outro valor para NÃO");
            refazer = leiarefazer.nextLine();
            
            valorPagar = 0;
            
        } while ( "1".equals(refazer) );
        
        System.out.println("\nO aluno de matricula " + matriculaMaior + " foi o que mais pagou multa");
        System.out.println("O valor da sua multa foi de " + maiorPagar + " R$");
        
    }
    
}

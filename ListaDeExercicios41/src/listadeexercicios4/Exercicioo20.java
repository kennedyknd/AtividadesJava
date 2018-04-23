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
public class Exercicioo20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int idade, identificador, identificador2 = 0, nota, countNota = 0, somaIdade = 0, pessoaVelha = 0;
        int numeroEntrevistados = 200;
        double percentagem = 0;
        
        for ( int x = 1; x <= numeroEntrevistados; x++ ){
            
            System.out.println(x + "ª Pessoa");
            System.out.println("Qual sua idade? ");
            idade = leia.nextInt();
            System.out.println("Qual seu identificador: ");
            identificador = leia.nextInt();
            if ( idade > pessoaVelha ){
                pessoaVelha = idade;
                identificador2 = identificador;
                
            }
            do { 
                System.out.println("Qual sua nota para a peça: \n(Nota entre 0 e 10)");
                nota = leia.nextInt();
                if ( nota < 0 || nota > 10 )
                    System.out.println("Nota inválida. Digite um nota entre 0 e 10");
            } while ( nota < 0 || nota > 10 );
            
            if ( nota == 10 )
                countNota++;
            
            somaIdade += idade;
            
            
            if ( nota <= 5 )
                percentagem += (100 / numeroEntrevistados );
            
            
            
        }
        
        System.out.println("Quantidade de notas 10: " + countNota);
        System.out.println("A média de idade das pessoas que responderam ao questionário: " + somaIdade/numeroEntrevistados);
        System.out.println("Percentagem de pessoas que responderam 5 ou menos para a nota: " + percentagem + "%");
        System.out.println("A pessoa com identificador " + identificador2 + " possui " + pessoaVelha + " anos de idade e é a pessoa mais velha!");
        
    }
    
}

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
public class Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int numeroalunos;
        double notas, soma = 0, soma2 = 0, media;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Quantos alunos existem na turma?");
        numeroalunos = leia.nextInt();
        
        for ( int x = 1; x <= numeroalunos; x++ ){
            
            for ( int y = 1; y <= 3; y++ ){
                System.out.println("Digite a " + y + "ª nota do " + x + "ª aluno");
                notas = leia.nextInt();
                soma += notas;
            }
            
            media = soma/3;
            System.out.println("A média do " + x + "ª aluno foi " + media);
            soma = 0;
            soma2 += media;
        }
        
        System.out.println("A média da turma foi " + soma2/numeroalunos);
        
    }
    
}

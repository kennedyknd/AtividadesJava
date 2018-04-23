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
public class Exercicioo18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int codigo, idade, countSistemas = 0, countCiencia = 0, countEngenharia = 0, mediaIdadeSistemas = 0, mediaIdadeCiencia = 0, mediaIdadeEngenharia = 0;
        int count20e25Sistemas = 0, count20e25Ciencia = 0, count20e25Engenharia = 0;
        
        Scanner leia = new Scanner(System.in);
        
        for ( int x = 1; x <= 500; x++ ){
            
            do {
                System.out.println("Digite o código do seu curso: ");
                System.out.println("1 ( Sistemas de informação )\n2 ( Ciência da computação )\n3 ( Engenharia Civil )");
                codigo = leia.nextInt();
                if ( codigo < 1 || codigo > 3)
                    System.out.println("Código inválido");
            } while ( codigo < 1 || codigo > 3 );
            
            if ( codigo == 1 )
                countSistemas++;
            else if ( codigo == 2 )
                countCiencia++;
            else
                countEngenharia++;
            
            if ( codigo == 1 ) {
                System.out.println("Digite sua idade: ");
                idade = leia.nextInt();
                
                if ( idade >= 20 && idade <= 25 )
                    count20e25Sistemas++;
                mediaIdadeSistemas = idade / x;
            }
            else if ( codigo == 2 ) {
                System.out.println("Digite sua idade: ");
                idade = leia.nextInt();
                
                if ( idade >= 20 && idade <= 25 )
                    count20e25Ciencia++;
                mediaIdadeCiencia = idade / x;
            }
            else {
                System.out.println("Digite sua idade: ");
                idade = leia.nextInt();
                
                if ( idade >= 20 && idade <= 25 )
                    count20e25Engenharia++;
                mediaIdadeEngenharia = idade / x;
            }
            
            
        }
            
            
        
        System.out.println("Numeros de alunos por curso");
        System.out.println("Sistemas de informação: " + countSistemas + " alunos");
        System.out.println("Ciencia da computação: " + countCiencia + " alunos");
        System.out.println("Engenharia Civil: " + countEngenharia + " alunos");
        
        System.out.println("\nNumeros de alunos com idade entre 20 e 25");
        System.out.println("Sistemas de informação: " + count20e25Sistemas + " alunos");
        System.out.println("Ciencia da computação: " + count20e25Ciencia + " alunos");
        System.out.println("Engenharia Civil: " + count20e25Engenharia + " alunos");
        
        System.out.println("\nCurso com menor média de idade: ");
        
        
        if ( mediaIdadeSistemas < mediaIdadeCiencia && mediaIdadeSistemas < mediaIdadeEngenharia )
            System.out.println("Sistemas de informação");
        else if ( mediaIdadeCiencia < mediaIdadeSistemas && mediaIdadeCiencia < mediaIdadeEngenharia)
            System.out.println("Ciencia da computação");
        else if ( mediaIdadeEngenharia < mediaIdadeSistemas && mediaIdadeEngenharia < mediaIdadeCiencia)
            System.out.println("Engenharia Civil");
        else 
            System.out.println("Todos os cursos tem média de idades iguais");
            
    }
    
}

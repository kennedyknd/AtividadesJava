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
public class Exercicioo17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] salario;
        int[] codigo;
        int funcionarios;
        double diferenca;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Quantos funcionários serão digitados?");
        funcionarios = leia.nextInt();
        
        codigo = new int[funcionarios + 1];
        salario = new double[funcionarios + 1];
        
        for ( int x = 1; x <= funcionarios; x++ ){
            System.out.println("Digite o código do cargo do " + x +  "ª funcionário: ");
            codigo[x] = leia.nextInt();
            System.out.println("Digite o salário do " + x + "ª funcionário ");
            salario[x] = leia.nextDouble();
            
        }
        for ( int x = 1; x <= funcionarios; x++ ){
            System.out.println("O funcionário com o código de cargo " + codigo[x] + " cujo salário era " + salario[x] + " R$");
            if ( codigo[x] == 101 ){
                diferenca = salario[x] * 0.05;
                salario[x] = salario[x] * 1.05;
            }
            else if ( codigo[x] == 102){
                diferenca = salario[x] * 0.075;
                salario[x] = salario[x] * 1.075;
            }
            else if ( codigo[x] == 103){
                diferenca = salario[x] * 0.1;
                salario[x] = salario[x] * 1.1;
            }
            else {
                diferenca = salario[x] * 0.15;
                salario[x] = salario[x] * 1.15;
            }
            System.out.println("Passou a receber " + salario[x] + " R$");
            System.out.println("A diferença do antigo para o novo salário é de " + diferenca + " R$\n");
            
        }
          
    }
    
}

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
public class Exercicios4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       int salario;
       int imposto;
       int salarioliq;
       
       salario = 100;
       imposto = 0;
       salarioliq = salario - imposto;
       
       System.out.println("Linha 1): Salário = " + salario + ", Imposto = " + imposto + ", Salário Líquido = " + salarioliq);
       System.out.println("Expressão: (SALLIQ >= 100,00) é: " + (salarioliq >= 100));
       
       salario = 200;
       imposto = 10;
       salarioliq = salario - imposto;
       
       System.out.println("\nLinha 2): Salário = " + salario + ", Imposto = " + imposto + ", Salário Líquido = " + salarioliq);
       System.out.println("Expressão: (SALLIQ < 190,00) é: " + (salarioliq < 190));
       
       salario = 300;
       imposto = 15;
       salarioliq = salario - imposto;
       
       System.out.println("\nLinha 3): Salário = " + salario + ", Imposto = " + imposto + ", Salário Líquido = " + salarioliq);
       System.out.println("Expressão: (SALLIQ = SALARIO - IR) é: " + (salarioliq == salario - imposto));
       
       
       
       
        
    }
    
}

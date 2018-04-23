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
public class Questao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int matricula, quantidadeLivros, diasAtraso;
        double valorMulta, valorPagar = 0;
        
        System.out.println("Informe sua matricula: ");
        matricula = leia.nextInt();
        
        System.out.println("Informe a quantidade de livros a serem devolvidos: ");
        quantidadeLivros = leia.nextInt();
        
        System.out.println("Informe o valor da multa por dia de atraso: ");
        valorMulta = leia.nextDouble();
        
        for ( int x = 0; x < quantidadeLivros; x++ ){
            System.out.println("Insira a quantidade de dias em atraso do " + ( x + 1)+ "ª livro");
            diasAtraso = leia.nextInt();
            valorPagar += diasAtraso * valorMulta;
        }
        
        System.out.println("O valor da multa a ser pago será de " + valorPagar + " R$");
        
    }
    
}

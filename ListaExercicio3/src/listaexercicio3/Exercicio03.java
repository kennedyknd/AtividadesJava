/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio3;

import java.util.Scanner;

/**
 *
 * @author Kennedy
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double n1, n2, media;
        String nome, novo;

        System.out.println("Calcular média do Aluno!");
        System.out.println("Digite o nome do aluno");

        Scanner leia = new Scanner(System.in);
        nome = leia.nextLine();

        do {
            do {
                System.out.println("\nDigite a nota 1: ");
                n1 = leia.nextDouble();
                if (n1 < 0 || n1 > 10) {
                    System.out.println("Nota inválida: ");
                }
            } while (n1 < 0 || n1 > 10);

            System.out.println("Nota digitada: " + n1);

            do {
                System.out.println("\nDigite a nota 2: ");

                n2 = leia.nextDouble();
                if (n2 < 0 || n2 > 10) {
                    System.out.println("Nota inválida: ");
                }
            } while (n2 < 0 || n2 > 10);

            System.out.println("Nota digitada: " + n2);

            media = (n1 + n2) / 2;

            System.out.println("\nA média do aluno " + nome + " foi " + media);

            if (media >= 7) {
                System.out.println("O aluno " + nome + " foi aprovado!");
            } else {
                System.out.println("O aluno " + nome + " foi reprovado!");
            }

            System.out.println("NOVO CALCULO? (S/N)");
            
            
            Scanner leianovo = new Scanner(System.in);
            novo = leianovo.nextLine();

        } while (novo.equals("S"));

    }

}

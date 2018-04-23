package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Collection {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        int resposta;
        do {
            System.out.println("========================");
            System.out.println("Informe um nome:");
            nomes.add(scan.next());
            do {
                System.out.println("\n===========================");
                System.out.println("Deseja informar outro nome?");
                try {
                    scan = new Scanner(System.in);
                    resposta = scan.nextInt();
                } catch (Exception x) {
                    System.out.println("\n==========================");
                    System.out.println("Não insira letras na resposta");
                    resposta = 9;
                }
                if (resposta != 0 && resposta != 1) {
                    System.out.println("Resposta Invalida!");
                }
            } while (resposta != 0 && resposta != 1);

        } while (resposta == 1);

        Collections.sort(nomes);
        System.out.println("\n=================");
        System.out.println(nomes);

    }

}

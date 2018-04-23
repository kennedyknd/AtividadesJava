/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo;

/**
 *
 * @author Douglas
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Estagiario estagiario1 = new Estagiario();

        estagiario1.setNome("Kennedy");
        estagiario1.setCpf("04962074156");
        estagiario1.setSalario(880.80);
        estagiario1.setFim_contrato("20 de Janeiro de 2020");

        Clinica clinica1 = new Clinica();

        clinica1.setNome("Alves Cuidados Médicos");
        clinica1.setCnpj("06696359000121");
        clinica1.setQuantidade_pacientes(20);

        System.out.print("O estagiário " + estagiario1.getNome());
        System.out.print(" de CPF " + estagiario1.getCpf());
        System.out.print(" possui um salário de " + estagiario1.getSalario() + " R$");
        System.out.print(" e seu contrato se encerra em  " + estagiario1.getFim_contrato());

        System.out.println("\n");

        System.out.print("A clinica " + clinica1.getNome());
        System.out.print(" de CNPJ " + clinica1.getCnpj());
        System.out.print(" possui " + clinica1.getQuantidade_pacientes() + " pacientes");

    }

}

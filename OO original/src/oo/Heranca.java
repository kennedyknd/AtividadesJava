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
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Kennedy");
        pessoa.setCpf("04962074156");
        
        System.out.println("O CPF de " + pessoa.getNome() + " é " + pessoa.getCpf());
        
        Aluno aluno = new Aluno();
        aluno.setNome("IgorViadinho");
        aluno.setCpf("123456789");
        aluno.setMatricula("016546645");
        
        System.out.println("O CPF de " + aluno.getNome() + " é " + aluno.getCpf() + " e sua matrícula é " + aluno.getMatricula());
        
    }
    
    
}

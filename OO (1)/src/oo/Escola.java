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
public class Escola extends Pessoa_Juridica{

    private String grau_escolaridade;
    private int quantidade_alunos;
    private int quantidade_funcionarios;

    public String getGrau_escolaridade() {
        return grau_escolaridade;
    }

    public void setGrau_escolaridade(String grau_escolaridade) {
        this.grau_escolaridade = grau_escolaridade;
    }

    public int getQuantidade_alunos() {
        return quantidade_alunos;
    }

    public void setQuantidade_alunos(int quantidade_alunos) {
        this.quantidade_alunos = quantidade_alunos;
    }

    public int getQuantidade_funcionarios() {
        return quantidade_funcionarios;
    }

    public void setQuantidade_funcionarios(int quantidade_funcionarios) {
        this.quantidade_funcionarios = quantidade_funcionarios;
    }
    
}
    


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
public class Clinica extends Pessoa_Juridica{

    private String categoria;
    private int quantidade_pacientes;
    private int quantidade_funcionarios;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade_pacientes() {
        return quantidade_pacientes;
    }

    public void setQuantidade_pacientes(int quantidade_pacientes) {
        this.quantidade_pacientes = quantidade_pacientes;
    }

    public int getQuantidade_funcionarios() {
        return quantidade_funcionarios;
    }

    public void setQuantidade_funcionarios(int quantidade_funcionarios) {
        this.quantidade_funcionarios = quantidade_funcionarios;
    }
    
    
}
    


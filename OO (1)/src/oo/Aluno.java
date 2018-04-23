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
public class Aluno extends Pessoa_Fisica{

    private String matricula;
    private String nome_escola_ensino_medio;
    private String cor_declarada;
    private String curso;
    private String semestre;
    private String data_matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome_escola_ensino_medio() {
        return nome_escola_ensino_medio;
    }

    public void setNome_escola_ensino_medio(String nome_escola_ensino_medio) {
        this.nome_escola_ensino_medio = nome_escola_ensino_medio;
    }

    public String getCor_declarada() {
        return cor_declarada;
    }

    public void setCor_declarada(String cor_declarada) {
        this.cor_declarada = cor_declarada;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getData_matricula() {
        return data_matricula;
    }

    public void setData_matricula(String data_matricula) {
        this.data_matricula = data_matricula;
    }
    
}
    


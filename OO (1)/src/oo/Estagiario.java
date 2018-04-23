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
public class Estagiario extends Funcionario{

    private String inicio_contrato;
    private String fim_contrato;
    private String instituicao_ensino;
    private String curso;
    private String matricula;
    private String semestre;
    private String modalidade_estagio;

    public String getInicio_contrato() {
        return inicio_contrato;
    }

    public void setInicio_contrato(String inicio_contrato) {
        this.inicio_contrato = inicio_contrato;
    }

    public String getFim_contrato() {
        return fim_contrato;
    }

    public void setFim_contrato(String fim_contrato) {
        this.fim_contrato = fim_contrato;
    }

    public String getInstituicao_ensino() {
        return instituicao_ensino;
    }

    public void setInstituicao_ensino(String instituicao_ensino) {
        this.instituicao_ensino = instituicao_ensino;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getModalidade_estagio() {
        return modalidade_estagio;
    }

    public void setModalidade_estagio(String modalidade_estagio) {
        this.modalidade_estagio = modalidade_estagio;
    }
    
}
    


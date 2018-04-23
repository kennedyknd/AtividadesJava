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
public class Diretor extends Funcionario{

    private String segmento_responsavel;

    public String getSegmento_responsavel() {
        return segmento_responsavel;
    }

    public void setSegmento_responsavel(String segmento_responsavel) {
        this.segmento_responsavel = segmento_responsavel;
    }
    
    public void definirAumento() {
       
       double aumentoFilhos = this.quantidadeFilhos * 150;
       double aumentoSalario = this.salario * 1.1;
       double salarioFinal = aumentoFilhos + aumentoSalario;
       
       this.salario = salarioFinal;
       
    }
    
    
}
    


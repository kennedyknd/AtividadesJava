/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author 17114290011
 */
public class ContaCorrente extends Conta{
    
    protected double limite;

    public ContaCorrente(double saldo) {
        super(saldo);
    }
    
    public ContaCorrente(double saldo, double limite) {
        super(saldo+limite);
    }
    
    
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public double getSaldo() {
       return saldo + limite;
    }

    public boolean Sacar(double quantia){
        
        double backup = this.saldo;
        
        backup -= quantia;
        backup -= ((0.2/100) * quantia);
        
        if ( backup >= 0 ){
            this.saldo = backup;
            return true;
        }
        else { 
            System.out.println("Não foi possível realizar um saque");
            return false;
        }
        
    }
    
}

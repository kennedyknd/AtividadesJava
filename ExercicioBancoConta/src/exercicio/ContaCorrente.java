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
    
    public ContaCorrente(double limite){
        this.limite = limite;
    }
    
    public ContaCorrente(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
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

    public void Sacar(double quantia){
        
        double backup = this.saldo;
        
        backup -= quantia;
        backup -= ((0.2/100) * quantia);
        
        if ( backup >= 0 ){
            this.saldo = backup;
            
        }
        else { 
            System.out.println("Não foi possível fazer um saque");
            
        }
        
    }
    
    public void Transferir ( double quantia, Conta destino){
        double backup = this.saldo;
        
        backup -= quantia;
        backup -= ((0.2/100) * quantia);
        
        if ( backup >= 0 ){
            this.saldo = backup;
            destino.saldo = quantia;
        }
        else { 
            System.out.println("Não foi possível realizar uma transferencia");
            
        }
        
    }
    
}

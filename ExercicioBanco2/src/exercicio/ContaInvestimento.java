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
public class ContaInvestimento extends Conta{

    public ContaInvestimento(double saldo) {
        super(saldo);
    }
    
    public boolean Depositar(double quantia) {
        
        if ( quantia >= 1000 ){
            this.saldo += quantia;
            return true;
        }
        else {
            System.out.println("Não foi possível depositar o valor desejado!");
            return false;
        }
    }

}

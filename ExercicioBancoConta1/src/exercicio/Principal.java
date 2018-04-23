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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ContaCorrente corrente = new ContaCorrente();
        corrente.setSaldo(400);
        corrente.setLimite(100);
        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.setSaldo(1000);
        ContaInvestimento investimento = new ContaInvestimento();
        investimento.setSaldo(1500);
        
        corrente.Transferir(500, poupanca);
        poupanca.Transferir(700, investimento);
        investimento.Transferir(500, corrente);
        corrente.Depositar(300);
        poupanca.Sacar(400);
        investimento.Depositar(1000);
        poupanca.Depositar(1000);
        poupanca.Transferir(1600, investimento);
        corrente.Transferir(700, poupanca);
        poupanca.Transferir(1700, investimento);
        corrente.Sacar(90);
        
        System.out.println("Saldo da conta corrente: " + corrente.getSaldo() + " R$");
        System.out.println("Saldo da conta investimento: " + investimento.getSaldo() + " R$");
        System.out.println("Saldo da conta poupanca: " + poupanca.getSaldo() + " R$");
        
    }
    
}

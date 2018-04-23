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
public class Conta {

    protected String banco;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean Sacar(double quantia) {

        double backup = this.saldo;

        backup -= quantia;
        backup -= ((0.1 / 100) * quantia);

        if (backup >= 0) {
            this.saldo = backup;
            return true;
        } else {
            System.out.println("Não foi possível realizar um saque");
            return false;
        }

    }

    public boolean Depositar(double quantia) {
        this.saldo += quantia;
        return true;

    }

    public boolean Transferir(double quantia, Conta destino) {
        
        boolean sucesso = this.Sacar(quantia);
        if ( !sucesso ){
            return false;
        }
        
        sucesso = destino.Depositar(quantia);
        if ( !sucesso ){
            this.saldo += quantia * 1.001;
            return false;
        }
        
        return true;
        
    }
}

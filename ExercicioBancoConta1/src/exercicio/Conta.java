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

    public void Sacar(double quantia) {

        double backup = this.saldo;

        backup -= quantia;
        backup -= ((0.1 / 100) * quantia);

        if (backup >= 0) {
            this.saldo = backup;

        } else {
            System.out.println("Não foi possível realizar um saque");

        }

    }

    public void Depositar(double quantia) {
        this.saldo += quantia;

    }

    public void Transferir(double quantia, Conta destino) {
        double backup = this.saldo;

        backup -= quantia;
        backup -= ((0.1 / 100) * quantia);

        if (backup >= 0) {
            this.saldo = backup;
            destino.saldo += quantia;
        } else {
            System.out.println("Não foi possível realizar uma transferencia");

        }

    }

}

package ex07;

public class Conta {

    protected String banco;
    protected String agencia;
    protected String numero;
    protected double saldo;

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        double valorSacado = valor * 1.001;

        if (valorSacado > this.saldo) {
            System.out.println("Não é possivel sacar valor maior que o saldo disponivel.");
            return false;
        } else {
            this.saldo -= valorSacado;
            return true;
        }
    }

    public boolean depositar(double valor) {

        this.saldo += valor;
        return true;
    }

    public boolean transferir(Conta contaDestino, double valor) {

        boolean sucesso = this.sacar(valor);
        if (sucesso) {
            sucesso = contaDestino.depositar(valor);

            if (!sucesso) {
                double valorSacado = valor * 1.001;
                this.saldo += valorSacado;
                return false;
            }
            return true;
        }

        return true;
    }
}

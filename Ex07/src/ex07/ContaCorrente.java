package ex07;

public class ContaCorrente extends Conta {

    private double limite;
    
    ContaCorrente(double saldo){
    this.saldo = saldo;
    }
    
    ContaCorrente(double saldo, double limite){
    this.saldo = saldo;
    this.limite = limite;
    }
    

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public double getSaldo() {

        return saldo + limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        double valorSacado = valor * 1.002;

        if (valorSacado > this.saldo) {
            System.out.println("Não é possivel sacar valor maior que o saldo disponivel.");
            return false;
        } else {
            this.saldo -= valorSacado;
            return true;
        }
    }

    public boolean transferir(Conta contaDestino, double valor) {

        boolean sucesso = this.sacar(valor);
        if (!sucesso) {
            return false;
        }

        sucesso = contaDestino.depositar(valor);
        if (!sucesso) {
            double valorSacado = valor * 1.002;
            this.saldo += valorSacado;
            return false;
        }
        return true;
    }

   
}


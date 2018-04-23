package ex07;

public class ContaInvestimento extends Conta {
    public ContaInvestimento(double saldo){
    this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean depositar(double valor) {
        if (valor < 1000) {
            System.out.println("Não é possível invistir menos de R$1000.");
            return false;
        }
        this.saldo += valor;
        return true;
    }

}

package ex07;

public class Ex07 {

    public static void main(String[] args) {

        ContaCorrente ContaCorrente = new ContaCorrente(400, 100);
        ContaPoupanca ContaPoupanca = new ContaPoupanca(1000);
        ContaInvestimento ContaInvestimento = new ContaInvestimento(1500);

        ContaCorrente.transferir(ContaPoupanca, 500);
        ContaPoupanca.transferir(ContaInvestimento, 700);
        ContaInvestimento.transferir(ContaCorrente, 500);
        ContaCorrente.depositar(300);
        ContaPoupanca.sacar(400);
        ContaInvestimento.depositar(1000);
        ContaPoupanca.depositar(1000);
        ContaPoupanca.transferir(ContaInvestimento, 1600);
        ContaCorrente.transferir(ContaPoupanca, 700);
        ContaPoupanca.transferir(ContaInvestimento, 1700);
        ContaCorrente.sacar(90);
        System.out.println("\n=============================");
        System.out.println("Saldo ContaCorrente: R$" + ContaCorrente.getSaldo());
        System.out.println("Saldo ContaPoupanca: R$" + ContaPoupanca.getSaldo());
        System.out.println("Saldo ContaInvestimento: R$" + ContaInvestimento.getSaldo());
    }

}

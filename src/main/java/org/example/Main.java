package org.example;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaCorrente(01, "Gabriel", 500.00);
        ContaBancaria conta2 = new ContaInvestimento(02, "Nathan", 500.00);
        ContaBancaria conta3 = new ContaInvestimentoAltoRisco(03, "Hugo", 25000.00);
        ContaBancaria conta4 = new ContaPoupanca(04, "Henrique", 500.00);
        ContaBancaria conta5 = new ContaSalario(05, "Rafael", 500.00);

        System.out.println("===================================");
        conta1.sacar(100.00);
        conta1.depositar(300.00);
        // conta1.sacar(1720.03);
        conta1.exibirInformacoes();
        System.out.println("===================================");
        conta2.sacar(100.00);
        conta2.exibirInformacoes();
        System.out.println("===================================");
        conta3.sacar(14000.27);
        conta3.exibirInformacoes();
        System.out.println("===================================");
        conta4.sacar(100.00);
        conta4.exibirInformacoes();
        System.out.println("===================================");
        conta5.sacar(100.00);
        conta5.sacar(100.00);
        conta5.exibirInformacoes();
        System.out.println("===================================");
    }
}
package org.example;

public class ContaInvestimentoAltoRisco extends ContaInvestimento{
    public ContaInvestimentoAltoRisco(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        try {
            double taxa = valor * 0.05;
            double total = valor + taxa;

            if (total > getSaldo())
                throw new IllegalArgumentException("Saldo insuficiente!");

            if (valor < 10000)
                throw new IllegalArgumentException("Saque mínimo é de R$10.000!");
            setSaldo(getSaldo() - total);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

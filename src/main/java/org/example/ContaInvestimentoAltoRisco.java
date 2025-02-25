package org.example;

public class ContaInvestimentoAltoRisco extends ContaInvestimento{
    private double minValor = 10000.00;
    public ContaInvestimentoAltoRisco(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        try {
            double taxa = valor * 0.05;
            double total = valor + taxa;

            if (valor < minValor)
                throw new IllegalArgumentException("Saque mínimo é de R$10.000!");

            if (total > getSaldo())
                throw new IllegalArgumentException("Saldo insuficiente!");

            setSaldo(getSaldo() - total);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

package org.example;

public class ContaInvestimento extends ContaBancaria {
    public ContaInvestimento(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        try {
            double taxa = valor * 0.02;
            double total = valor + taxa;

            if (total > getSaldo())
                throw new IllegalArgumentException("Saldo insuficiente!");
            setSaldo(getSaldo() - total);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
